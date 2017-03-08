package com.control;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		
		
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String Password=request.getParameter("password");
		String job=request.getParameter("job");
		String address=request.getParameter("add");
		String creditNumber=request.getParameter("cn");
		String creditLimit=request.getParameter("cl");
		String birthday=request.getParameter("birthday");
		DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		Date date=null;
		try {
		        date = format.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int iscustomer=-1;
		HttpSession hs=request.getSession();
		   if(hs.getAttribute("emailAdmin")!=null){
			   iscustomer=0;
		   }
		   else{
			   iscustomer=1;
		   }
		Person person1=new Person();
		person1.setFirstName(firstname);
		person1.setLastName(lastname);
		person1.setPhoneNumber(phone);
		person1.setEmail(email);
		person1.setPassword(Password);
		person1.setJob(job);
		person1.setBirthday(date);
		person1.setAddress(address);
		person1.setCreditLimit(Double.parseDouble(creditLimit));
		person1.setCreditNumber(creditNumber);
		person1.setIsCustomer(iscustomer);
		//register function
		PersonalOperation p_operation=new PersonalOperation();
		p_operation.register(person1);
		
		//forword to log in
		if( iscustomer==1){
		RequestDispatcher req =	request.getRequestDispatcher("login.html");
		req.forward(request, response);}
		else if(iscustomer==0){
			RequestDispatcher req =	request.getRequestDispatcher("index.jsp");
			req.forward(request, response);
		}
		
		
	}

}
