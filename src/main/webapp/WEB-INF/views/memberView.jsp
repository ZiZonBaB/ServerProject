<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.waring{
font: bold; font-size: 15px; color: red;
}
</style>
<meta charset="UTF-8">
<title>회원정보수정</title>
</head>
<body>
	<h1>회원정보 수정</h1>
	<p class="waring">※이름은 변경할 수 없습니다.</p>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="modify" method="post">
			<input type="hidden" name="mNum" value="${memberView.mNum}">

			<tr>
				<td class="n1" height="30">이름</td>
				<td>${memberView.mName }</td>
			</tr>
			<tr>
				<td class="n1" height="30">전화번호</td>
				<td><input type="text" name="mPhone" size="65"
					value="${memberView.mPhone}"></td>
			</tr>
			<tr>
				<td class="n1" height="30">주소</td>
				<td><input type="text" name="mAddr" size="65"
					value="${memberView.mAddr}"></td>
			</tr>
			<tr>
				
				<td colspan="2" height="30"><input type="submit" value="수정">&nbsp;&nbsp;<a
					href="list"><input type="button" value="목록보기"></a>&nbsp;&nbsp;&nbsp;
					<a href="delete?mNum=${memberView.mNum}"><input type="button" value="삭제"></a>
					</td>
			</tr>
		</form>
	</table>

	</form>
</body>
</html>