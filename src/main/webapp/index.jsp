<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to REst</h1>
<hr>
<a href = "${pageContext.request.contextPath }/hello">hellow Rest</a>
<br><br>
<a href = "${pageContext.request.contextPath }/api/students">list student</a>

</body>
</html>