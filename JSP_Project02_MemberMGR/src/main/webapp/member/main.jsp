<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<%
	if (session.getAttribute("loginUser") == null) {
		response.sendRedirect("member.do?command=loginForm");
	}
	%>
	<%-- <c:if test="${empty loginUser}"/><%response.sendRedirect("login.do");%> --%>

	<table>
		<tr>
			<td>${loginUser.userid}(${loginUser.name})logged in. Hello!</td>
		</tr>
		<tr>
			<td>Email : ${loginUser.email}</td>
		</tr>
		<tr>
			<td>Phone : ${loginUser.phone}</td>
		</tr>
		<tr>
			<td><input type="button" value="LOGOUT"	onClick="location.href='member.do?command=logout'" />
			<input type="button" value="MY ACCOUNT"	onClick="location.href='member.do?command=updateForm'" />
			<input type="button" value="QUIT"	onClick="withdrawConfirm();" /></td>
	</table>

	<br>
	<br>
	<c:if test="${loginUser.admin==1 }">
		<table width="800" bgcolor="black" cellspacing="1">
			<tr bgcolor="white" align="center">
				<td>Name</td>
				<td>ID</td>
				<td>PW</td>
				<td>Email</td>
				<td>Phone</td>
				<td>Authority</td>
				<td>Switch</td>
			</tr>
			<c:forEach items="${mList}" var="member">
				<tr bgcolor="white" align="center">
					<td>${member.name}</td>
					<td>${member.userid}</td>
					<td>${member.pwd}</td>
					<td>${member.email}</td>
					<td>${member.phone}</td>
					<td><c:choose>
							<c:when test="${member.admin==0}">USER</c:when>
							<c:otherwise>ADMIN</c:otherwise>
						</c:choose></td>
					<td><c:choose>
							<c:when test="${member.userid==loginUser.userid}">&nbsp;</c:when>
							<c:otherwise>
								<input type="button" value="Switch"
									onClick="location.href='member.do?command=editadmin&userid=${member.userid}&admin=${member.admin}'" />
							</c:otherwise>
						</c:choose></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


	<script type="text/javascript">
		function withdrawConfirm() {
			var bool = confirm('ARE YOU SURE?:(');
			if (bool) {
				location.href = "member.do?command=delete";
			} else {
				return;
			}
		}
	</script>






</body>
</html>