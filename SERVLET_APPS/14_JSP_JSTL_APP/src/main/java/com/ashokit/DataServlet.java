package com.ashokit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		List<String> courseNames = new ArrayList<String>();
		courseNames.add("CoreJava");
		courseNames.add("AdvanceJava");
		courseNames.add("Spring");
		courseNames.add("SpringBoot");
		courseNames.add("Microservices");
		courseNames.add("Angular");
		courseNames.add("React");
		
		request.setAttribute("courseNames", courseNames);
		
		RequestDispatcher rd = request.getRequestDispatcher("courses.jsp");
		rd.forward(request, response);
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
