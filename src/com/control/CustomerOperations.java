package com.control;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.ecommerce.CustomerMethod;
import com.model.Contact;
import com.model.OrderHistory;
import com.model.Product;
import com.util.UtilClass;

public class CustomerOperations implements CustomerMethod{

	UtilClass uc=new UtilClass();
	@Override
	public void viewAllProducts(Product product) {
		
		
	}
	@Override
	public ArrayList<Product> searchProducts(String searchType)  {
		
		    ArrayList<Product> products=new ArrayList<Product>();
			ResultSet resultSet=uc.getResultSet("select * from product where Price='"+searchType+"'or Name='"+searchType+"'or CategoryName='"+searchType+"'");
		  
		    try {
	    		
	    	 while(resultSet.next()){
	    		 
	    	    	Product obj=new Product();
					obj.setId(resultSet.getInt("idProduct"));
					obj.setPrice(resultSet.getDouble("Price"));
					obj.setProductName(resultSet.getString("Name"));
					obj.setQuantity(resultSet.getInt("Quantity"));
					obj.setProductCategory(resultSet.getString("CategoryName"));
					products.add(obj);	
				}
	    	 
	    	   //close connection
	    	    uc.closeConnection();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		    catch(NullPointerException ne){
		    	
		    }
			   
		return products;
	}

	@Override
	public boolean addToShoppingCart(Product product) {
		
		return false;
	}

	@Override
	public boolean removeFromShoppingCart(Product product) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void updateCredit(int userId, double limit) {
		String query="update person set Credit_limit=Credit_limit-'"+limit+"'where idUser='"+userId+"' ";
	    uc.updateRecord(query);
	}

	

	

	@Override
	public void contactUS(Contact con) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void updateShopingCard(int userId) {
		// TODO Auto-generated method stub
		String query="delete from  shoppingcard  where fkUser='" + userId + "'and saving='"+0+"'";
		uc.DeleteRecord(query);	
		
	}
	@Override
	public void updatequantity(ArrayList<Product> products) {
		for(int i=0;i<products.size();++i){
		String query="update product set Quantity=Quantity-'"+products.get(i).getQuantity()+"'where idProduct='"+products.get(i).getId()+"' ";
	    uc.updateRecord(query);
		}
		
	}
	@Override
	public void SavingProduct(int idProduct) {
		String query="update product set saving='"+1+"'where idProduct='"+idProduct+"' ";
	    uc.updateRecord(query);
		
	}
	@Override
	public ArrayList<OrderHistory> reviewOrderHistory(int iduser) {
		  ArrayList<OrderHistory> orders=new ArrayList<OrderHistory>();
		    UtilClass uc=new UtilClass();
			ResultSet resultSet=uc.getResultSet("select * from `buyhistory` where fkUser_order= '" + iduser + "'");
		  
		    try {
	    		
	    	 while(resultSet.next()){
	    		 
	    		 OrderHistory ord = new  OrderHistory();
	    		   ord .setIdOrderHistory(resultSet.getInt("idorderHistory"));
					ord.setIdUser(resultSet.getInt("fkUser_order"));
					ord.setIdProductOrder(resultSet.getInt("fkProduct_order"));
					ord.setQuantity(resultSet.getInt("quantity"));
					ord.setPrice(resultSet.getDouble("price"));
					
					orders.add(ord);
				}
	    	 
	    	   //close connection
	    	    uc.closeConnection();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			   
		return  orders;
	}

}
