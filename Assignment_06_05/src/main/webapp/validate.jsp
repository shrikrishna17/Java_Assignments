<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<jsp:useBean id="ub" class="bean.UserBean"/> 
 
 <jsp:setProperty name="ub" property="*"/>
 ${ub.validateUser()}
 <c:choose>
  <c:when test="${empty ub.user}">
   Invalid email or password. <br/>
   <a href="login.jsp">Login Again</a>
  </c:when>
  <c:otherwise>
   <c:redirect url="user-list.jsp"/>
  </c:otherwise> 
 </c:choose>

</body>
</html>