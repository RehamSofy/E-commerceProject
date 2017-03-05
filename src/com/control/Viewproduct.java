package com.control;
import com.model.*;
import com.util.UtilClass;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Viewproduct
 */
@WebServlet("/Viewproduct")
public class Viewproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Viewproduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 ResultSet set ;
		 ArrayList<Product> pro = new  ArrayList<Product>();
		UtilClass utill = new UtilClass ();
		
		
		String query = "SELECT * FROM product"; 
		set = utill.getResultSet(query);
		try{
			while(set.next()){
				Product p = new Product();
				int id = set.getInt("idProduct");
				double price = set.getDouble("Price");
				String name = set.getString("Name");
				int quantity = set.getInt("Quantity");
				String catname = set.getString("CategoryName");
				p.setId(id);
				p.setPrice(price);
				p.setProductName(name);
				p.setQuantity(quantity);
				p.setProductCategory( catname);
				pro.add(p);
			}
			set.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			request.setAttribute("productData", pro);
			RequestDispatcher req =	request.getRequestDispatcher("displayProduct.jsp");
			req.forward(request, response);
			
			
			
		}
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
