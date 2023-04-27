<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinForm</title>
</head>
<body>

<h2>Sign In</h2>Form with '*' is mandatory.
	<form action="join.do" method="post" name="frm">
	<table>
	<tr><td>이름</td><td><input type="text" name="name" size="20">&nbsp;*</td></tr>
		<tr><td>아이디</td><td><input type="text" name="userid" size="20">&nbsp;*
			<input type="button" value="ID Check" onClick="idCheck();"/>
			<input type="hidden" value="" name="reid"/></td></tr>
		<tr><td>비밀번호</td><td><input type="password" name="pwd" size="20">&nbsp;*</td></tr>
		<tr><td>비밀번호 확인</td>
		<td><input type="password" name="pwd_check" size="20">&nbsp;*</td></tr>
		<tr><td>이메일</td><td><input type="text" name="email" size="20"></td></tr>
		<tr><td>전화번호</td><td><input type="text" name="phone" size="20"></td></tr>
		<tr><td>등급</td>
			<td><input type="radio" name="admin" value="0" checked="checked">User&nbsp;
					<input type="radio" name="admin" value="1" >Admin
			</td>
		</tr>
		<tr><td colspan="2" align="center">
			<input type="submit" value="JOIN" onClick="return joinCheck()"/>
			<input type="reset" value="RESET"/></td></tr>
	</table>
	</form>

<script type="text/javascript">
	function idCheck(){
		if(document.frm.userid.value==""){
			alert('Please click the button after filling in the ID form.');
			document.frm.userid.focus();
			return;
		}
		
		var inputid=document.frm.userid.value;
		var opt='toolbar=no, menubar=no, scrollsbars=yes, width=500, height=200';
		window.open('idcheck.do?userid='+inputid, 'id-check', opt);
	}
	
	function joinCheck(){
		if(document.frm.name.value.length==0){
			alert("Name is mandatory.");
			document.frm.name.focus();
			return false;
		}else if(document.frm.userid.value.length==0){
			alert("ID is mandatory.");
			document.frm.userid.focus();
			return false;
		}else if(document.frm.pwd.value.length==0){
			alert("Password is mandatory.");
			document.frm.pwd.focus();
			return false;
		}else if(document.frm.userid.value!=document.frm.reid.value){
			alert("Please check your ID.");
			document.frm.userid.focus();
			return false;
		}else if(document.frm.pwd.value!=document.frm.pwd_check.value){
			alert("Please type the password correctly.");
			document.frm.pwd.focus();
			return false;
		}else{
			return true;
		}
	}
</script>

</body>
</html>













