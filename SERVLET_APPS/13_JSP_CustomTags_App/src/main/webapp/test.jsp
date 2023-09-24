<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test.jsp</title>
</head>
<body>

   <%
       String userName  = (String)request.getAttribute("Username");
       String loginMessage = (String)session.getAttribute("loginMessage");
       String databaseName = (String)application.getAttribute("databaseName");
   %>
   
   UserName ::::: <%= userName %>
   LoginMessage ::::: <%= loginMessage %>
   DatabaseName ::::: <%= databaseName %>
   
   <br/></br> 
   
   UserName :::::::: ${requestScope.Username}</br>
   loginMessage :::::::::::${sessionScope.loginMessage}</br>
   Database Name:::::::: ${applicationScope.databaseName}</br>
   
   
</body>
</html>