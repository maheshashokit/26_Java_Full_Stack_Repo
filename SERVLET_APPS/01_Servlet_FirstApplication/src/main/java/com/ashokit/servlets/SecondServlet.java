package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.Setting contentType 
		response.setContentType("text/html");
		
		//2.Preparing the response
		PrintWriter pw = response.getWriter();
		pw.println("<div style-'text-align:center;color:blue'>Welcome To AshokIT Login Page......</div>");
		pw.println("<form>");
		pw.println("<input type='text' name='email'/>");
		pw.println("<input type='text' name='pwd'/>");
		pw.println("<input type='submit' value='Login'/>");
		pw.println("</form>");
	}
}