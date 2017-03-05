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

import com.model.Person;

/**
 * Servlet implementation class profileServlet
 */
@WebServlet("/profileServlet")
public class profileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public profileServlet() {
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
		HttpSession hs=request.getSession();
		PersonalOperation obj=new PersonalOperation();
		String email=null;
		if(hs.getAttribute("email")!=null){
			System.out.println(hs.getAttribute("email"));
			email=(String) hs.getAttribute("email");
		}
		else if(hs.getAttribute("emailAdmin")!=null){
			System.out.println(hs.getAttribute("emailAdmin"));
			email=(String) hs.getAttribute("emailAdmin");
			
		}
		
		Person person=obj.viewProfile(email);
        request.setAttribute("data",person);
		RequestDispatcher rd=request.getRequestDispatcher("profile.jsp");
	    rd.forward(request,response); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
