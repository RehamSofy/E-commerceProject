package com.controller;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;

import com.ecommerce.*;
import com.model.CategoryProduct;
import com.model.Product;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.util.UtilClass;
import com.util.utility;

import java.util.logging.Level;
import java.util.logging.Logger;
public  class Admin implements AdminstratorMethod {
	
	
	 ArrayList<Product> pro = new  ArrayList<Product>();
	 ArrayList<Product> produc = new  ArrayList<Product>();
	 
	 ArrayList<CategoryProduct > cate = new  ArrayList<CategoryProduct >();
     UtilClass x = new  UtilClass ();
	 static  Connection con;
	    static PreparedStatement preStmt;
	    static ResultSet result;
	  static  ResultSet set;
	  static  ResultSet results;
	    static Statement stmt;
	    static ResultSet catset;
	@Override
	public void addNewProduct(Product myProduct) {
		
		 try {
	            con = (Connection) utility.connection();
	            
	            
	            stmt = (Statement) con.createStatement();
	            stmt.executeUpdate("insert into product (idProduct, Price, Name,Quantity,CategoryName ) values ('" + myProduct.getId() + "', '" + myProduct.getPrice() + "', '" + myProduct.getProductName() + "','"+myProduct.getQuantity()+"','"+myProduct.getProductCategory()+"')");
	        } catch (SQLException ex) {
	            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
	        }
	               
	}
	public void ViewProduct(Product myProduct){
		String query = "SELECT * FROM product";
		set = x.getResultSet(query);
		try {
			while(set.next()){
				Product p = new Product();
				int id = set.getInt("idProduct");
				double price = set.getDouble("price");
				String name = set.getString("Name");
				int quantity = set.getInt("Quantity");
				String catname = set.getString("CategoryName");
				p.setId(id);
				p.setPrice(price);
				p.setProductName(name);
				p.setQuantity(quantity);
				p.setProductCategory( catname);
				pro.add(p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	@Override
	public void removeProduct(int id) {
		// TODO Auto-generated method stub
		
		String query ="delete from  product  where idProduct='" + id + "'";
		x.removeQuery(query);
	}
	@Override
	public void editProduct(int id) {
		// TODO Auto-generated method stub
		
		
		
	}
	public void updateProduct(Product myProduct, int id) {
		
		 try {
	            con = (Connection) utility.connection();
	            
	            
	            stmt = (Statement) con.createStatement();
	            stmt.executeUpdate("update product set idProduct='" + myProduct.getId() + "' ,  Price='" +  myProduct.getPrice() + "', Name='" + myProduct.getProductName() + "',Quantity='"+myProduct.getQuantity()+"',CategoryName='"+myProduct.getProductCategory()+"'where idProduct='"+id+"' ");
	           // stmt.executeUpdate("insert into product (idProduct, Price, Name,Quantity,CategoryName ) values ('" + myProduct.getId() + "', '" + myProduct.getPrice() + "', '" + myProduct.getProductName() + "','"+myProduct.getQuantity()+"','"+myProduct.getProductCategory()+"')");
	        } catch (SQLException ex) {
	            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
	        }
	               
	}
      public ArrayList<String> viewCategory () {
		
		String query = "SELECT * FROM `category_of_product`";
	  catset  =	x.getResultSet(query);
	  ArrayList <String>  catname =new ArrayList<String>();
		try {
			while(catset.next()){
				
				String s = catset.getString("idCategoryname");
				catname.add(s);
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
		}
		for(int i=0; i<catname.size();i++){
			
			
			System.out.println(catname);
		}
		return catname ;
		
	}
	
	

	

}
