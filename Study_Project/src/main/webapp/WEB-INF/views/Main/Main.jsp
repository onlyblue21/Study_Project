<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
</head>
<script src="/js/Ob21.js" type="text/javascript"></script>
<script src="/js/jquery-1.11.2.js" type="text/javascript">

// $(document).ready(function(){
// 	alert('테스트');
// });

window.onloda = function check(){
	var check = "${login}";
	var membercheck = "${member}";
	
	if(check){
		alert(check);
		return false;
	}
	
	if(membercheck){
		alert("로그인 되었습니다.");
		return false;
	}
}
</script>
<body>
<h1>
	main!  
</h1>


<form name="mainfrm" action="/login" method="post">
<table>
	<tr>
		<td>
			test = ${test}		
			member = ${member.id}
		</td>
	</tr>
	<tr>
		<td>id : <input type="text" name="id" value="" /></td>	
	</tr>
	<tr>
		<td>pw : <input type="password" name="pw" value="" /></td>
	</tr>
</table>
<input type="button" value="프로필 생성" onclick="profile();">
<br>
<input type="button" value="회원가입" onclick="memberJoin();">
<br>
<input type="submit" value="로그인">
</form>


</body>
</html>
