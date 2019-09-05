<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>java</title>
</head>
<body>
	<%
		// javaプログラムを書く
	%>

	<%

		for( int i =0; i < 10; i++){
			//outは暗黙変数
			// ＊暗黙変数…暗黙的に使える変数
			out.write(String.valueOf(i));
		}

		// HTTPリクエストパラメータの取得
		// PHPの$_GET["id"] $_POST["id"]

		out.write(request.getParameter("id"));
		out.write(request.getParameter("name"));

		//->Javaでは, GET/POSTの差を意識する必要がない。
		//　$_REQUEST["id"]とおなじ






	%>
	<!-- out.writeの省略形 -->

	<p><%= request.getParameter("id") %></p>

	<p><%= request.getAttribute("new_id") %></p>
	<p><%= request.getAttribute("new_name") %></p>

	<!-- やってみよう！ -->
	<% %>を使って、new_idをいったん変数に退避

	<%
		String new_id = String.valueOf(request.getAttribute("new_id"));
		Object new_id2 = request.getAttribute("new_id");

	%>
</body>
</html>