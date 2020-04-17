package com.example.rest.bean;

public class CustomerDto {
	private int customerId;
	private String customerName;
	private String customerLName;
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
	public String getCustomerLName() {
		return customerLName;
	}
	public CustomerDto() {
		super();
	}
	public CustomerDto(int customerId, String customerName, String customerLName, String customerEmail,
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
		CustomerCity = customerCity;
		this.pincode = pincode;
	}
	public void setCustomerLName(String customerLName) {
		this.customerLName = customerLName;
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
	private String customerEmail;
	private long customerMobile;
	private String password;
	private String confirmPassword;
	private String gender;
	private String customer_aadhar;
	private String product;
	private String customerAddress1;
	private String customerAddress2;
	private String CustomerCity;
	private int pincode;
}
