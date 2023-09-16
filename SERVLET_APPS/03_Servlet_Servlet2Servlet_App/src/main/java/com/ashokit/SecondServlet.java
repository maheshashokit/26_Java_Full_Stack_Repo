package com.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// setting the contentType
		response.setContentType("text/html");

		// Getting writer Object
		PrintWriter pw = response.getWriter();

		// Preparing the response
		pw.println("<div style='color:green;'>Hyderabad........</div>");

		// Creating RequestDispatcher Object
		RequestDispatcher rd = request.getRequestDispatcher("/third");
		rd.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
