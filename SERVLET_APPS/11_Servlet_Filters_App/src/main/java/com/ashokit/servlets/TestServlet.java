package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/testLogin")
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public TestServlet() {
		  System.out.println("TestServlet Default Constructor");
	  }
	  
	  @Override
	  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		  resp.setContentType("text/html");
		  PrintWriter pw = resp.getWriter();
		  
		  String username = req.getParameter("uname");
		  String password = req.getParameter("pwd");
		  
		  if("Naresh".equals(username) && "Naresh".equals(password)) {
			  pw.println("Login Success");
		  }else {
			  pw.println("Login Failure");
		  }
		  pw.println("<a href='index.html'> |Go Back| </a>");
	}
}
