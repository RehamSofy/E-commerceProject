package com.ecommerce;

import java.util.ArrayList;
import com.model.Contact;
import com.model.OrderHistory;
import com.model.Product;



public interface CustomerMethod {
	
	
	ArrayList<Product> searchProducts(String searchType);
	void viewAllProducts(Product product);
	boolean addToShoppingCart(Product product);
	boolean removeFromShoppingCart(Product product);
	void updateShopingCard(int userId);
	void updateCredit(int userId,double limit);
	void updatequantity(ArrayList<Product>products);
	void SavingProduct(int idProduct);
	ArrayList< OrderHistory>reviewOrderHistory(int iduser);
	void contactUS(Contact con);
	

}
