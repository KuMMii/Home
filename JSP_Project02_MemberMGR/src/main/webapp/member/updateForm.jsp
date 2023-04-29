<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateForm</title>
</head>
<body>

<h2>My Account</h2>
<form action ="member.do?command=update" method="post" name="frm">
	<table>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="${loginUser.name }"></td>
		</tr>
		<tr>
			<td>ID</td>
			<td>${loginUser.userid}<input type="hidden" name="userid" value="${loginUser.userid}"></td>
		</tr>
		<tr>
			<td>PW</td>
			<td><input type="password" name="pwd" size="20"></td>
		</tr>
		<tr>
			<td>PW Check</td>
			<td><input type="password" name="pwd_check" size="20"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="${loginUser.email}" size="20"></td>
		</tr>
		<tr>
			<td>Phone</td>
			<td><input type="text" name="phone" value="${loginUser.phone}" size="20"></td>
		</tr>
		<tr>
			<td>Authority</td>
			<td>
			<c:choose>
				<c:when test="${loginUser.admin==0 }">
					<input type="radio" name="admin" value="0" checked/>USER
					<input type="radio" name="admin" value="1" />ADMIN
				</c:when>
				<c:otherwise>
					<input type="radio" name="admin" value="0" />USER
					<input type="radio" name="admin" value="1" checked/>ADMIN
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
		<tr><td colspan="2" align="center"><input type="submit" value="SUBMIT" onClick="return updateCheck()">&nbsp;
		<input type="reset" value="RESET"></td></tr>
	</table>
</form>
</body>
</html>