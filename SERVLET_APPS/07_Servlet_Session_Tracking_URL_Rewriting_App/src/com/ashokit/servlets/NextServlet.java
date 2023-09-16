package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//to get the existing the session object
		HttpSession session = request.getSession(false);
		
		String userName = (String)session.getAttribute("uname");
		String password = (String)session.getAttribute("pwd");
		String email = request.getParameter("email");
		pw.println("<body bgcolor='#3cb371'>");
		pw.println("<h4 style='text-align:center;color:yellow;'>Welcome To Ashok IT For Session Tracking Using URL Rewriting!!!!!</h4>");
		pw.println("<center style='color:white;'>");
		pw.println("Given UserName :"+ userName+"<br/>");
		pw.println("Given Password:"+ password+"<br/>");
		pw.println("Given Email:"+ email +"<br/>");		
		pw.println("</center>");
		pw.println("</body");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
