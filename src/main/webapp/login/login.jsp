<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<center>
		<br/><br/>
		<p>Please input user name and password to login!</p>
		<form action="<%= request.getContextPath() %>/loginServlet" method="post">
			User Name:<input name="userName" type="text"/><br/><br/>
			Password:<input name="password" type="password"/><br/><br/>
			<input type="submit" value="LOGIN">&nbsp&nbsp&nbsp
			<input type="reset" value="RESET">
		</form>
	</center>
</body>
</html>