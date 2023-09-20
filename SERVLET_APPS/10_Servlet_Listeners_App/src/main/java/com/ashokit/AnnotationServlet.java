package com.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="DemoServlet",value = {"/test","/demo"}, loadOnStartup = 2, initParams = {
		@WebInitParam(name="username",value = "ganesh"),
		@WebInitParam(name="password", value="ganesh")
})

public class AnnotationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public AnnotationServlet() {
		
		System.out.println("AnnotationServlet Class Constructor");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		System.out.println("Inside the service()................");
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<center>Welcome To Servlet Programming Through Annotation......");
		
		ServletConfig cg = getServletConfig();
		pw.println("Username:::::" + cg.getInitParameter("username"));
		pw.println("Password:::::" + cg.getInitParameter("password"));
	}

}
