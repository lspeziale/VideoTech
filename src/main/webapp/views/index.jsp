<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign-Up/Login Form</title>
<link
	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link rel="stylesheet" href="static/css/style.css">


</head>

<body background="img/bg5.jpg">
	<p align="center">
		<img src="img/videotech.png" height="45%" width="45%">
	</p>
	<div class="form">

		<ul class="tab-group">
			<li class="tab active"><a href="#signup">Sign Up</a></li>
			<li class="tab"><a href="#login">Log In</a></li>
		</ul>

		<div class="tab-content">
			<div id="signup">
				<h1>Sign Up for Free</h1>

				<form action="/" method="post">

					<div class="top-row">
						<div class="field-wrap">
							<label> First Name<span class="req">*</span>
							</label> <input type="text" required autocomplete="off" />
						</div>

						<div class="field-wrap">
							<label> Last Name<span class="req">*</span>
							</label> <input type="text" required autocomplete="off" />
						</div>
					</div>

					<div class="field-wrap">
						<label> Username<span class="req">*</span>
						</label> <input type="text" required autocomplete="off" />
					</div>

					<div class="field-wrap">
						<label> Email Address<span class="req">*</span>
						</label> <input type="email" required autocomplete="off" />
					</div>

					<div class="field-wrap">
						<label> Password<span class="req">*</span>
						</label> <input type="password" required autocomplete="off" />
					</div>

					<button type="submit" class="button button-block">Get
						Started</button>

				</form>

			</div>

			<div id="login">
				<h1>Welcome Back!</h1>
				<c:url var="loginUrl" value="/User/signin" />
				<form action="${loginUrl}" method="GET" >
					<c:if test="${param.error != null}">
						<p>Invalid username and password.</p>
					</c:if>
					<c:if test="${param.logout != null}">
						<p>You have been logged out successfully.</p>
					</c:if>

					<div class="field-wrap">
						<label> Username<span class="req">*</span></label> <input
							type="text" id="username" name="username" required />
					</div>

					<div class="field-wrap">
						<label> Password<span class="req">*</span></label> <input
							type="password" id="password" name="password" required />
					</div>
					<!-- <div class="checkbox">
						<label><input type="checkbox" id="rememberme"
							name="remember-me"> Remember Me</label>
					</div> -->
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />

					<button class="button button-block">Log In</button>
					<!-- <div>
						<input type="submit" value="Log in">
					</div> -->
				</form>
			</div>

		</div>
		<!-- tab-content -->

	</div>
	<!-- /form -->
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

	<script src="static/js/index.js"></script>
</body>
</html>
