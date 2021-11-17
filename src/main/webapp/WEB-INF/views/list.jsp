<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.tr1{
background-color: #CCEEFF; font: bold; font-size: 19px; 
}

</style>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<h1>회원정보목록</h1>

	<div>
	<table width="700" cellpadding="0" cellspacing="0" border="1">
	
	&nbsp;&nbsp;&nbsp;&nbsp; 총 회원 수 :
					<c:set var="mCnt" value="0" />
					<c:set var="mCnt" value="0" />
					<c:forEach items="${list }" var="list">
						<c:set var="mCnt" value="${mCnt+1}" />
					</c:forEach>
					<c:out value="${mCnt }" />
		<tr class="tr1" align="center" height="30">
			<td>ID</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>주소</td>	
			<td>가입일</td>	
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr align="center" height="25">
			<td>${dto.mNum}</td>
			<td><a href="memberView?mNum=${dto.mNum }">${dto.mName}</a></td>
			<td>${dto.mPhone}</td>
			<td>${dto.mAddr}</td>
			<td>${dto.mDate}</td>
		</tr>				
		</c:forEach>
		<tr>
		<td colspan="5"><a href="memberForm"><input type="button" value="회원가입"></a></td>
		</tr>
	</table>
	</div>
</body>
</html>