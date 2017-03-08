package com.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.OrderHistory;

/**
 * Servlet implementation class orderhistory
 */
@WebServlet("/orderhistory")
public class orderhistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public orderhistory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		CustomerOperations co_object=new CustomerOperations();
		HttpSession session =  request.getSession();
	 	 int id =   (Integer)session.getAttribute("iduser");
		   ArrayList< OrderHistory> orderlist= co_object.reviewOrderHistory(id);
				
				request.setAttribute("orderList",orderlist);
				
				RequestDispatcher rd=request.getRequestDispatcher("orderhistory.jsp");
				
			    rd.forward(request,response);    
			    
			    for(int i =0; i<orderlist.size();i++ ){
			    	System.out.println(orderlist.get(i).getIdOrderHistory());
			    	
			    	
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
