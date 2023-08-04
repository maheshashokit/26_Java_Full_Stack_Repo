package com.ashokit.collections;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DashboardFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardFrame frame = new DashboardFrame();
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
	public DashboardFrame() {
		setTitle("DashBoard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("User");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashboardFrame dbf  = new DashboardFrame();
				dbf.setVisible(true);
			}
		});
		btnNewButton.setBounds(312, 171, 109, 38);
		contentPane.add(btnNewButton);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdmin.setBounds(441, 171, 109, 38);
		contentPane.add(btnAdmin);
		
		JButton btnEmailActivities = new JButton("Email Activities");
		btnEmailActivities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEmailActivities.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEmailActivities.setBounds(588, 171, 109, 38);
		contentPane.add(btnEmailActivities);
	}

}
