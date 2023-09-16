package com.ashokit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.ashokit.dao.Enquiry;
import com.ashokit.dao.EnquiryDao;
import com.ashokit.dao.EnquiryDaoImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EnquiryDao enquiryDao;
	private ServletConfig config;
	
	public RegistrationServlet() {
		System.out.println("Registration Servlet Constructor......");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		//sending the above Enquiry object to DAO Class
		System.out.println("Inside the init()..........");
		enquiryDao = new EnquiryDaoImpl();
	    this.config = config;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			System.out.println("Inside the doPost(-,-)");
			//setting contentType
			response.setContentType("text/html");
			
			//Preparing the writer object
			PrintWriter pw = response.getWriter();
			
			//Gathering the Form Data
			String studentName = request.getParameter("studentName");
			String studentEmail = request.getParameter("studentEmail");
			String studentContactNo = request.getParameter("studentContactNo");
			String courseName = request.getParameter("courses");
			
			//Setting the form values into Java Object of Enquiry Class
			Enquiry enq = new Enquiry(studentName,studentEmail,studentContactNo,courseName);
			
			int c = 10/0;
			
			//calling the EnquiryDao Method
			boolean enquiryStatus = enquiryDao.createEnquiry(enq);
			
			if(enquiryStatus) {
				//Preparing the response data...
				pw.println("<div style='text-align:center;'>");
				pw.println("<h4 style='color:blue;'>Enquiry Received Admin Team will Get Back to you Soon.....</h4>");
				
				//Including the another Servlet Response into Current Servlet
				RequestDispatcher rd = request.getRequestDispatcher("/displayDetails");
				rd.include(request, response);
				
				pw.println("<br/><br/><a href='registration.html'>|HOME PAGE|</a>");
				pw.println("<div>");
			
			}
		}catch(Exception e) {
			//Including the another Servlet Response into Current Servlet
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("/errorDetails");
			rd.forward(request, response);
		}
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside the doGet(-,-)");
		doPost(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside the destroy()..........");
	}
}