package com.ashokit.jdbc;

public class Enquiry {

	private String name;

	private String emailId;

	private String contactNo;

	private String courseName;

	public Enquiry(String name, String emailId, String contactNo, String courseName) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.courseName = courseName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Enquiry [name=" + name + ", emailId=" + emailId + ", contactNo=" + contactNo + ", courseName="
				+ courseName + "]";
	}

}
