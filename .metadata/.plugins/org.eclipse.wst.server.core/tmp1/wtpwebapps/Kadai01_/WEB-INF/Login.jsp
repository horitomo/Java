<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
	<h1>ログイン</h1>
	<form action="Login_" method="POST">
		<p>ID：<input type="text" name="id" > </p>
		<p>Password： <input type="password" name="password" > </p>
		<input type="submit" value="ログイン" name="login">
		<br>
		<input type="text" name="error">
	</form>

	<a href="UserRegister">新規ユーザ登録</a>
</body>
</html>