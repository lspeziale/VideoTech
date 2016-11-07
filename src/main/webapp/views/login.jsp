<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login page</title>
		
	</head>

	<body>
		
						<c:url var="loginUrl" value="/User/login" />
						<form action="${loginUrl}" method="get" class="form-horizontal">
							<c:if test="${param.error != null}">
									<p>Invalid username and password.</p>
							</c:if>
							<c:if test="${param.logout != null}">
									<p>You have been logged out successfully.</p>
							</c:if>
								<input type="text" id="username" name="username" placeholder="Enter Username" required>
							<input type="password" id="password" name="password" placeholder="Enter Password" required>
                              <div class="checkbox">
                                <label><input type="checkbox" id="rememberme" name="remember-me"> Remember Me</label>  
                              </div>
							<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
								
							<div>
								<input type="submit" value="Log in">
							</div>
						</form>

	</body>
</html>