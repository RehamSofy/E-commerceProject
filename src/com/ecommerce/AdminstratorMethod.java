package com.ecommerce;

import java.util.ArrayList;

import com.model.Product;
import com.model.Person;

public interface AdminstratorMethod {
	
    void addNewProduct(Product myProduct);  
<<<<<<< HEAD
    boolean removeProduct(int id);
    public void updateProduct(Product myProduct, int id);
    public void ViewProduct(Product myProduct);
	ArrayList<Person> viewAccounts();
	void removeProfile(int id);
	
	
=======
	 void removeProduct(int id);
	    
	  void editProduct (int id);
>>>>>>> 85540a458e246683518df3b78a8e66e7f57f4689

}
