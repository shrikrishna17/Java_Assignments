<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leave Request</title>
</head>
<body>
 <form action="applyleave.jsp" method="post">
      <table style="background-color: lightblue; margin: auto">
      
        <tr>
          <td>Enter Employee Name</td>
          <td><input type="text" name="name" /></td>
          
          <td>Leave Title</td>
          <td><input type="text" name="title" /></td>
        </tr>
        <tr>
          <td>Leave Type</td>
            <td>
            <select name="Leave title">
              <option value="sick leave">Sick Leave</option>
              <option value="Annual leave">Annual Leave</option>
              <option value="Casual leave">Casual Leave</option>
              <option value="holiday">Holiday</option>
            </select>
          </td>
          <td>Requested Date</td>
          <td> <input type="date" id="datepicker" name="reqdate"/></td>
        </tr>
        <tr>
        	<td>From Date</td>
        	 <td> <input type="date" id="datepicker" name="fromdate" /></td>
        	 <td>To Date</td>
        	 <td> <input type="date" id="datepicker" name="todate"/></td>
        </tr>
        <tr>
        	 <td>Reason</td>
          <td><input type="text" name="reason" /></td>
          
          <td>Approver</td>
            <td>
            <select name="Approver">
              <option value="Ashok Sharma">Ashok Sharma</option>
              <option value="Sanjay Udayshankar">Sanjay Udayshankar</option>
            </select>
          </td>
        </tr>

        <tr>
          <td><input type="submit" value="Apply" /></td>
        </tr>
      </table>
    </form>
</body>
</html>