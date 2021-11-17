<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberForm</title>
<script src="http://code.jquery.com/jquery-3.1.1.js"></script>
<script type="text/javascript">
	function check() {

		if (fr.mName.value == "") {
			alert("이름을 입력해 주세요.");
			fr.mName.focus();
			return false;
		}

		else if (fr.mPhone.value == "") {
			alert("번호를 입력해 주세요.");
			fr.mPhone.focus();
			return false;
		}else if(fr.mAddr.value==""){
			alert("주소를 입력해주세요.")
			fr.mAddr.focus();
			return false;
		}
		else
			return true;
	}
</script>


</head>
<body>
	<h1>회원정보 입력</h1>
	<br>
<table width="500" cellpadding="0" cellspacing="0" border="1">
	<form id="fr" action="member" method="post" onsubmit="return check()">

<tr>
<td>이름</td>
<td><input type="text" name="mName" size="10"> </td>
</tr>

<tr>
<td>전화번호</td>
<td><input type="text" name="mPhone" size="20"></td>
</tr>

<tr>
<td>주소</td>
<td><input type="text" name="mAddr" size="50"></td>
</tr>
<tr><td colspan="2"><input type="submit" value="확인">&nbsp;&nbsp;<input type="reset" value="취소"></td></tr>
			
		

</table>
</body>
</html>