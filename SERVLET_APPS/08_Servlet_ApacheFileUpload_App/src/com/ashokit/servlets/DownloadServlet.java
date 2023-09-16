package com.ashokit.servlets;

import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  String fileName = request.getParameter("fileName");
		  
		  response.setContentType("application/octet-stream");   
		  response.setHeader("Content-Disposition","attachment; filename=\"" + fileName + "\"");   
		  byte[] bufferData = new byte[1024];
		  try (ServletOutputStream os = response.getOutputStream();
			   FileInputStream fileInputStream = new FileInputStream("E:\\uploadedFiles\\" + fileName);) {
	
			    int read=0;
				while((read = fileInputStream.read(bufferData))!= -1){
					os.write(bufferData, 0, read);
				}
				os.flush();
		   } catch (Exception e) {
				e.printStackTrace();
		   }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
