<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
</head>
<body>

<form action="login.do" method="post" name="frm">
	<table>
		<tr><td>ID </td><td><input type="text" name="userid"></td></tr>
		<tr><td>PW </td><td><input type="password" name="pwd"></td></tr>
		<tr><td colspan="2" align="center">
			<input type="submit" value="LOGIN" onClick="return loginCheck();"> 
			<!-- if loginCheck() is true, action(login.do) is activated. But if it's false, no. -->
			<input type="reset" value="RESET">
			<input type="button" value="SIGN IN" onClick="location.href='join.do'"></td>
		</tr>
		<tr><td colspan="2">${message}</td></tr>
			
	</table>
</form>

<script type="text/javascript">
	function loginCheck(){
		if(document.frm.userid.value==""){
			alert("Please type the ID");
			document.frm.userid.focus();
			return false;
		}
		if(document.frm.pwd.value==""){
			alert("Please type the password");
			document.frm.pwd.focus();
			return false;
		}
		return true;
	}
</script>

</body>
</html>