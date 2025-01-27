package com.example.rest.dao;

import java.util.List;

import com.example.rest.bean.Customer;

public interface ICustomerDao {
	public List<Customer> findAll();
	public Customer findById(int customerId);
	public Customer save(Customer theCustomer);
	public void deleteById(int customerId);
	public Customer findOne(String CustomerEmail);
	
}
