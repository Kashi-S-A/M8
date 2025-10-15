<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL tags</h1>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<c:set var="a" value="100"></c:set>

	<h2>
		<c:out value="${a}"></c:out>
	</h2>

	<%-- <c:remove var="a" />
	
	<h4>a is removed</h4>
	<h2>
		<c:out value="${a}"></c:out>
	</h2> --%>

	<h2>Using if else condition</h2>

	<c:if test="${a==101}">Yes the value of a is 100</c:if>

	<h2>Else if Ladder</h2>
	<c:set var="b" value="10"></c:set>

	<c:choose>
		<c:when test="${b==50}">b is equal to 50</c:when>
		<c:when test="${b > 50}">b is greater than 50</c:when>
		<c:otherwise>b is less than 50</c:otherwise>
	</c:choose>

	<%-- <c:redirect url="https://www.naukri.com/"></c:redirect> --%>

	<c:import url="https://www.naukri.com/"></c:import>

</body>
</html>