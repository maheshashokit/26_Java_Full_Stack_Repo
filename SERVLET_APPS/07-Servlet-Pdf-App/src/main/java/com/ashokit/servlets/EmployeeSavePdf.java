package com.ashokit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ashokit.dao.EmployeeDao;
import com.ashokit.dao.EmployeeDaoImpl;
import com.ashokit.model.Employee;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeSavePdf extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside the EmployeeSavePDF");
		try {
			//collecting the Hidden Parameter Value
			String selectedDepartmentName = request.getParameter("departmentName");
			
			// get the output stream for writing binary data in the response.
			ServletOutputStream os = response.getOutputStream();
			
			// set the response content type to PDF
			response.setContentType("application/pdf");
			//download popup header
			response.setHeader("Content-disposition", "attachment;filename=EmployeeInformation.pdf");

			//creating document class object
			Document document = new Document();
			
			//creating PdfWriter Object
			PdfWriter.getInstance(document, os);
			
			//meta information about document
			document.addAuthor("AshokIT Technologies");
			document.addCreationDate();
			document.addProducer();
			document.addCreator("Mahesh");
			document.addTitle("DemoPDF");
			document.setPageSize(PageSize.LETTER);			
			document.open();
			
			Font headingFontSize = new Font(FontFamily.TIMES_ROMAN,18,Font.BOLD,BaseColor.RED);			
			Paragraph paragraph = new Paragraph("Ashok IT Employee Information", headingFontSize);		
			paragraph.setAlignment(Element.ALIGN_CENTER);
			creteEmptyLine(paragraph, 2);//adding two lines of spacing
			document.add(paragraph);
						
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(80);
	        table.setWidths(new int[]{20,20,20,20});
	       
	        //Four colunms represented as four cells
	        Font boldFont = new Font(FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLUE);	
	        
	        PdfPCell c1 = new PdfPCell(new Phrase("Emp ID", boldFont));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			c1.setPadding(10);
			table.addCell(c1);

			PdfPCell c2 = new PdfPCell(new Phrase("Name",boldFont));
			c2.setHorizontalAlignment(Element.ALIGN_CENTER);
			c2.setPadding(10);
			table.addCell(c2);

			PdfPCell c3 = new PdfPCell(new Phrase("Email",boldFont));
			c3.setHorizontalAlignment(Element.ALIGN_CENTER);
			c3.setPadding(10);
			table.addCell(c3);

			PdfPCell c4 = new PdfPCell(new Phrase("Designation",boldFont));
			c4.setHorizontalAlignment(Element.ALIGN_CENTER);
			c4.setPadding(10);
			table.addCell(c4);
			
			//creating DAO class Object
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			
			//Getting the list of Employees
			List<Employee> employeeList =  new ArrayList<Employee>();
			if("All".equals(selectedDepartmentName)) {
			   employeeList = employeeDao.getAllEmployees();
		    }else {
		       employeeList = employeeDao.getAllEmployeeBasedOnDepartment(selectedDepartmentName);
		    }
			
			//Font class object with 9 size
			Font boldFontSize9 = new Font(FontFamily.TIMES_ROMAN, 9);
			employeeList.stream().forEach(emp ->{
				
				PdfPCell employeeIdCell = new PdfPCell(new Phrase(String.valueOf(emp.getEmployeeId()),boldFontSize9));
				employeeIdCell.setHorizontalAlignment(Element.ALIGN_CENTER);
				employeeIdCell.setPadding(7);
				table.addCell(employeeIdCell);
				
				PdfPCell employeeNameCell = new PdfPCell(new Phrase(String.valueOf(emp.getEmployeeName()),boldFontSize9));
				employeeNameCell.setHorizontalAlignment(Element.ALIGN_CENTER);
				employeeNameCell.setPadding(7);
				table.addCell(employeeNameCell);
		   	
				PdfPCell emailCell = new PdfPCell(new Phrase(String.valueOf(emp.getEmployeeEmail()),boldFontSize9));
				emailCell.setHorizontalAlignment(Element.ALIGN_CENTER);
				emailCell.setPadding(7);
				table.addCell(emailCell);
				
				PdfPCell departmentCell = new PdfPCell(new Phrase(String.valueOf(emp.getEmployeeDeparment()),boldFontSize9));
				departmentCell.setHorizontalAlignment(Element.ALIGN_CENTER);
				departmentCell.setPadding(7);
				table.addCell(departmentCell);
			});
			document.add(table);
			document.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doGet(request,response);
	}
	
	private static void creteEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}
}
