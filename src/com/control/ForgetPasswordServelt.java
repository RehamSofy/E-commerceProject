package com.control;

import java.io.IOException;
//import com.jscape.inet.imapssl.*;
//import com.jscape.inet.smtpssl.SmtpSsl;
//import com.jscape.inet.email.*;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.LoginDto;
import com.util.UtilClass;

/**
 * Servlet implementation class ForgetPasswordServelt
 */
@WebServlet("/ForgetPasswordServelt")
public class ForgetPasswordServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgetPasswordServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String password=request.getParameter("Password"); //for the other way (send email include the oldpassword)
	//    String oldPassword=request.getParameter("oldPassword");
		//String msg="";
		String newPassword=request.getParameter("newPassword");
		String reenterPassword=request.getParameter("reenterPassword");
		HttpSession session=request.getSession();	
		String currentPassword=(String)session.getAttribute("password");
		String currentEmail=(String)session.getAttribute("email");
	/* 
	 * other way by sending the forgetted password by email to the user 
		try{
		
		EmailMessage msg=new EmailMessage();
		msg.setFrom("admin@gmail.com");
		msg.setTo("email");
		msg.setSubject("E-commerceProject--ForgrtPassword");
	//	msg.setBody("your Password="+ password);
		
		SmtpSsl smtp=new SmtpSsl("smtp.gmail.com", 576);
		smtp.connect();
		smtp.login("admin@gmail.com", "123");
		smtp.send(msg);
		smtp.disconnect();
		}catch(Throwable ex){
			System.out.println("there is error");
			
		
		}
		*/
		//if(oldPassword.equals(null)|| oldPassword==""||newPassword.equals(null)|| newPassword=="" ||reenterPassword.equals(null)|| reenterPassword=="")
		if(newPassword.equals(null)|| newPassword=="" ||reenterPassword.equals(null)|| reenterPassword==""){
			request.setAttribute("msg","All Fields are mendatory");
			getServletContext().getRequestDispatcher("ForgetPassword.jsp").forward(request, response);
		}
		else if(!newPassword.equals(reenterPassword)) {
			request.setAttribute("msg","Password Does Not Match");
			getServletContext().getRequestDispatcher("ForgetPassword.jsp").forward(request, response);
		
					
	//	}
	//	else if(!currentPassword.equals(oldPassword)){
		//	request.setAttribute("msg","oldPassword is Not Match");
		//	getServletContext().getRequestDispatcher("ForgetPassword.jsp").forward(request, response);
			
	//	}
	} else {
			//set values to model class object 
			LoginDto data=new LoginDto();
			data.setEmail(currentEmail);
			data.setPassword(currentPassword);
			// call method to update 
			String sql="update person set password=? where Email=?";
			int i=UtilClass.resetPassword(data,sql);
			   if(i!=0){
				request.setAttribute("msg","Password updated successfully");
				getServletContext().getRequestDispatcher("LogIn.jsp").forward(request, response);
				
			      }
			      else{
				request.setAttribute("msg","Password not updated successfully try again");
				getServletContext().getRequestDispatcher("LogIn.jsp").forward(request, response);
				
				
				
			}
			
		}
	} 

}
