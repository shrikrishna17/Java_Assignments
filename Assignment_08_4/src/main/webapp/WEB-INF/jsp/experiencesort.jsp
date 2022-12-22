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
	<div class="container">
		<table border=1>
			<tr>
				<td><a href="listemployee">Home page</a></td>
			</tr>
		</table>
		<h4>Employee List Experience Sort</h4>
		<table class="table table-bordered table-striped table-hover">
			<tr class="table-success">
				<th>ID</th>
				<th>Name</th>
				<th>Department</th>
				<th>Email</th>
				<th>Experience</th>
			</tr>

			<c:forEach var="e" items="${requestScope.listExperience}">
				<tr class="table-info">
					<td>${e.id}</td>
					<td>${e.name}</td>
					<td>${e.department}</td>
					<td>${e.email}</td>
					<td>${e.experience}</td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>