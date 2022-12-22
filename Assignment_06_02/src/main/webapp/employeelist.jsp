<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="employeelist" class="navbar-brand"> Employee Management
					App </a>
			</div>
		</nav>
	</header>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Employees</h3>
			<hr>
			<div class="container text-left">
				<a href="edit1.jsp" class="btn btn-sm btn-primary">Add New
					Employee</a>

			</div>
			<div class="btn-group dropright">
				<button type="button" class="btn btn-secondary dropdown-toggle"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					Dropright</button>
				<div class="dropdown-menu">
					<!-- Dropdown menu links -->
					<ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
						<li><a class="dropdown-item" href="#">Another action</a></li>
						<li><a class="dropdown-item" href="#">Something else here</a></li>
					</ul>
				</div>
			</div>

			<table class="table table-bordered">
				<tr>
					<th>EMP Id</th>
					<th>Name</th>
					<th>Phone</th>
					<th>Email</th>
					<th>Address</th>
					<th>Qualification</th>
					<th>Experience</th>
					<th>Joining Date</th>
					<th>Employment Status</th>
					<th>Contract End Date</th>
					<th>PF Account Number</th>
					<th>Action</th>

				</tr>
				<c:forEach var="t" items="${listEmployee}">
					<tr>

						<td><c:out value="${t.getEmpId()}" /></td>
						<td><c:out value="${t.getName()}" /></td>
						<td><c:out value="${t.getPhone()}" /></td>
						<td><c:out value="${t.getEmail()}" /></td>
						<td><c:out value="${t.getAddress()}" /></td>
						<td><c:out value="${t.getQualification()}" /></td>
						<td><c:out value="${t.getExperience()}" /></td>
						<td><c:out value="${t.getJoiningDate()}" /></td>
						<td><c:out value="${t.getEmploymentStatus()}" /></td>
						<td><c:out value="${t.getContractEndDate()}" /></td>
						<td><c:out value="${t.getPFAccountNumber()}" /></td>
						<td><a class="btn btn-sm btn-primary"
							href="update?id=<c:out value='${t.EmpId}' />">Edit</a>
							&nbsp;&nbsp;&nbsp;&nbsp; <a class="btn btn-sm btn-danger"
							href="delete?id=<c:out value='${t.EmpId}' />">Delete</a></td>
					</tr>

				</c:forEach>
				<!--  <c:forEach var="t" items="${ttb.empList}"> -->
				<!--  </c:forEach>-->

			</table>
			<!-- <form action="addemployee.jsp" method="post">
	<input type="submit" value="Add Employee"  />
	</form> -->
</body>
</html>