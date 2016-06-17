<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>글쓰기</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>
	게시글쓰기
</h1>

<table class="table table-striped">
<form action="/springrest/Rest" method="post">


		<tr>
			<th>Title</th>
			<td><input type="text" id="title" name="title"/></td>
		</tr>
		<tr>
			<th>Name</th>
			<td><input type="text" id="user_name" name="user_name" /></td>
		</tr>
		<tr>
			<th>Content</th>
			<td><input type="text" id="content" name="content"/></td>
		</tr>
		<tr>
			<td><input type="submit" id="btn" name="btn" value="등록"/></td>
		</tr>

</form>
</table>
</div>

</body>
</html>
