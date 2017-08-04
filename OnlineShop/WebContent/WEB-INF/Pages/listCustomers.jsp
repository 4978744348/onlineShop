<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Test:</h1>
	<p>listOfAdmins = ${listOfAdmins}
	<p>
	<table border="3">
		<thead>
			<tr>
				<td>id</td>
				<td>name</td>
				<td>password</td>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="listAll" items="${listOfAdmins}">
				<tr>
					<td>${listAll.id}</td>
					<td>${listAll.login}</td>
					<td>${listAll.password}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>