package com.ashokit.jdbc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import oracle.jdbc.pool.OracleDataSource;

public class EnquiryForm extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField emailTextField;
	private JTextField contactTextField;
	private String name;
	private String emailId;
	private String contactNo;
	private String courseName;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnquiryForm frame = new EnquiryForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EnquiryForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To AshokIT Enquiry Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(141, 42, 361, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 0, 0));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(155, 123, 66, 30);
		contentPane.add(lblName);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(254, 123, 174, 29);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.RED);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmail.setBounds(155, 183, 66, 30);
		contentPane.add(lblEmail);
		
		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		emailTextField.setBounds(254, 184, 174, 29);
		contentPane.add(emailTextField);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setForeground(Color.RED);
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContact.setBounds(155, 250, 90, 30);
		contentPane.add(lblContact);
		
		contactTextField = new JTextField();
		contactTextField.setColumns(10);
		contactTextField.setBounds(254, 250, 174, 29);
		contentPane.add(contactTextField);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(Color.RED);
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCourse.setBounds(155, 323, 90, 30);
		contentPane.add(lblCourse);
		
		JComboBox courseDropdown = new JComboBox();
		courseDropdown.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				courseName = (String)courseDropdown.getSelectedItem();
			}
		});
		courseDropdown.setModel(new DefaultComboBoxModel(new String[] {"Select", "Java FullStack", "Python FullStack", "Dotnet FullStack", "React JS", "Angular JS", "Devops", "Html", "CSS", "JavaScript", "Spring", "Hibernate"}));
		courseDropdown.setBounds(254, 322, 174, 30);
		contentPane.add(courseDropdown);
		
		JButton btnNewButton = new JButton("Send Enquiry");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("This is Send Enquiry Button......");
				//Getting the values entered by users in different textfields
				name = nameTextField.getText();
				emailId = emailTextField.getText();
				contactNo = contactTextField.getText();
                Enquiry detailsEnquiry = new Enquiry(name, emailId, contactNo, courseName);
				boolean insertEnquryStatus = saveEnquiryDetails(detailsEnquiry);
				if(insertEnquryStatus) {
					JOptionPane.showMessageDialog(contentPane,"Enquiry Sent To AshokIT Team Will Getback to you soon.....");
					TestFrame tf = new TestFrame();
					tf.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(contentPane,"Something Went Wrong...Please Reach out To AshokIT Admin Team.....","Alert",JOptionPane.WARNING_MESSAGE);     
				}
			}
		});
		btnNewButton.setBounds(179, 409, 116, 21);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   System.out.println("This is Cancel Button.......");
			   nameTextField.setText("");
			   emailTextField.setText("");
			   contactTextField.setText("");
			   courseDropdown.setSelectedIndex(0);
			}
		});
		btnCancel.setBounds(305, 409, 103, 21);
		contentPane.add(btnCancel);
	}
	
	private boolean saveEnquiryDetails(Enquiry enquiry){
		
		OracleDataSource ods=null;
		try {
			ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			ods.setUser("system");
			ods.setPassword("manager");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        try(Connection con = ods.getConnection();
        	
        	PreparedStatement pstmt = con.prepareStatement("insert into maheshit_enquires values(maheshit_enquires_seq.nextval,?,?,?,?,?,?)")
           ){
        	
        	//setting values to placeholders
        	pstmt.setString(1, enquiry.getName());
        	pstmt.setString(2, enquiry.getEmailId());
        	pstmt.setString(3,enquiry.getContactNo());
        	pstmt.setString(4, enquiry.getCourseName());
        	pstmt.setTimestamp(5, new java.sql.Timestamp(new java.util.Date().getTime()));
        	pstmt.setString(6, "Mahesh");
        	
        	//executing the query
        	int rowCount = pstmt.executeUpdate();
        	
        	return rowCount != 0;
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return false;
	}
}
