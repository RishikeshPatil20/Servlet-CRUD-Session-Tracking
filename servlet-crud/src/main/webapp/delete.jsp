<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Employee Portal</h2>
	<form action="delete" method="post">
		Delete Id :<input type="text" name="deleteid" value="<%=request.getParameter("delid") %>"><br>	
		<br> <input type="submit">
	</form>
</body>
</html>