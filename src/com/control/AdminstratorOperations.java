package com.control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.ecommerce.AdminstratorMethod;
import com.model.CategoryProduct;
import com.model.Person;
import com.model.Product;
import com.util.UtilClass;

public class AdminstratorOperations implements AdminstratorMethod{

	UtilClass uc=new UtilClass();
	 ArrayList<Product> pro = new  ArrayList<Product>();
	 ArrayList<Product> produc = new  ArrayList<Product>();
	@Override
	public void addNewProduct(Product myProduct) {
		
		String query="insert into product (idProduct, Price, Name,Quantity,CategoryName ) values ('" + myProduct.getId() + "', '" + myProduct.getPrice() + "', '" + myProduct.getProductName() + "','"+myProduct.getQuantity()+"','"+myProduct.getProductCategory()+"')";
		
		uc.insertRecord(query);		
	}

	@Override
	public void removeProduct(int id) {
		
		String query ="delete from  product  where idProduct='" + id + "'";
		uc.DeleteRecord(query);
		
	}



	@Override
	public void removeProfile(int id) {
		
		String sql = "DELETE FROM person WHERE idUser='" +id+"'";
		uc.DeleteRecord(sql);
		
	}

	@Override
	public ArrayList<Person> viewAccounts() {
		
		ArrayList<Person> persons=new ArrayList<Person>();	    
		ResultSet resultSet=uc.getResultSet("select * from person");
		  
		    try {
	    		
	    	 while(resultSet.next()){
	    		 
	    	    	Person obj=new Person();
					obj.setId(resultSet.getInt("idUser"));
					obj.setFirstName(resultSet.getString("Fname"));
					obj.setLastName(resultSet.getString("Lname"));
					obj.setPassword(resultSet.getString("Password"));
					obj.setJob(resultSet.getString("Job"));
					obj.setEmail(resultSet.getString("Email"));
					obj.setCreditLimit(resultSet.getDouble("Credit_limit"));
					obj.setAddress(resultSet.getString("Address"));
					obj.setIsCustomer(resultSet.getInt("Status"));
					obj.setPhoneNumber(resultSet.getString("PhoneNumber"));
					obj.setCreditNumber(resultSet.getString("CreditNumber"));
					obj.setBirthday(resultSet.getDate("Birthday"));
					persons.add(obj);
				}
	    	 
	    	   //close connection
	    	    uc.closeConnection();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			   
		return persons;
	
	}

	@Override
	public void updateProduct(Product myProduct, int id) {	
			uc.updateRecord("update product set idProduct='" + myProduct.getId() + "' ,  Price='" +  myProduct.getPrice() + "', Name='" + myProduct.getProductName() + "',Quantity='"+myProduct.getQuantity()+"',CategoryName='"+myProduct.getProductCategory()+"'where idProduct='"+id+"' ");	
	}

	@Override
	public void ViewProduct(Product myProduct) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM product";
		ResultSet rs = uc.getResultSet(query);
		try {
			while(rs.next()){
				Product p = new Product();
				int id = rs.getInt("idProduct");
				double price = rs.getDouble("price");
				String name = rs.getString("Name");
				int quantity = rs.getInt("Quantity");
				String catname = rs.getString("CategoryName");
				p.setId(id);
				p.setPrice(price);
				p.setProductName(name);
				p.setQuantity(quantity);
				p.setProductCategory( catname);
				pro.add(p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public ArrayList<String> viewCategory () {
		
		String query = "SELECT * FROM `category_of_product`";
		ArrayList<CategoryProduct > cate = new  ArrayList<CategoryProduct >();
	 ResultSet catset  =	uc.getResultSet(query);
	  ArrayList <String>  catname =new ArrayList<String>();
		try {
			while(catset.next()){
				
				String s = catset.getString("idCategoryname");
				catname.add(s);
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
		}
		for(int i=0; i<catname.size();i++){
			
			
			System.out.println(catname);
		}
		return catname ;
		
	}

@Override
public void editProduct(int id) {
	// TODO Auto-generated method stub
	
}

}
