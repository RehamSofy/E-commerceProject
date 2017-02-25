package com.ecommerce;

import com.model.Product;
import com.model.Person;

public interface AdminstratorMethod {
	
    boolean addNewProduct(Product myProduct);  
	
    boolean removeProduct(Product myProduct);
    
	boolean removePriceQuantity(Double price,int quantity);
	
	boolean editPriceQuantity(Double price,int quantity);
	
	Person reviewAllProfile();

}
