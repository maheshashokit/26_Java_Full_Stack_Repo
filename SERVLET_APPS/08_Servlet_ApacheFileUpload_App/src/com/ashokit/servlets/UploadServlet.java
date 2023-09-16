package com.ashokit.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.fileupload2.core.DiskFileItem;
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.jakarta.JakartaServletDiskFileUpload;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//constructor
	public UploadServlet() {
		System.out.println("ServletFileUploading................");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String contentType = request.getContentType();
		System.out.println("contentType::::" + contentType);
		
		DiskFileItemFactory factory = DiskFileItemFactory.builder().setPath(Paths.get("E:\\uploadedFiles\\")).setBufferSize(1024*1024).get();
				
		JakartaServletDiskFileUpload upload = new JakartaServletDiskFileUpload(factory);
		try {
			List<DiskFileItem> fileItems = upload.parseRequest(request);
			for (DiskFileItem item : fileItems) {
				if (!item.isFormField()) {
					String name = new File(item.getName()).getName();
					System.out.println("Name::::::::::" + name);
					item.write(Paths.get("E:\\uploadedFiles\\" + name));
				} else {
					if(item.getFieldName().equals("firstName")) {
						System.out.println("FirstName:::" + item.getString());
					}else if(item.getFieldName().equals("emailId")) {
						System.out.println("emailId:::" + item.getString());
					}else if(item.getFieldName().equals("contactNo")) {
						System.out.println("contactNo:::" + item.getString());
					}
				}
			}
			pw.println("File Upload Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Reading all files from required folder
		File readFolder = new File("E:\\uploadedFiles\\");
		File[] listFiles = readFolder.listFiles();
		//sharing all file information to another servlet using request Object
		request.setAttribute("listOfFiles", listFiles);
		
		//redirecting the request for displaying all files from the folder
		RequestDispatcher rd = request.getRequestDispatcher("DisplayFileServletList");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
