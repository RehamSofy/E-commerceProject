
package com.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
  
   
  
    

}
