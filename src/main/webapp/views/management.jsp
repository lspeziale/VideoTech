<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Admin Management</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.generic-container {
	position: fixed;
	width: 97%;
	margin-left: 30px;
	margin-top: 30px;
	margin-bottom: 30px;
	margin-right: 30px;
	padding: 60px;
	background-color: #EAE7E7;
	border: 2px solid #ddd;
	border-radius: 4px;
	box-shadow: 0 0 30px black;
}

.floatRight {
	float: right;
	margin-right: 18px;
}

.authbar {
	margin-bottom: 30px;
}

input[type=text] {
	width: 298px;
	box-sizing: border-box;
	border: 3px solid #ccc;
	border-radius: 2px;
	font-size: 14px;
	background-color: white;
	padding: 12px 10px 12px 20px;
	-webkit-transition: width 0.4s ease-in-out;
	transition: width 0.4s ease-in-out;
}
</style>
</head>
<body background="img/bg5.jpg">
	<div class="generic-container">
		<div class="authbar">
			<span><font size="3">Welcome <b>Admin</b>.
			</font></span> <span class="floatRight"> <a href="<c:url value='/logout' />"><button
						type="button" class="btn btn-info active">Logout</button></a>
			</span>

		</div>

		<div class="panel panel-default">
			<div class="container">
				<ul class="nav nav-tabs">
					<li class="active"><a data-toggle="tab" href="#users"><b><font
								size="5">&nbsp USERS &nbsp</font></b></a></li>
					<li><a data-toggle="tab" href="#movies"><b><font
								size="5">&nbsp MOVIES &nbsp</font></b></a></li>
					<li><a data-toggle="tab" href="#actors"><b><font
								size="5">&nbsp ACTORS &nbsp</font></b></a></li>
					<li><a data-toggle="tab" href="#genres"><b><font
								size="5"> &nbsp GENRES &nbsp</font></b></a></li>
					<li><a data-toggle="tab" href="#directors"><b><font
								size="5"> &nbsp DIRECTORS &nbsp</font></b></a></li>
					<!-- <li>
	<p valign="center">
		<form>
		  <input type="text" name="search" placeholder="Search..">
		</form>
	</p>
	</li> -->
				</ul>

				<div class="tab-content">
					<div id="users" class="tab-pane fade in active">
						&nbsp
						<div class="container">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Firstname</th>
										<th>Lastname</th>
										<th>Username</th>
										<th>Email</th>
										<th>Role</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Elliot</td>
										<td>Alderson</td>
										<td>MrRobot</td>
										<td>fuck@society.com</td>
										<td>Admin</td>
									</tr>
									<c:forEach items="${users}" var="user">
										<tr>
											<td>${user.firstName}</td>
											<td>${user.lastName}</td>
											<td>${user.username}</td>
											<td>${user.email}</td>
											<td>${user.role}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>

						<div class="well">
							<table width=60% align="center">
								<tr>
									<td width=250><p align="center">
											<a href="<c:url value='/newuser' />"><button
													type="button" class="btn btn-success">Add New User
												</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/edituser' />"><button
													type="button" class="btn btn-warning">Edit User</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/deleteuser' />"><button
													type="button" class="btn btn-danger">Delete User</button></a>
							</table>
						</div>

					</div>
					<div id="movies" class="tab-pane fade">
						&nbsp
						<div class="container">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Title</th>
										<th>Duration</th>
										<th>Release Date</th>
										<th>Director</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Deadpool</td>
										<td>108 min</td>
										<td>2016</td>
										<td>Tim Miller</td>
									</tr>
								</tbody>
							</table>
						</div>

						<div class="well">
							<table width=60% align="center">
								<tr>
									<td width=250><p align="center">
											<a href="<c:url value='/newmovie' />"><button
													type="button" class="btn btn-success">Add New
													Movie</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/editmovie' />"><button
													type="button" class="btn btn-warning">Edit Movie</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/deletemovie' />"><button
													type="button" class="btn btn-danger">Delete Movie
												</button></a>
							</table>
						</div>

					</div>
					<div id="actors" class="tab-pane fade">
						&nbsp
						<div class="container">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Firstname</th>
										<th>Lastname</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Leonardo</td>
										<td>DiCaprio</td>
									</tr>
								</tbody>
							</table>
						</div>

						<div class="well">
							<table width=60% align="center">
								<tr>
									<td width=250><p align="center">
											<a href="<c:url value='/newactor' />"><button
													type="button" class="btn btn-success">Add New
													Actor</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/editactor' />"><button
													type="button" class="btn btn-warning">Edit Actor</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/deleteactor' />"><button
													type="button" class="btn btn-danger">Delete Actor
												</button></a>
							</table>
						</div>

					</div>
					<div id="genres" class="tab-pane fade">
						&nbsp
						<div class="container">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Genre</th>
										<th>Description</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Action</td>
										<td>An action story is similar to adventure, and the
											protagonist usually takes a risky turn, which leads to
											desperate situations (including explosions, fight scenes,
											daring escapes, etc.)</td>
									</tr>
								</tbody>
							</table>
						</div>

						<div class="well">
							<table width=60% align="center">
								<tr>
									<td width=250><p align="center">
											<a href="<c:url value='/newgenre' />"><button
													type="button" class="btn btn-success">Add New
													Genre</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/editgenre' />"><button
													type="button" class="btn btn-warning">Edit Genre</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/deletegenre' />"><button
													type="button" class="btn btn-danger">Delete Genre
												</button></a>
							</table>
						</div>

					</div>
					<div id="directors" class="tab-pane fade">
						&nbsp
						<div class="container">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Firstname</th>
										<th>Lastname</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Tim</td>
										<td>Miller</td>
									</tr>
								</tbody>
							</table>
						</div>

						<div class="well">
							<table width=60% align="center">
								<tr>
									<td width=250><p align="center">
											<a href="<c:url value='/newdirector' />"><button
													type="button" class="btn btn-success">Add New
													Director</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/editdirector' />"><button
													type="button" class="btn btn-warning">Edit
													Director</button></a>
									<td width=250><p align="center">
											<a href="<c:url value='/deletedirector' />"><button
													type="button" class="btn btn-danger">Delete
													Director</button></a>
							</table>
						</div>

					</div>
				</div>
			</div>

		</div>

	</div>
</body>
</html>
