package com.ashokit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.ashokit.dao.Enquiry;
import com.ashokit.dao.EnquiryDao;
import com.ashokit.dao.EnquiryDaoImpl;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayEnquiryDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EnquiryDao enquiryDao;

	@Override
	public void init(ServletConfig config) throws ServletException {
		enquiryDao = new EnquiryDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// setting contentType
		response.setContentType("text/html");
		// Preparing the writer object
		PrintWriter pw = response.getWriter();
	
		// getting all enquires information....
		List<Enquiry> enquriesInfo = enquiryDao.getAllEnquires();

		// displaying on screen
		pw.println("<table align='center' border='2'>");
		pw.println("<thead>");
		pw.println("<tr><th>Enquiry Name</th><th>Email-ID</th><th>ContactNo</th><th>CourseName</th></tr>");
		pw.println("</thead>");
		pw.println("<tbody>");
		enquriesInfo.stream().forEach(eachEnquiryObj -> {
			pw.println("<tr><td>" + eachEnquiryObj.getName() + "</td><td>" + eachEnquiryObj.getEmailId() + "</td><td>"
					+ eachEnquiryObj.getContactNo() + "</td><td>" + eachEnquiryObj.getCourseName() + "</td></tr>");
		});
		pw.println("</tbody>");
		pw.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
