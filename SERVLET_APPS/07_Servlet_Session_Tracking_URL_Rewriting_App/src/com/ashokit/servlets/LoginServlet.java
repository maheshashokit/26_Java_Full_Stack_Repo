package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		HttpSession session = request.getSession(true);
		//setting some data to the session object
		session.setAttribute("uname", uname);
		session.setAttribute("pwd",pwd);	

		pw.println("<body bgcolor='#3cb371'>");
		pw.println("<h4 style='text-align:center;color:yellow;'>Welcome To Ashok IT For Session Tracking Using URL Rewriting!!!!!</h4>");
		pw.println("<center><form action="+response.encodeURL("NextServlet")+">");
		pw.println("Email Id: <input type='text' name='email'/><br/>");
		pw.println("<input type='submit' value='Click'/>");
		pw.println("</form></center>");
		pw.println("</body");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
