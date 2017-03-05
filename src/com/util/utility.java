package com.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//import com.sun.istack.internal.logging.Logger;

public class utility  {
	public static  Connection connection()
    {
         Connection c = null;
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
           // Connection c = null;
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_db", "root", "");
            Statement st =c.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger( UtilClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger( UtilClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
   
	
}
