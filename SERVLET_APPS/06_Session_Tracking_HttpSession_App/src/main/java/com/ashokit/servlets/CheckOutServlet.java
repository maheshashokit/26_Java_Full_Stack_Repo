package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CheckOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//existing session object of the client
        HttpSession session = request.getSession(false);
        System.out.println("Session::::" + session);
        if(session != null) {
        	pw.println("<h4 style='text-align: center; color: red;'>Welcome To Ashok IT Items in Cart !!!!!!</h4>");
        	Enumeration<String> attributeNames = session.getAttributeNames();
        	pw.println("<table border='2' align='center'>");
        	pw.println("<tr><td>Item Name</td><td>Item Quantity</td><td>Price</td><td>Tota1 Item Value</td></tr>");
        	int totalBillAmount = 0;
        	while(attributeNames.hasMoreElements()) {
        		String keyName = attributeNames.nextElement(); //Item Name
        		String value  = (String)session.getAttribute(keyName); //Item Quantity
        		int quantity =  Integer.parseInt(value);
        		int itemValue = quantity * 100;
        		totalBillAmount += itemValue;
        		pw.println("<tr><td>"+keyName+"</td><td>"+value+"</td><td>100</td><td>"+itemValue+"</td></tr>");
        	}
        	pw.println("<tr><td colspan='4'>Total BillAmount "+totalBillAmount+"</td></tr>");
        	pw.println("</table>");
        }else {
        	pw.println("<h3 style='text-align:center;color:red;'>Session got Invalidated Due to Timeout!!!Please add Items again into Cart....</h3>");
        }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
