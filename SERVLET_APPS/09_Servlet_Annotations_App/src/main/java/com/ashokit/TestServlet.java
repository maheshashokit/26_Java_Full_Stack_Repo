package com.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Testing",value={"/test","/demo"},initParams = {
		@WebInitParam(name="username",value="mahesh"),
		@WebInitParam(name="password",value="mahesh@123")
})
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<div style='text-align:center;color:red'>Welcome To Ashok IT.....</div>");
		
		String username = getServletConfig().getInitParameter("username");
		String password = getServletConfig().getInitParameter("password");
		pw.println("<div style='text-align:center;color:red'>"+username+"===="+password+"</div>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
