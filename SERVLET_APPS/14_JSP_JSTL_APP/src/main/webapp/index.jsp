<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index.jsp</title>
</head>
<body>
	<div style='text-align:center;color:red;'>
		Welcome To AshokIT for JSTL Tag Library Development.....
	</div>
	<hr/>
	<c:set var="loginMessage" value="Welcome To AshokIT"/>
	>>>>>>>>Expression Style Printing Data....${loginMessage}<br/>
	<c:if test="${'Mahesh' eq 'Mahesh'}">
		<c:set var="loginMessage" value="Welcome To AshokIT,Login Sucess"/>
	</c:if>
	>>>>>>>>JSTL Style Printing Data....<c:out value="${loginMessage}"/><br/>
	<c:forEach begin="1" end="5" var="counter">
		>>>>>>>><c:out value="${counter}"/><br/>
	</c:forEach>
	<c:set var="username" value="Ashok"/>
	<c:choose>
		<c:when test="${'Mahesh' eq username}">
		    <c:set var="loginName" value="Mahesh"/>
		</c:when>
		<c:when test="${fn:contains(username,'Ashok')}">
		    <c:set var="loginName" value="Ashok"/>
		</c:when>
		<c:when test="${'Suresh' eq username}">
		    <c:set var="loginName" value="Mahesh"/>
		</c:when>
		<c:when test="${'Rajesh' eq username}">
		    <c:set var="loginName" value="Rajesh"/>
		</c:when>
		<c:when test="${'Nagesh' eq username}">
		    <c:set var="loginName" value="Nagesh"/>
		</c:when>
		<c:when test="${'Rama' eq username}">
		    <c:set var="loginName" value="Rama"/>
		</c:when>
		<c:otherwise>
			<c:set var="loginName" value="${username}"/>
		</c:otherwise>
	</c:choose>	
	>>>>>>>>>>>>>>>Login Name>>>>>><c:out value="${fn:toUpperCase(loginName)}"/>
</body>
</html>