package com.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.LoginDto;
import com.model.Person;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInServlet() {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String checkbox=request.getParameter("checkbox");
		if(checkbox=="on"){
			//forget password
		}
		else{
		LoginDto obj=new LoginDto();
		obj.setEmail(email);
		obj.setPassword(password);
		//call function
		PersonalOperation po=new PersonalOperation();
		Person person=new  Person();
		person=po.logIn(obj);	
		int flag=person.getIsCustomer();
		String name=person.getFirstName();
		
		//admin account
		if(flag==0){
			HttpSession session = request.getSession(true);
			session.setAttribute("emailAdmin",email);
			session.setAttribute("nameAdmin",name);
	    	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		    rd.forward(request,response);
			
		}
		//customer account
		else if(flag==1){
			HttpSession session = request.getSession(true);
			session.setAttribute("email",email);
			session.setAttribute("name",name);
	    	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	    	rd.forward(request,response);
			
		}
		//in valid account
		else if(flag==-1){
			RequestDispatcher rd=request.getRequestDispatcher("register.html");
	    	rd.forward(request,response);
		}
		}
	}

}
