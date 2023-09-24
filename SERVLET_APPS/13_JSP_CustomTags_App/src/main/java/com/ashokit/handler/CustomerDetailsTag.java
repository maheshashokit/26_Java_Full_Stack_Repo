package com.ashokit.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ashokit.beans.Customer;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class CustomerDetailsTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	List<Customer> customerList = Collections.EMPTY_LIST;

	public List<Customer> getCustomerDetails() {

		Customer c = new Customer("01", "Ganesh", "Vizag");
		Customer c1 = new Customer("02", "Naresh", "Hyderabad");
		Customer c2 = new Customer("03", "Kumar", "Pune");
		Customer c3 = new Customer("04", "Avinash", "Bangalore");

		customerList = new ArrayList<Customer>();
		customerList.add(c);
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);

		return customerList;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		customerList = getCustomerDetails();
		try {
			writer.println("<table border='2'  align='center'>");
			writer.println("<tr><th>CustomerID</th><th>CustomerName</th><th>CustomerLocation</th></tr>");
			for (Customer c : customerList) {
				writer.println("<tr><td>" + c.getCustomerId() + "</td><td>" + c.getCustomerName() + "</td><td>"
						+ c.getCustomerLocation() + "</td></tr");
			}
			writer.println("</table>");
		} catch (IOException ie) {
			System.out.println("Display error while printing the customer details");
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

}
