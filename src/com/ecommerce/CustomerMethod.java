package com.ecommerce;

import com.model.Product;



public interface CustomerMethod {
	
	void viewAllProducts(Product product);
	Product searchProducts(String productName);
	Product searchProducts(double price);
	boolean addToShoppingCart(Product product);
	boolean removeFromShoppingCart(Product product);
	boolean buyProduct(String Creditcard,Product product);
	boolean updateCredit(String Creditcard,double limit);
	boolean updatequantity(int idPrduct);
	void reviewOrderHistory(int iduser);

}
