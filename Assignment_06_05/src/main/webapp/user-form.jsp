<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">


			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Employee</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${user != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${user != null}">
            			update Employee
            		</c:if>
						<c:if test="${user == null}">
            			Add New Employee
            		</c:if>
					</h2>
				</caption>

				<c:if test="${user != null}">
					<input type="hidden" name="empId"
						value="<c:out value='${user.empId}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Employee Name</label> <input type="text"
						value="<c:out value='${user.name}' />" class="form-control"
						name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Phone</label> <input type="text"
						value="<c:out value='${user.phone}' />" class="form-control"
						name="phone">
				</fieldset>

				<fieldset class="form-group">
					<label>Email ID</label> <input type="text"
						value="<c:out value='${user.email}' />" class="form-control"
						name="email">
				</fieldset>

				<fieldset class="form-group">
					<label>Address</label> <input type="text"
						value="<c:out value='${user.address}' />" class="form-control"
						name="address">
				</fieldset>

				<fieldset class="form-group">
					<label>Qualification</label> <input type="text"
						value="<c:out value='${user.qualification}' />"
						class="form-control" name="qualification">
				</fieldset>

				<fieldset class="form-group">
					<label>Joining Date</label> <input type="date"
						value="<c:out value='${user.joiningDate}' />" class="form-control"
						name="joiningDate">
				</fieldset>

				<fieldset class="form-group">
					<label>Experience</label> <input type="text"
						value="<c:out value='${user.experience}' />" class="form-control"
						name="experience">
				</fieldset>

				<fieldset class="form-group">
					<label>Employment Status</label> <input type="text"
						value="<c:out value='${user.employmentStatus}' />"
						class="form-control" name="employmentStatus">
				</fieldset>
				<fieldset class="form-group">
					<label>Contract End Date</label> <input type="date"
						value='<c:out value="${user.contractEndDate}" />'
						class="form-control" name="contractEnddate">
				</fieldset>


				<fieldset class="form-group">
					<label>PF Account Number</label> <input type="text"
						value="<c:out value='${user.PFAccountNumber}' />"
						class="form-control" name="PFAccountNumber">
				</fieldset>

				<button type="submit" class="btn btn-success">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>