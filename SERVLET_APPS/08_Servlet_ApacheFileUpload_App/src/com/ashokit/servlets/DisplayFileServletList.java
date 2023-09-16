package com.ashokit.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayFileServletList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<body bgcolor='#3cb371'>");
		pw.println("<h3 style=\"color: yellow; text-align: center;\">Welcome To Ashok IT Servlet File Downloading Application</h3>");
		pw.println("<table border='2' align='center'");
		pw.println("<tr><th>S.NO</th><th>FileName</th><th>Path</th> <th>Download Link</th></tr>");
		java.io.File[] files = (java.io.File[]) request.getAttribute("listOfFiles");
		int rowIndex = 1;
		for (File file : files) {
			pw.println("<tr><td>" + rowIndex + "</td><td>" + file.getName() + "</td><td>" + file.getAbsolutePath()
					+ "</td><td><a href=DownloadServlet?fileName=" + file.getName() + ">|Download|</a></td></tr>");
			rowIndex++;
		}
		pw.println("</table>");
		pw.println("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
