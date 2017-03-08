package com.control;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecommerce.PersonalMethod;
import com.model.LoginDto;
import com.model.Person;
import com.util.UtilClass;

public class PersonalOperation implements PersonalMethod{

	
	UtilClass uc=new UtilClass();
	@Override
	public boolean register(Person data) {
		
		Object generalObject=new  Object();
		generalObject=data;
		uc.runInsertQuery("INSERT INTO person (Fname,Lname,Password,Job,Email,Credit_limit,Address,Status,PhoneNumber,CreditNumber,Birthday) VALUES (?,?,?,?,?,?,?,?,?,?,?)",generalObject);
		
		return false;
	}

	@Override
	public void editProfile(Person data) {
		
		Date sqlDate = new java.sql.Date(((Person) data).getBirthday().getTime());
		String query="update person set Fname='" + data.getFirstName() + "' ,  Lname='" + data.getLastName() + "', Password='" + data.getPassword() + "', Job='"+data.getJob()+"', Email='"+data.getEmail()
		+"' ,Credit_limit='"+data.getCreditLimit()+"' , Address='"+data.getAddress()+"' , PhoneNumber='"+data.getPhoneNumber()+"' , CreditNumber='"+
				data.getCreditNumber()+"' , Birthday='"+sqlDate+"'where idUser='"+data.getId()+"'";
		uc.updateRecord(query);
		
	}

	@Override
	public Person logIn(LoginDto data) {
		
		Person person=new Person();
		ResultSet rs=uc.getResultSet("select Fname,Status,idUser from person where Email='"+data.getEmail()+"'AND Password='"+data.getPassword()+"'");
		try {
			if(rs.next()){
				//valid account
				person.setIsCustomer(rs.getInt("Status"));
				person.setFirstName(rs.getString("Fname"));	
				person.setId(rs.getInt("idUser"));
			}
			else{
				//not valid
				person.setIsCustomer(-1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}

	@Override
	public Person viewProfile(String Email) {
		Person person=new Person();
		ResultSet rs=uc.getResultSet("select * from person where Email='"+Email+"'");
		try {
			if(rs.next()){
				//valid account
				person.setId(rs.getInt("idUser"));
				person.setFirstName(rs.getString("Fname"));
				person.setLastName(rs.getString("Lname"));
				person.setPassword(rs.getString("Password"));
				person.setAddress(rs.getString("Address"));
				person.setJob(rs.getString("Job"));
				person.setEmail(rs.getString("Email"));
				person.setCreditLimit(rs.getDouble("Credit_limit"));
				person.setCreditNumber(rs.getString("CreditNumber"));
				person.setBirthday(rs.getDate("Birthday"));
				person.setIsCustomer(rs.getInt("Status"));
				person.setPhoneNumber(rs.getString("PhoneNumber"));		
			}
			else{
			    //not data 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
		
		
	}

}
