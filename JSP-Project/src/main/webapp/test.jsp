<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is test JSP</h1>
	
	<!-- Declaration Tag -->
	
	<%!
		String course = "Servlet and JSP";
		static int days = 5 ;
	
		public String getMessage(){
			return "Good Afternoon";
		}
	%>
	
	<!-- Expression Tag -->
	
	<h3>course : <%=course %></h3>
	<h3>days : <%=days %></h3>
	<h3>message : <%=getMessage() %></h3>
	
	<!-- Scriptlet Tag -->
	
	<%
	
		int a = 100;
	
		out.print("This is service method");
	%>
	
</body>
</html>