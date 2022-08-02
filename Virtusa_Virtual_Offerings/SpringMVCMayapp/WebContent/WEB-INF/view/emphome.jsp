<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags"prefix="tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<tags:url var="all" value="emp/getAllemp"/>
	<tags:url var="profile" value="emp/profile"/>
	
	Welcome Employee <a href='${profile}'>${sessionScope.username}</a>
	<br>
	<a href="${all}">Select All Employee</a>
	<br>
	${employee}
	<br>
	${message}
	<br>
	${empList}
</body>
</html>