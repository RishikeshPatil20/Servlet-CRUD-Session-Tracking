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
	<form action="updateEmployee" method="post">
		Update EmpId :<input type="text" name="id" value="<%=request.getParameter("updateid") %>"><br>	 
		OldEmail:<input type="email" name="update_old_email"><br><br> 
		NewEmail:<input type="email" name="update_new_email"><br>



 <!-- 	<br> Gender:<input type="text" name="updategender"><br>
		<br> Salary:<input type="text" name="updatesalary"><br>
		Name:<input type="text" name="updatename"><br><br> -->
		<br> <input type="submit">
	</form>
</body>
</html>