<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form"prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="validateemp"modelAttribute="emp">
		<form:errors path="*"/>
		User Name<form:input path="username"/><form:errors path="username"/><br>
		Password <form:input path="password"/><form:errors path="password"/><br>
		<%-- Gender   <form:radiobuttons path="gender"items="${gender}"/> --%>
		<form:button name="submit"> Submit </form:button>
	</form:form>
	
	
	<!-- <form action="validateemp" method="post">
		User Name <input type="text" name="username"><br>
		Password <input type="password" name="password"><br>
			<input type="submit" value="Login">
	</form> -->
</body>
</html>