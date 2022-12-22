<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee login page</title>
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
				<h3 class="text-center"> Login </h3>
			</div>
		</div>
	</header>
	<br>
	<br>
	<div class="container">
		<sf:form modelAttribute="command" action="validate" method="post">

			<table class="table table-info">
				<tr>
					<td>Email</td>
					<td><sf:input path="email" /></td>


				</tr>

				<tr>
					<td>Password</td>
					<td><sf:input path="password" /></td>


				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Sign In" /></td>
				</tr>


			</table>


		</sf:form>
	</div>





</body>
</html>