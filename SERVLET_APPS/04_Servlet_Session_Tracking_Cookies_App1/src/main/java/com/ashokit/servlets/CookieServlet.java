package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		//collecting the request Parameters
		String fullName = request.getParameter("fullName");
		String emailId = request.getParameter("emailId");
		String contactNo = request.getParameter("contactNo");
		
		//creating the cookie object
		Cookie nameCookie = new Cookie("Name",fullName);
		nameCookie.setHttpOnly(true);
		nameCookie.setSecure(true);
		
		Cookie emailCookie = new Cookie("Email",emailId);
		emailCookie.setHttpOnly(true);
		emailCookie.setSecure(true);
		
		Cookie contactCookie = new Cookie("Contact",contactNo);
		contactCookie.setHttpOnly(true);
		contactCookie.setSecure(true);
		
		//adding the cookie to response object
		response.addCookie(nameCookie);
		response.addCookie(emailCookie);
		response.addCookie(contactCookie);
	
		pw.println("<body bgcolor='#3cb371'>");
		pw.println("<div style='text-align:center;color:yellow;'>Cookies Created Application and Stored in Browser......</div>");
		pw.println("<div style='text-align:center;'><a href='displayCookies'> ||Display Cookies||</a></div>");
		pw.println("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
