package com.example.rest.bean;

public class AuthToken {
	public AuthToken(String customerEmail, String token) {
		super();
		this.customerEmail = customerEmail;
		this.token = token;
	}
	private String customerEmail;
	private String token;
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public AuthToken() {
		super();
	}
}
