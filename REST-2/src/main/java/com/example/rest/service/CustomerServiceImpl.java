package com.example.rest.service;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.rest.bean.Customer;
import com.example.rest.dao.ICustomerDao;

@Service
public class CustomerServiceImpl implements ICustomerService,UserDetailsService {
	
	// Injecting ICustomerDao using Field DI
	@Autowired
	private ICustomerDao customerDao;
	
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	
	// Get all customers
	@Override
	@Transactional
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	// Get customer by using id
	@Override
	@Transactional
	public Customer findById(int customerId) {
		return customerDao.findById(customerId);
	}

	// Save or update customer
	@Override
	@Transactional
	public Customer save(Customer theCustomer) {
		return customerDao.save(theCustomer);
	}

	// Delete customer using id
	@Override
	@Transactional
	public void deleteById(int customerId) {
		customerDao.deleteById(customerId);
	}

	
	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}
	
	
//	@Override
//    public Customer save(CustomerDto user) {
//		Customer newUser = new User();
//	    newUser.setUsername(user.getUsername());
//	    newUser.setFirstName(user.getFirstName());
//	    newUser.setLastName(user.getLastName());
//	    newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
//		newUser.setAge(user.getAge());
//		newUser.setSalary(user.getSalary());
//        return userDao.save(newUser);
//    }
	
	@Override
	public UserDetails loadUserByUsername(String CustomerEmail) throws UsernameNotFoundException {
		Customer cust = customerDao.findOne(CustomerEmail);
		if(cust == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(cust.getCustomerEmail(), cust.getPassword(), getAuthority());
	}

	public Customer findOne(String customerEmail) {
		// TODO Auto-generated method stub
		return customerDao.findOne(customerEmail);
	}
}
