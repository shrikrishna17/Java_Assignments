<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<body>
	<br>
	<br>
	<header class="bg-blue">
		<div class="container">

			<div class="p-3 mb-2 bg-success text-white">
				<h3>Employee Management App</h3>

				<form action="details" method="get">
					<input type="text" class="form-control" name="id"
						placeholder="Search Employee by Number" />
				</form>
				<form action="detailsname" method="get">
					<input type="text" class="form-control" name="name"
						placeholder="Search Employee by Name" />
				</form>
			</div>
		</div>

	</header>

	<div class="col"></div>
	<div class="container">

		<a class="btn btn-primary" href="add">Add New Employee</a> <a
			class="btn btn-primary" href="numbersort"> Sort by Number</a> <a
			class="btn btn-primary" href="experiencesort">Sort by Experience</a>
		<a class="btn btn-sm btn-danger" href="logout">Log Out</a>
		</td>

		<h5 class="text-left">Employee List</h5>

		<table class="table table-bordered table-striped table-hover">
			<tr class="table-success">
				<th>ID</th>
				<th>Name</th>
				<th>Department</th>
				<th>Email</th>
				<th>Experience</th>
				<th>Action</th>
			</tr>

			<c:forEach var="e" items="${employeeList}">
				<tr class="table-info">
					<td><a>${e.id}</a></td>
					<td><a>${e.name}</a></td>
					<td><a>${e.department}</a></td>
					<td><a>${e.email}</a></td>
					<td><a>${e.experience}</a></td>
					<td><a class="btn btn-sm btn-primary" href="update?id=${e.id}">Edit</a>
				</tr>
			</c:forEach>

		</table>
	</div>

</body>
</html>