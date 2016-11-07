<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>
</head>

<body>
	<form:form action="newuser" method="post" modelAttribute="user">
 	<form:hidden path="id" />
 	First Name <form:input type="text" path="firstName" id="firstName" />
	Last Name  <form:input type="text" path="lastName" id="lastName" />
	Username   <form:input type="text" path="username" id="username" />
	Password   <form:input type="password" path="password" id="password" />
	Email      <form:input type="email" path="email" id="email" />
	<input type="submit" value="Update" /> or 
	<a href="<c:url value='/list' />">Cancel</a>

	</form:form>
</body>
</html>