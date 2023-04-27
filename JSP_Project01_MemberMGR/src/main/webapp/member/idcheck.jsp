<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>idcheck</title>
</head>
<body>

<c:choose>
	<c:when test="${result==1 }">${userid} is already existing.
		<script type="text/javascript">
		opener.document.frm.userid.value="";
		opener.document.frm.reid.value="";
		</script>
	</c:when>
	<c:otherwise>You can use ${userid}.<input type="button" value="USE ID" onClick="idok('${userid}')"/>
	</c:otherwise>
</c:choose>
	<br><br>

<form action="idcheck.do" method="get" name="frm">
ID : <input type="text" name="userid" value="${userid }"><input type="submit" value="ID Recheck">
</form>


<script type="text/javascript">
	function idok(id){
		opener.document.frm.userid.value=id;
		opener.document.frm.reid.value=id;
		self.close();
	}
</script>
</body>
</html>