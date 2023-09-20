package com.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class SessionListenerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SessionListenerServlet() {
       System.out.println("SessionListenerServlet Default Constructor......");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");		
		PrintWriter pw = response.getWriter();
		
		HttpSession session = request.getSession();		
		
		ServletContext context = getServletContext();
		context.setAttribute("username", "Mahesh");
		context.removeAttribute("username");
		
		pw.println("No Of Clients Connected to Application::::" + MySessionListener.getNoOfClientsConnected());
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("12323232");
	}

}
