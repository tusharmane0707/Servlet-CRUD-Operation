<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Employee Update Portal</h1>

<form action="update" method="post">


Enter Id : <input type="number" name="id" value="<%=request.getParameter("id") %>"> <br> <br>
Enter Old Email : <input type="email" name="old_email"> <br> <br>
Enter New Email : <input type="email" name="email"> <br> <br>
		 <input type="submit">

</form>

</body>
</html>