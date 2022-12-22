<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list" class="nav-link">Employee</a></li>
			</ul>
			<form action="search" method="get">
				<input type="text" class="form-control" name="q" placeholder="Search here"/>
			</form>
		</nav>
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center" >List of Employee</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add New Employee</a>
			</div>
			<br>
			<table class="table  table-bordered" style="border:black; border-width:5px;border-style:outset; background-color:skyblue;border-bottom: 5px solid black;"">
			<thead class="thead-tomato">
					<tr >
						<th>EMP Id</th>
						<th>Name</th>
						<th>Phone</th>
						<th>Email</th>
						<th>Address</th>
						<th>Qualification</th>	
						<th>Joining Date</th>
						<th>Experience</th>
						<th>Employment Status</th>
						<th>Contract End Date</th>
						<th>PF Account Number</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					
					<c:forEach var="user" items="${listUser}">
						<tr>
							<td class="table-info"><c:out value="${user.getEmpId()}" /></td>
							<td class="table-info"><c:out value="${user.getName()}" /></td>
							<td class="table-info"><c:out value="${user.getPhone()}" /></td>
							<td class="table-info"><c:out value="${user.getEmail()}" /></td>
							<td class="table-info"><c:out value="${user.getAddress()}" /></td>
							<td class="table-info"><c:out value="${user.getQualification()}" /></td>
							<td class="table-info"><c:out value="${user.getExperience()}" /></td>
							<td class="table-info"><c:out value="${user.getJoiningDate()}" /></td>
							<td class="table-info"><c:out value="${user.getEmploymentStatus()}" /></td>
							<td class="table-info"><c:out value="${user.getContractEndDate()}" /></td>
							<td class="table-info"><c:out value="${user.getPFAccountNumber()}" /></td>
							<td class="table-info"><a href="edit?empId=<c:out value='${user.empId}' />" class="btn btn-info">Update</a>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?empId=<c:out value='${user.empId}' />"class="btn btn-outline-danger">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>