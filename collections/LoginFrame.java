package com.ashokit.collections;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel headerLabel = new JLabel("Welcome To Ashok IT Login Page !!!!!");
		headerLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		headerLabel.setForeground(Color.RED);
		headerLabel.setBounds(218, 90, 494, 32);
		contentPane.add(headerLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setForeground(Color.BLUE);
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		usernameLabel.setBounds(270, 179, 109, 24);
		contentPane.add(usernameLabel);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(389, 177, 243, 38);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(Color.BLUE);
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordLabel.setBounds(270, 258, 109, 24);
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(389, 252, 243, 45);
		contentPane.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				//login button action logic
				System.out.println("Inside the Login Button......");
				String username = usernameTextField.getText();
				String password = passwordField.getText();
				System.out.println(username+ "====" + password);
				if("Mahesh".equals(username) && "Mahesh".equals(password)) {
					DashboardFrame dbf  = new DashboardFrame();
					dbf.setVisible(true);
				}				
			}
		});
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		loginButton.setBounds(294, 429, 109, 38);
		contentPane.add(loginButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cancel button action logic
				System.out.println("Inside the Cancel Button....");
				usernameTextField.setText("");
				passwordField.setText("");
				 
			}
		});
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		cancelButton.setBounds(453, 429, 109, 38);
		contentPane.add(cancelButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Admin", "Student", "User"}));
		comboBox.setBounds(389, 324, 243, 38);
		contentPane.add(comboBox);
		
		JLabel roleLabel = new JLabel("Role");
		roleLabel.setForeground(Color.BLUE);
		roleLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		roleLabel.setBounds(270, 337, 109, 24);
		contentPane.add(roleLabel);
	}
}
