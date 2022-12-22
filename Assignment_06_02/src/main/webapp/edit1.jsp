<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>emp Management Application</title>
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
				                <a href="https://www.javaguides.net"
					class="navbar-brand"> emp Management App </a>             
			</div>
			            
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
				                
				<c:if test="${emp != null}">
                    <form action="update" method="post">      
						         
				</c:if>
				                
				<c:if test="${emp == null}">
                    <form action="add" method="post">      
						         
				</c:if>
				                
				<caption>
					                    
					<h2>
						                        
						<c:if test="${emp != null}">
                        update Employee
                    </c:if>
						                        
						<c:if test="${emp == null}">
                        Add New Employee
                    </c:if>
						                    
					</h2>
					                
				</caption>
				                
				<c:if test="${emp != null}">
                    <input type="hidden" name="empId"
						value="<c:out value='${emp.empId}' />" />
                </c:if>
				                
				<fieldset class="form-group">
					                    <label>Employee Name</label> <input type="text"
						                        value="<c:out value='${emp.name}' />"
						class="form-control"                         name="name"
						required="required">                 
				</fieldset>
				                
				<fieldset class="form-group">
					                    <label>Phone</label> <input type="text"
						                        value="<c:out value='${emp.phone}' />"
						class="form-control"                         name="phone">
					                
				</fieldset>
				                
				<fieldset class="form-group">
					                    <label>Email ID</label> <input type="text"
						                        value="<c:out value='${emp.email}' />"
						class="form-control"                         name="email">
					                
				</fieldset>
				                
				<fieldset class="form-group">
					                    <label>Address</label> <input type="text"
						                        value="<c:out value='${emp.address}' />"
						class="form-control"                         name="address">
					                
				</fieldset>
				                
				<fieldset class="form-group">
					                    <label>Qualification</label> <input type="text"
						                        value="<c:out value='${emp.qualification}' />"
						class="form-control"                         name="qualification">
					                
				</fieldset>
				                
				<fieldset class="form-group">
					                    <label>Experience</label> <input type="text"
						                        value="<c:out value='${emp.experience}' />"
						class="form-control"                         name="experience">
					                
				</fieldset>
				                
				<fieldset class="form-group">
					                    <label>Joining Date</label> <input type="text"
						                        value="<c:out value='${emp.joiningDate}' />"
						class="form-control"                         name="joiningDate">
					                
				</fieldset>
				                
				<fieldset class="form-group">
					                    <label>Employment Status</label> <input
						type="text"
						                        value="<c:out value='${emp.employmentStatus}' />"
						class="form-control"
						                        name="employmentStatus">       
					         
				</fieldset>
				                
				<fieldset class="form-group">
					                    <label>Contract End Date</label> <input
						type="text"
						                        value='<c:out value="${emp.contractEndDate}" />'
						class="form-control"
						                        name="contractEnddate">           
					     
				</fieldset>
				                  
				<fieldset class="form-group">
					                    <label>PF Account Number</label> <input
						type="text"
						                        value="<c:out value='${emp.PFAccountNumber}' />"
						class="form-control"
						                        name="PFAccountNumber">           
					     
				</fieldset>
				                
				<button type="submit" class="btn btn-success">Submit</button>
				                
				</form>
				            
			</div>
			        
		</div>
		    
	</div>
</body>
</html>
Oracle Java Technologies | OracleJava can help reduce costs, drive
innovation, & improve application services; the #1 programming language
for IoT, enterprise architecture, and cloud computing.java.sun.com
