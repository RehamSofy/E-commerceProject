package com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private Date birthday;
	private String job;
	private String email;
	private double creditLimit;
	private String creditNumber;
	private String address;
	private int isCustomer;
	private String phoneNumber;	
	private ArrayList<OrderHistory> orderHistory;
	private ArrayList<Product> product;
	

	//Constructor
	public Person(){
		
	}
  
	public int getIsCustomer() {
		return isCustomer;
	}

	public void setIsCustomer(int isCustomer) {
		this.isCustomer = isCustomer;
	}

	public ArrayList<OrderHistory> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(ArrayList<OrderHistory> orderHistory) {
		this.orderHistory = orderHistory;
	}

	public ArrayList<Product> getProduct() {
		return product;
	}


	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getBirthday() {
		return birthday;
		
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getCreditLimit() {
		return creditLimit;
	}


	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}


	public String getCreditNumber() {
		return creditNumber;
	}


	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	



	
	
	

}
