package com.ashokit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
		 
		 PrintWriter pw = response.getWriter();
		 
		 //setting the data into request scope
		 request.setAttribute("Username", "Mahesh");
		 
		 //setting the data into Session scope
		 HttpSession session = request.getSession();
		 session.setAttribute("loginMessage", "Welcome To AshokIT");
		 
		 //setting the data into context scope
		 ServletContext context = getServletContext();
		 context.setAttribute("databaseName", "Oracle");
		 
		 //Redirecting the request 
		 RequestDispatcher rd = request.getRequestDispatcher("test.jsp");
		 rd.forward(request, response);
				 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
