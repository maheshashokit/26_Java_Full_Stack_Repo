<%@ taglib uri="ashokit.com/customTags" prefix="ashokit"%>
<%@ page import="java.util.*" %>
<html>
<head>
<title>index.jsp</title>
</head>
<body>
	<div style="text-align: center;">
		<h4 style="color: red;">Welcome To AshokIT Custom Tag
			Development!!!!!</h4>
		<hr/>

		<ashokit:demo/>
		<ashokit:demo/>
		<ashokit:demo/>

		<br/>
		<br/>

		<ashokit:demo user="Mahesh" />
		<ashokit:demo user="Suresh" />
		<ashokit:demo user="Rajesh" />

		<br/>
		<br/>
		
		<ashokit:displayText font="Consolas" fontWeight="bolder" size="15">
			Welcome To AshokIT For JSP Custom Tag Development....
		</ashokit:displayText>
		<br/>
		<ashokit:displayText font="Times New Roman">
			Welcome To AshokIT For JSP Custom Tag Development....
		</ashokit:displayText>
		<br/><br/>
		${10*20+50}   
		
		${10 eq 10}
		<ashokit:customers/>
	</div>
</body>
</html>