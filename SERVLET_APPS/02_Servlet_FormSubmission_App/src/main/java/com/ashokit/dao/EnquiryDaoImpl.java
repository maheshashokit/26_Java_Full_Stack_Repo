package com.ashokit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EnquiryDaoImpl implements EnquiryDao {
	
	//This is common for every DAO method in the class
	private static Connection con = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean createEnquiry(Enquiry enquiry) {
		boolean enquiryStatus = false;
		
		try(PreparedStatement pstmt = con.prepareStatement("insert into ashokit_enquires values(ashokit_enquires_seq.nextval,?,?,?,?,?,?)")){
			
			//setting the values
			pstmt.setString(1, enquiry.getName());
			pstmt.setString(2, enquiry.getEmailId());
			pstmt.setString(3, enquiry.getContactNo());
			pstmt.setString(4, enquiry.getCourseName());
			pstmt.setDate(5, new java.sql.Date(new java.util.Date().getTime()));
			pstmt.setString(6, enquiry.getName());
			
			//executing the query 
			int rowCount = pstmt.executeUpdate();
			
			//setting value to enquiryStatus
			enquiryStatus = rowCount > 0; 
			
			return enquiryStatus;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return enquiryStatus;
	}
	
	@Override
	public List<Enquiry> getAllEnquires() {
		List<Enquiry> enquiryList = new ArrayList<>();
		try(Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select enquiry_name,enquiry_emailid,enquiry_contactno,enquriy_course from ashokit_enquires");){
			
			//processing the ResultSet
			while(rs.next()) {
				//Preparing Enquiry Object based on current Row in ResultSet...
				Enquiry enquiry = new Enquiry(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				
				//adding the current enquiry object into ArrayList
				enquiryList.add(enquiry);
			}
			
		}catch(Exception e) {
			System.out.println("Exception Occurred in getAllEnquires().....");
			e.printStackTrace();
		}
		
		return enquiryList;
	}

}
