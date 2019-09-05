<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ログイン</h1>
	<form action="Login" method="post">
		<label>ID:</label>
		<input type="text" name="id">
		<br>
		<label>Password:</label>
		<input type="password" name="password">
		<br>
		<input type="submit" name="submit" value="ログイン">
	</form>
	<p>
	<%
		String error = String.valueOf(request.getAttribute("errorLogin"));
		if(!error.equals("null")){
			out.write(error);
		}
	%>
	</p>
	<a href="UserRegister">新規ユーザ登録</a>
</body>
</html>