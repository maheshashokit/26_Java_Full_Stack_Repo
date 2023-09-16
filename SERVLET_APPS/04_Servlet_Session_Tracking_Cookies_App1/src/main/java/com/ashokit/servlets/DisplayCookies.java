package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//Get All the Cookies which we stored in browser
		System.out.println("Request::::::::::" + request);
		pw.println("<body bgcolor='#3cb371'>");
		pw.println("<h4 style='text-align:center;color:yellow;'>Welcome To Ashok IT For Session Tracking Displaying Cookies......</h4>");

		if (request != null && request.getCookies() != null) {

			Cookie[] cookies = request.getCookies();

			// processing the cookie array			
			pw.println("<table border='2' align='center'>");
			for (Cookie ck : cookies) {
				pw.println("<tr><td>" + ck.getName().toUpperCase() + "</td><td>" + ck.getValue() + "</td></tr>");
			}
			pw.println("<div style='text-align:center;color:yellow'><a href='index.html'>|Home Page|</a></div>");
			pw.println("</body>");
		}else {
			pw.println("<div>Browser is not activated With cookies GotoSettings and Activate it...</div>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
