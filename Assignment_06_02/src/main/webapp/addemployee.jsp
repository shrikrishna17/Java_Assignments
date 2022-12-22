<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html>

        <head>
            <title>Employee Management Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="https://www.javaguides.net" class="navbar-brand"> Employee Management App </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/listemployee" class="nav-link">Employees</a></li>
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
        
                            <form action="add" method="post">
                     
                        <fieldset class="form-group">
                            <label>Employee Name</label> <input type="text" value="${emp.name}" class="form-control" name="name" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Employee Phone</label> <input type="text" value="${emp.phone}" class="form-control" name="phone">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Employee Email</label> <input type="text" value="${emp.email}" class="form-control" name="email">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Employee address</label> <input type="text" value="${emp.address}" class="form-control" name="address">
                        </fieldset>
                        
						<fieldset class="form-group">
                            <label>Employee qualification</label> <input type="text" value="${emp.qualification}" class="form-control" name="qualification">
                        </fieldset>
                        
						<fieldset class="form-group">
                            <label>Employee experience</label> <input type="text" value="${emp.experience}" class="form-control" name="experience">
                        </fieldset>
                        
						<fieldset class="form-group">
                            <label>Employee joiningDate</label> <input type="text" value="${emp.joiningDate}" class="form-control" name="joiningDate">
                        </fieldset>
                        
						<fieldset class="form-group">
                            <label>Employee employmentStatus</label> <input type="text" value="${emp.employmentStatus}" class="form-control" name="employmentStatus">
                        </fieldset>
                        
						<fieldset class="form-group">
                            <label>Employee contractEndDate</label> <input type="text" value="${emp.contractEndDate}" class="form-control" name="contractEndDate">
                        </fieldset>
                        
						<fieldset class="form-group">
                            <label>Employee PFAccountNumber</label> <input type="text" value="${emp.PFAccountNumber}" class="form-control" name="PFAccountNumber">
                        </fieldset>	

	
							
                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>