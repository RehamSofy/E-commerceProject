package com.control;

import java.io.IOException;

import java.sql.ResultSet;
import java.util.concurrent.locks.StampedLock;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.jscape.inet.smtp.SmtpException;
//import com.jscape.inet.smtpssl.SmtpSsl;
import com.model.LoginDto;


/**
 * Servlet implementation class LogIn
 */
@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//int reqno=0;
		
		
	//	HttpSession session=request.getSession();
		String email=request.getParameter("Email");       //useremail
		String password=request.getParameter("Password");//userpassword
		
	//	String userClick=request.getParameter("submitcheckbox");//there userClick has two values(forgetPassword and Login)
	//	LoginDto data=new LoginDto();
	//	PersonalOperation po=new PersonalOperation();
	//	    data.setEmail(email);
		//    data.setPassword(password);
	        
		    if(request.getParameter("forgetPassword").equals("on")&&email!=null&& email.length()!=0 && password==null && password.length()==0){
				   if(!email.equals(email)){ //make sure that useremail is the same as email in database
					   request.setAttribute("msg","This Email Not Matched With UserEmail" );
			        	//printWriter.println("This Email Not Matched With UserEmail");
						getServletContext().getRequestDispatcher("LogIn.jsp").forward(request, response);
						
				//RequestDispatcher requsetDispatcher=		
			           }else{	
			            request.getServletContext().getRequestDispatcher("ForgetPassword.jsp").forward(request, response);	
			       }   
			    
		    
		    
	       }else if(!email.equals(null)||email!=""||!password.equals(null)||password!=""){//check email and password
		        HttpSession session=request.getSession();
		        LoginDto data=new LoginDto();
		        PersonalOperation po=new PersonalOperation();
		         data.setEmail(email);
		         data.setPassword(password);
		         if( po.logIn(data)){
			         
                  session.getAttribute("email");
			      session.getAttribute("password");
			//    RequestDispatcher requsetDispatcher=request.getRequestDispatcher("UserLogIn.java");
		//		requsetDispatcher.forward(request,response);
			     request.getServletContext().getRequestDispatcher("UserLogIn.java").forward(request, response);
		         }
				
				//the part of forgetPassword
		 //  }  else if(request.getParameter("forgetPassword").equals("on")&&email!=null&& email.length()!=0 && password==null && password.length()==0){
		     
		    //     }else if(!email.equals(email)){ //make sure that useremail is the same as email in database
				//	   request.setAttribute("msg","This Email Not Matched With UserEmail" );
			        	//printWriter.println("This Email Not Matched With UserEmail");
				//		getServletContext().getRequestDispatcher("LogIn.jsp").forward(request, response);
						
				//RequestDispatcher requsetDispatcher=		
			   //        }else{	
			   //         request.getServletContext().getRequestDispatcher("ForgetPassword.jsp").forward(request, response);	
			    //   }   
			   //  }
		     } else{
			//printWriter.println("Please check email/password");
				  request.setAttribute("msg","Please check email/password" );
					getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
					
			//RequestDispatcher requsetDispatcher=request.getRequestDispatcher("index.html");
			//requsetDispatcher.include(request, response);
	        }
		
		}
}
			
			
		
	
	

