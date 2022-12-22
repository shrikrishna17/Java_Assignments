<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div class="container ">
		<br> 
		<div class="p-3 mb-2 bg-success text-white">
		<h3>Details Of Employee By Name</h3>
		</div>
		<br>
		<table border=1>
			<tr>
				<td><a href="listemployee">All Employees</a></td>
			</tr>
		</table>
		<br>
		<table class="table">
			<tr>
				<td class="table-info">Employee ID </td>
				<td class="table-info">${requestScope.Employee.id }</td>
			</tr>
			<tr>
				<td class="table-info">Employee Name </td>
				<td class="table-info">	${requestScope.Employee.name }</td>
			</tr>
			<tr>
				<td class="table-info">Employee Email </td>
				<td class="table-info">	${requestScope.Employee.email }</td>
			</tr>
			<tr>
				<td class="table-info">Employee Department </td>
				<td class="table-info">	${requestScope.Employee.department }</td>
			</tr>
			<tr>
				<td class="table-info">Employee Experience </td>
				<td class="table-info">	${requestScope.Employee.experience }</td>
			</tr>
			<tr>
				<td class="table-info">Employee City </td>
				<td class="table-info">	${requestScope.Employee.city }</td>
			</tr>
			<tr>
				<td class="table-info">Employee Door Number </td>
				<td class="table-info">	${requestScope.Employee.doorNumber }</td>
			</tr>
			<tr>
				<td class="table-info">Employee Street </td>
				<td class="table-info">	${requestScope.Employee.street }</td>
			</tr>
			<tr>
				<td class="table-info">Employee Pincode </td>
				<td class="table-info">	${requestScope.Employee.pincode }</td>
			</tr>
		</table>

	

	</div>
</body>
</html>