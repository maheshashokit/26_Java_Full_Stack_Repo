package com.ashokit.servlets;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.ashokit.dao.UserDao;
import com.ashokit.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class UserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private UserDao userDAO;
	
	public void init() {
		//Creating & Ready with UserDao Object
		userDAO = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath(); // 1)/ 2)/new
		System.out.println("action:::::" + action);

		try {
			switch (action) {
			case "/new": //adding new user form
				showNewForm(request, response);
				break;
			case "/insert": //inserting new user into db
				insertUser(request, response);
				break;
			case "/delete": //deleting the existing user..
				deleteUser(request, response);
				break;
			case "/edit": //showing existing user info in UI Screen
				showEditForm(request, response);
				break;
			case "/update": //Updating the existing user info into DB
				updateUser(request, response);
				break;
			default: //Showing the list of users in the UI Screen
				listUser(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		//Getting All the Users information from database
		List<User> listUser = userDAO.selectAllUsers();
		//sharing the users list information to JSP Page
		request.setAttribute("listUser", listUser);
		//forwarding the request to jsp page to display all users information in table format
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		//collecting the Request Parameter Value
		int id = Integer.parseInt(request.getParameter("id"));
		//Getting the existing user information i.e.,106
		User existingUser = userDAO.selectUser(id);
		//Redirecting the Request to user-form.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		//setting the existing user information in the request object
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		//collecting the request parameter information
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		//add form data into java object for saving data into database
		User newUser = new User(name, email, country);
		userDAO.insertUser(newUser);
		response.sendRedirect("list"); //list >>> URL pattern
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		//Collecting the Edited User information request parameters
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
        
		//setting updated user details into user object
		User updatedUser = new User(id, name, email, country);
		
		//performing the update user operation
		userDAO.updateUser(updatedUser);
		
		//redirecting the request
		response.sendRedirect("list");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		userDAO.deleteUser(id);
	    response.sendRedirect("list");

	}

}