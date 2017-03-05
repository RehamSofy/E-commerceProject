package com.control;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Person;
import java.util.ArrayList;


/**
 * Servlet implementation class removeAccountServelt
 */
@WebServlet("/removeAccountServelt")
public class removeAccountServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeAccountServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String id=request.getParameter("product_no");
		 //String index=request.getParameter("index");
		//String list=request.getParameter("list");
		//ArrayList<String> myList = new ArrayList<String>(Arrays.asList(list.split(",")));
		//ArrayList<Object> objectList = new ArrayList<Object>(myList);
		//ArrayList<Person>x=new ArrayList<Person>();	
		//function remove
		AdminstratorOperations obj=new AdminstratorOperations();
		obj.removeProfile(Integer.parseInt(id));
		//call view accounts
		ArrayList<Person>persons=obj.viewAccounts();
		request.setAttribute("accountList", persons);
        RequestDispatcher rd=request.getRequestDispatcher("ViewAccount.jsp");
	    rd.forward(request,response);
		
		
	}

}
