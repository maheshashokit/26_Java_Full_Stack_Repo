<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome.jsp</title>
</head>
<body>
	<div style="text-align:center;color:red;">Welcome To AshokIT For JSP WebApplication Development.....</div>
	<hr/>
	<br/>
	<div style="text-align:center;color:blue;">
		<%
			java.util.Date currentDate =  new java.util.Date();
		    out.println("Current Date And Time......." + currentDate);
		%>
	</div>
</body>
</html>