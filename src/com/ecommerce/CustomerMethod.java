package com.ecommerce;

import java.util.ArrayList;

import com.model.Product;



public interface CustomerMethod {
	
	
	ArrayList<Product> searchProducts(String searchType);
	
	void viewAllProducts(Product product);
	boolean addToShoppingCart(Product product);
	boolean removeFromShoppingCart(Product product);
	boolean buyProduct(String Creditcard,Product product);
	boolean updateCredit(String Creditcard,double limit);
	boolean updatequantity(int idPrduct);
	void reviewOrderHistory(int iduser);

}
