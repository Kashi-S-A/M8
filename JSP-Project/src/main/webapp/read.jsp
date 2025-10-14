<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String name = request.getParameter("username");
	String email = request.getParameter("useremail");
	%>

	<h1>
		<%=name%>, Welcome to Demo application
	</h1>
	<h3>
		You account has been registered with email :
		<%=email%>
	</h3>
</body>
</html>