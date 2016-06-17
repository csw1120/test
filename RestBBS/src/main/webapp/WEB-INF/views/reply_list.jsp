<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>멤버목록</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>
	게시글목록
</h1>
<table class="table table-striped">
	<thead>
		<tr>
			<th>No</th>
			<th>User_name</th>
			<th>Content</th>
			<th>date</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="vo" items="${list }">
			<tr>
				<td>${vo.no}</td>
				<td>${vo.user_name}</td>
				<td>${vo.content}</td>
				<td>${vo.regdate}</td>
				<form action="/ReplyDelete" method="post">
				<input type="hidden" name="user_id" id="user_id" value="${vo.no }"/>
				<td><input type="submit" id="btn" name="btn" value="삭제"/></td>
				</form>
				<form action="/ReplyEdit" method="post">
				<input type="hidden" name="user_id" id="user_id" value="${vo.no }"/>
				<td><input type="submit" id="btn" name="btn" value="수정"/></td>
				</form>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>

</body>
</html>
