<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import ="java.sql.*,java.util.*"%>
    
<%
String empname=request.getParameter("name");
String leaveTitle=request.getParameter("title");
String leaveType=request.getParameter("Leave title");
String rquDate=request.getParameter("reqdate");

String fromdate=request.getParameter("fromdate");
String todate=request.getParameter("todate");
String reason=request.getParameter("reason");
String approver=request.getParameter("approver");


try
{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	String url = "jdbc:sqlserver://CHN71DT803:1433;databaseName=JSP;encrypt=true;trustServerCertificate=true";
	String user = "sa";
	String password = "Password1!";
	Connection cn = DriverManager.getConnection(url,user,password); 
	Statement st=cn.createStatement();
          
	int i=st.executeUpdate("insert into Leaves (empName,leaveTitle,leaveType,rquestedDate,fromDate,toDate,reason,approver)values('"+empname+"','"+leaveTitle+"','"+leaveTitle+"','"+rquDate+"','"+fromdate+"','"+todate+"','"+reason+"','"+approver+"')");
        out.println("Data is successfully inserted!");
        }
        catch(Exception e)
        {
        System.out.print(e);
        e.printStackTrace();
        }
 %>