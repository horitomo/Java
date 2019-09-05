<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
	<form action="UserRegister" method="POST">
		<p>ID：<input type="text" name="id" > </p>
		<p>Password： <input type="password" name="password" > </p>
		<input type="submit" value="登録" name="new">
		<br>
		<input type="text" name="error">
	</form>
</body>
</html>