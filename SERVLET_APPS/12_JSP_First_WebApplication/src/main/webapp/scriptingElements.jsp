<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1", import="", session="true", errorPage="" ,%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>scriptingElements.jsp</title>
</head>
<body>

  <%!
     String applicationName ="Welcome To Ashok IT";
     public String validateLogin(String username,String password){
	      if("Mahesh".equals(username) && "Mahesh".equals(password)){
	    	  return "Login Success";
	      } else{
	    	  return "Login Failure";
	      }
     }
  %>
  
  <%
     String applicationName ="Welcome To Mahesh IT.....";
  	 String login_status = validateLogin("Mahesh", "Mahesh");
     out.println("Login Status::::" + login_status);
     out.println("ApplicatioName:::::" + applicationName);
     out.println("ApplicatioName:::::" + this.applicationName);
  %>
  <hr/>
  <%= applicationName %><br/>
  <%= validateLogin("Ashok", "Ashok") %>

</body>
</html>