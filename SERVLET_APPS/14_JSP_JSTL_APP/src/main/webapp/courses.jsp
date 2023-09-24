<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<select name="courses">
		<option value="">Select</option>
		<c:forEach var="courseName" items="${requestScope.courseNames}">
			<option value="${courseName}">${courseName}</option>			
		</c:forEach>	
	</select>
	
	<sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver" 
	                            url="jdbc:oracle:thin:@localhost:1521:xe"
	                            user="system" 
	                            password="manager"/> 
	<sql:query dataSource="${db}" var="rs">  
		SELECT person_name,email_id from ashokit_persons  
	</sql:query>
	<table border="2">
		<c:forEach var="currentRow" items="${rs.rows}" varStatus="rowCount">
			 <tr><td>${currentRow.person_name}</td><td> ${currentRow.email_id}</td></tr>
		</c:forEach>
	</table>  
</body>
</html>