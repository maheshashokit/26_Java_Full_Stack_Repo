package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		response.setContentType("text/html");		
		PrintWriter pw = response.getWriter();
		
		pw.println("<body bgcolor='#3cb371'>");
		pw.println("<h4 style='text-align: center; color: yellow;'>Welcome To Ashok IT Session Tracking Using Hidden Form Fields!!!!</h4><hr/>");
		pw.println("<table border='2' align='center'");
		//It will displaying 5 Request Parameters Information.....
		Enumeration<String> parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			String requestParamName = (String) parameterNames.nextElement();
			String paramValue = request.getParameter(requestParamName);
			pw.println("<tr><td>"+requestParamName+"</td><td>"+paramValue+"</td></tr>");
		}
		pw.println("</table>");
		pw.println("</body>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
