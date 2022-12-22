<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    
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
<header>
		<div class="container">
			<div class="p-3 mb-2 bg-success text-white">
				<h3 class="text-center"> Edit Employee </h3>
			</div>
		</div>
	</header>
<div class="container">
<sf:form method="post" action="updateemployee" modelAttribute="Employee">

		<table border="1">
			<tr>
				<td>Id</td>
				<td><sf:input path="id" readonly="true" /></td>
			<tr>
				<td>Department</td>
				<td><sf:input path="department" /></td>
			</tr>
			<tr>
				<td>Experience</td>
				<td><sf:input path="experience" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><sf:input path="city" /></td>
			</tr>
			<tr>
				<td>Door Number</td>
				<td><sf:input path="doorNumber" /></td>
			</tr>
			<tr>
				<td>Street</td>
				<td><sf:input path="street" /></td>
			</tr>
			<tr>
				<td>Pincode</td>
				<td><sf:input path="pincode" /></td>
			</tr>
			<tr>
				<td align="center"><input type="submit"
					value="Update" /></td>
			</tr>
		</table>
	</sf:form>
	</div>
</body>
</html>