<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
<%
	if(session.getAttribute("loginUser")==null){
		response.sendRedirect("login.do");
	}
%>
<%-- <c:if test="${empty loginUser}"/><%response.sendRedirect("login.do");%> --%>

<table>
	<tr><td>${loginUser.userid}(${loginUser.name}) logged in. Hello!</td></tr>
	<tr><td>Email : ${loginUser.email}</td></tr>
	<tr><td>Phone : ${loginUser.phone}</td></tr>
	<tr><td><input type="button" value="LOGOUT" onClick="location.href='logout.do'"/>
</table>
</body>
</html>