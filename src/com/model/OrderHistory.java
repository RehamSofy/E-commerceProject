package com.model;

import java.io.Serializable;

public class OrderHistory implements Serializable{
	
	private int idOrderHistory;
    private int idProductOrder;
	private int idUser;
	private double price;
	private int quantity;
	
	
	public int getIdOrderHistory() {
		return idOrderHistory;
	}
	public void setIdOrderHistory(int idOrderHistory) {
		this.idOrderHistory = idOrderHistory;
	}
	public int getIdProductOrder() {
		return idProductOrder;
	}
	public void setIdProductOrder(int idProductOrder) {
		this.idProductOrder = idProductOrder;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
