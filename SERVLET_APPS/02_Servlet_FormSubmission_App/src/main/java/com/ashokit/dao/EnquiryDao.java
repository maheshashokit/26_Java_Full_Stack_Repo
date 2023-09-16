package com.ashokit.dao;

import java.util.List;

public interface EnquiryDao {
	
	//creating new Enquiry information
	public boolean createEnquiry(Enquiry enquiry);
	
	//Getting All Enquires Information
	public List<Enquiry> getAllEnquires();

}
