package com.example.rest.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="customer")
public class Customer  implements UserDetails{
	
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private int customerId;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="customer_lname")
	private String customerLName;
	@Column(name="customer_email")
	private String customerEmail;
	@Column(name="customer_mobile")
	private long customerMobile;
	@Column(name="password")
	private String password;
	@Column(name="confirm_password")
	private String confirmPassword;
	@Column(name="gender")
	private String gender;
	@Column(name="aadhar_no",unique=true)
	private String customer_aadhar;
	@Column(name="product")
	private String product;
	@Column(name="cust_add1")
	private String customerAddress1;
	@Column(name="cust_add2")
	private String customerAddress2;
	@Column(name="CustomerCity")
	private String CustomerCity;
	@Column(name="pincode")
	private int  pincode;
	
	
	// Constructors
	// Default constructor
	public Customer() {}

	// Parameterized constructor
	public Customer(
			int customerId,
			String customerName,
			String customerEmail,
			long customerMobile,
			String password,
			String confirmPassword) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerMobile = customerMobile;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	// Getters and Setters
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public long getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getCustomerLName() {
		return customerLName;
	}

	public void setCustomerLName(String customerLName) {
		this.customerLName = customerLName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCustomer_aadhar() {
		return customer_aadhar;
	}

	public void setCustomer_aadhar(String customer_aadhar) {
		this.customer_aadhar = customer_aadhar;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCustomerAddress1() {
		return customerAddress1;
	}

	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}

	public String getCustomerAddress2() {
		return customerAddress2;
	}

	public void setCustomerAddress2(String customerAddress2) {
		this.customerAddress2 = customerAddress2;
	}

	public String getCustomerCity() {
		return CustomerCity;
	}

	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Customer(int customerId, String customerName, String customerLName, String customerEmail,
			long customerMobile, String password, String confirmPassword, String gender, String customer_aadhar,
			String product, String customerAddress1, String customerAddress2, String customerCity, int pincode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLName = customerLName;
		this.customerEmail = customerEmail;
		this.customerMobile = customerMobile;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.gender = gender;
		this.customer_aadhar = customer_aadhar;
		this.product = product;
		this.customerAddress1 = customerAddress1;
		this.customerAddress2 = customerAddress2;
		this.CustomerCity = customerCity;
		this.pincode = pincode;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
