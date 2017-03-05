
package com.util;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.model.Person;
import com.model.Product;


public class UtilClass implements DBIntializer{
	
	private static Connection con;
	private static ResultSet resultSet;
	private static Statement statement;
	private static PreparedStatement preparedStatement; 
	
    public  Connection getConnection() {
        try {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
                
            }  catch (SQLException ex) {	
                System.out.println("Failed to create the database connection."); 
                 }
               catch (ClassNotFoundException ex) {
                       System.out.println("Driver not found"); 
               }
        return con;
    }
    
    public void closeConnection(){
    		try {
    			 if(preparedStatement!=null){
    				  preparedStatement.close();
    			 }
    		      if (resultSet != null){
    		          resultSet.close();
    		      }
    		      if (statement != null) {
    		          statement.close();
    		      }
    		      if (con != null){
    		          con.close();
    		      }
    		   }//end try 
    		     catch (Exception e){
    		      }  	
    }
    public ResultSet getResultSet(String query)  {  //select query
 	   
        try {
     	       Connection con = getConnection();
     	       statement = con.createStatement();
 		       resultSet = statement.executeQuery(query);
 		       
 	        } catch (SQLException e) {
 	    	       System.out.println("SQLException: - " + e);
 	         	   e.printStackTrace();
 	             
 	        }  	 
 	     return resultSet;
  }
    public void runInsertQuery(String query,Object data) {  
   	 
	    try{
	    	    Connection con = getConnection(); 
	    	    
	            preparedStatement = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
	         
	     
	           if(data.getClass().getName().equals("com.model.Person")){
	        	   
	            preparedStatement.setString(1,((Person) data).getFirstName());
	            preparedStatement.setString(2,((Person) data).getLastName());
	            preparedStatement.setString(3,((Person) data).getPassword());
	            preparedStatement.setString(4,((Person) data).getJob());
	            preparedStatement.setString(5,((Person) data).getEmail());
	            preparedStatement.setDouble(6,((Person) data).getCreditLimit());
	            preparedStatement.setString(7,((Person) data).getAddress());
	            preparedStatement.setInt(8,((Person) data).getIsCustomer());
	            preparedStatement.setString(9,((Person) data).getPhoneNumber());
	            preparedStatement.setString(10,((Person) data).getCreditNumber());
	            Date sqlDate = new java.sql.Date(((Person) data).getBirthday().getTime());
	            preparedStatement.setDate(11,sqlDate);
	            
	            
	          }
	        //   else if(data.getClass().getName().equals("com.model.Person")){
	        	   
	         //  }
	           preparedStatement.executeUpdate(); 
	           
	          
	       } catch (SQLException e) {
		          System.out.println("SQLException: - " + e);
		          e.printStackTrace();
	          }
	
		
 }
    public void insertRecord(String query){
    	 Connection con = getConnection(); 
    	 try {
    		  statement = (Statement) con.createStatement();
    		  statement.executeUpdate(query);
            } catch (SQLException ex) {
             Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
         }	
    }
   
  /*public int generateId(String query){
	  
	  Connection con = getConnection();
       try {
		statement = con.createStatement();
		resultSet = statement.executeQuery(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		return resultSet.getInt(1);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return 0;
       
	  
  }*/
   
  public void DeleteRecord(String query){
	  
	  Connection con = getConnection();
	  try {
		    statement = con.createStatement();
		    statement.executeUpdate(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  public void updateRecord(String query){
	  try{
		  Connection con = getConnection();
		  statement = con.createStatement();
		  statement.executeUpdate(query);
      } catch (SQLException ex) {
          Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
      }
	  
  }
    

}
