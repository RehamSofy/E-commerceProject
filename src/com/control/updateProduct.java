package com.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Product;

/**
 * Servlet implementation class updateProduct
 */
@WebServlet("/updateProduct")
public class updateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out =response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String Name = request.getParameter("name");
		double price = Double.parseDouble(request.getParameter("price"));
		int Quantity = Integer.parseInt(request.getParameter("quantity"));
		String CategoryName = request.getParameter("category");
		out.println("welcome"+  CategoryName);
		Product p = new Product();
		p.setId(id);
		p.setProductName(Name);
		p.setPrice(price);
		p.setQuantity(Quantity );
		p.setProductCategory(CategoryName);
	System.out.println("done");
	out.println("welcome"+p.getProductName());
		
	    AdminstratorOperations m = new AdminstratorOperations();
		m.updateProduct(p, id);
		RequestDispatcher req =	request.getRequestDispatcher("Adminpage.jsp");
		req.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
