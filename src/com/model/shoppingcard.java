package com.model;

import java.io.Serializable;

public class shoppingcard implements Serializable{
	
	 private int iduser;
	 private int idproduct;
	 
	 public shoppingcard(){
		 
	 }
	public int getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	
	
	
	
	

}
