<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ユーザー登録</h1>
	<form action="UserRegister" method="post">
		<label>ID:</label>
		<input type="text" name="id">
		<br>
		<label>Password:</label>
		<input type="password" name="password">
		<br>
		<input type="submit" name="submit" value="登録">
	</form>
	<p>
	<%
		String error = String.valueOf(request.getAttribute("error"));
		if(!error.equals("null")){
			out.write(error);
		}
	%>
	</p>
	<a href="Login">戻る</a>
</body>
</html>