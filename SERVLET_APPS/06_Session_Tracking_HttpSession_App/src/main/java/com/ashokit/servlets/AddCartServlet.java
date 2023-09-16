package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//request parameters information
		String itemName = request.getParameter("item");
		String quantity = request.getParameter("quantity");
		
		//we need to get the session from container
		HttpSession session = request.getSession();
		System.out.println("Session Id ::::" + session.getId());
		
		//session.setMaxInactiveInterval(60);//1min

		//add data to session object
		session.setAttribute(itemName,quantity);
		
		//Adding Hyperlink to navigate cart page
		pw.println("<div style='text-align:center'>");
		pw.println("<h4>Your Item Added into Cart!!!!!!</h4><br/>");
		pw.println("<a href='index.html'>Cart Page</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href='checkout'>CheckOut Page</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
