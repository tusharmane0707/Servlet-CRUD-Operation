<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Are you sure you want to delete employee?</h1>

<form action="delete" method="post">


Employee Id to be Deleted : <input type="number" name="id" value="<%=request.getParameter("id")%>"> <br> <br>			
		 <input type="submit">

</form>
</body>
</html>