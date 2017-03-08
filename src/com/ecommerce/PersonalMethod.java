package com.ecommerce;

import com.model.LoginDto;
import com.model.Person;


public interface PersonalMethod {
	
    boolean register(Person data);
	
	void editProfile(Person data);
	
	Person viewProfile(String Email);
	
	Person logIn(LoginDto data);
	
	


}
