package com.ashokit.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(value = "/testLogin")
public class TestFilter implements Filter {
   
    public TestFilter() {
       System.out.println("TestFilter Constructor.....");
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Inside doFilter");
		response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String username = request.getParameter("uname");
        String password = request.getParameter("pwd");
        if(username.length() == 0 || password.length() == 0) {          
        	pw.println("<div>Please Provide Input Data Correctly to process your request....</div>");
        }else {
        	chain.doFilter(request, response);
        }
	}	
}