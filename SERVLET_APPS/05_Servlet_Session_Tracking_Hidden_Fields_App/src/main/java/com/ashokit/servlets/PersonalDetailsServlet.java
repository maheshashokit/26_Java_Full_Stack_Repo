package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PersonalDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		//gathering request parameters
		String fullName = request.getParameter("fullName");
		String emailId = request.getParameter("emailId");
		String contactNo = request.getParameter("contactNo");
		
		//constructing the form
		pw.println("<body bgcolor='#3cb371'>");
		pw.println("<h4 style='text-align: center; color: yellow;'>Welcome To Ashok IT Session Tracking Using Hidden Form Fields!!!!</h4>");
		pw.println("<form action='DisplayServlet' method='post'>");
		pw.println("<table align='center'>");
		pw.println("<tr><td>Qualification No</td><td><input type='text' name='qualification'/></td></tr>");
		pw.println("<tr><td>Gender</td><td><input type='radio' name='gender' value='Male'>Male <input type='radio' name='gender' value='Female'>Female</td></tr>");
		pw.println("<tr><td>&nbsp;</td><td><input type='submit' value='CompleteRequest'/></td></tr>");
		pw.println("</table>");
		
		//adding hidden fields to display complete information
		pw.println("<input type='hidden' name='fname' value='"+fullName+"'/>");
		pw.println("<input type='hidden' name='email' value='"+emailId+"'/>");
		pw.println("<input type='hidden' name='contact' value='"+contactNo+"'/>");
		
		pw.println("</form>");
		pw.println("</body>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
