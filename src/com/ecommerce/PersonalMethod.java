package com.ecommerce;

import com.model.LoginDto;
import com.model.Person;


public interface PersonalMethod {
	
    boolean register(Person data);
	
	boolean editProfile(Person data);
	
	boolean logIn(LoginDto data);


}
