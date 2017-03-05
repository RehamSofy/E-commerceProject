package com.control;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ecommerce.CustomerMethod;
import com.model.Contact;
import com.model.Product;
import com.util.UtilClass;

public class CustomerOperations implements CustomerMethod{

	UtilClass uc=new UtilClass();
	@Override
	public void viewAllProducts(Product product) {
		
		
	}

	@Override
	public ArrayList<Product> searchProducts(String searchType)  {
		
		    ArrayList<Product> products=new ArrayList<Product>();
			ResultSet resultSet=uc.getResultSet("select * from product where Price='"+searchType+"'or Name='"+searchType+"'or CategoryName='"+searchType+"'");
		  
		    try {
	    		
	    	 while(resultSet.next()){
	    		 
	    	    	Product obj=new Product();
					obj.setId(resultSet.getInt("idProduct"));
					obj.setPrice(resultSet.getDouble("Price"));
					obj.setProductName(resultSet.getString("Name"));
					obj.setQuantity(resultSet.getInt("Quantity"));
					obj.setProductCategory(resultSet.getString("CategoryName"));
					//obj.setImage(resultSet.getBlob("Image"));
					products.add(obj);	
				}
	    	 
	    	   //close connection
	    	    uc.closeConnection();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		    catch(NullPointerException ne){
		    	
		    }
			   
		return products;
	}

	@Override
	public boolean addToShoppingCart(Product product) {
		
		return false;
	}

	@Override
	public boolean removeFromShoppingCart(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean buyProduct(String Creditcard, Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCredit(String Creditcard, double limit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatequantity(int idPrduct) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reviewOrderHistory(int iduser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contactUS(Contact con) {
		// TODO Auto-generated method stub
		
	}

}
