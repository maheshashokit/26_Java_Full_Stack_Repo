package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		System.out.println("Inside the FirstServlet........");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// we need to write logic for generating response dynamically

		// 1.We need to inform to browser for rendering HTML Code
		response.setContentType("text/html"); // application/json, application/xml,

		// 2.writing logic into response object
		PrintWriter pw = response.getWriter();
		pw.println("<center>Welcome To Servlet Programming......</center>");
		pw.println("<div style='text-align:center;color:green;'>Welcome To AshokIT Servlet Programming.......</div>");
		pw.println("<div style='text-align:center;color:blue;'>Current Date::::" + LocalDateTime.now() + "</div>");

		// 3.collecting the request Parameters
		String usernameValue = request.getParameter("username");
		String emailValue = request.getParameter("emailId");
		String[] username = request.getParameterValues("username");
		if (usernameValue != null && emailValue != null) {
			pw.println("<center>Data Received From Client :::::" + usernameValue + "</center>");
			pw.println("<center>Data Received From Client :::::" + emailValue + "</center>");
		}

		// second style of collecting the Request Parameters
		/*
		 * Map<String, String[]> parameterMap = request.getParameterMap();
		 * System.out.println(parameterMap); //process the map object using Java8
		 * parameterMap.entrySet().forEach(eachEntry->{
		 * pw.println("<center>"+eachEntry.getKey()+"--->"+
		 * Arrays.toString(eachEntry.getValue())+"</center>"); }); pw.println(
		 * "<center>.................................................</center>");
		 * parameterMap.forEach((key,value)->{ pw.println("<center>"+key+"--->"+
		 * Arrays.toString(value)+"</center>"); });
		 */

		// Third style of Collecting the Request parameters
		Enumeration<String> requestParameterNames = request.getParameterNames();
		while (requestParameterNames.hasMoreElements()) {
			// current request Parameter
			String currentRequestParamName = requestParameterNames.nextElement();
			String[] parameterValues = request.getParameterValues(currentRequestParamName);
			pw.println("<center>" + currentRequestParamName + "--->" + Arrays.toString(parameterValues) + "</center>");
		}

	}
}