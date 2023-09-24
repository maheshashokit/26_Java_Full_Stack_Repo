package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.ashokit.dao.EmployeeDao;
import com.ashokit.dao.EmployeeDaoImpl;
import com.ashokit.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetEmployeesInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  response.setContentType("text/html");
		  PrintWriter pw = response.getWriter();
		  
		  //request parameter value
		  String departmentName  = request.getParameter("departmentName");
		  
		  //creating EmployeeDao Class Object
		  EmployeeDao employeeDao = new EmployeeDaoImpl();
		 
		  List<Employee> employeeList = new ArrayList<Employee>();
		  if("All".equals(departmentName)) {
			  employeeList = employeeDao.getAllEmployees();
		  }else {
		    employeeList = employeeDao.getAllEmployeeBasedOnDepartment(departmentName);
		  }
		 
		  
		  if(!employeeList.isEmpty() && employeeList.size() > 0) {
			  pw.println("<table align='center' border='2'>");
			  pw.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Email</th><th>Employee Designation</th></tr>");
			  //processing employeeList object using Java8 Streams
			  employeeList.stream().forEach(employee -> {
				 pw.println("<tr><td>"+employee.getEmployeeId()+"</td><td>"+employee.getEmployeeName()+"</td><td>"+employee.getEmployeeEmail()+"</td><td>"+employee.getEmployeeDeparment()+"</td></tr>");				
			  });
			  pw.println("</table>");
		  }else {
			  pw.println("<span>Employee List is Not Available For Given Department</span>");
		  }
	}

}
