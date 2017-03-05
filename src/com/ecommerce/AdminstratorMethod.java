package com.ecommerce;

import com.model.Product;
import com.model.Person;

public interface AdminstratorMethod {
	
    void addNewProduct(Product myProduct);  
	 void removeProduct(int id);
	    
	  void editProduct (int id);

}
