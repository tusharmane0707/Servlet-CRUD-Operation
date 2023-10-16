<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%! int a=20;		//declaration tag
	int b=25;
	int res;
	%>
	
				
<% res=a+b;   //Scriptlet Tag %>	


<%= res %>	 --%>


	<%
	String s[] = { "abc", "def", "ghi", "jkl" };
	int i=0;
	%>

	<%
	for (; i <= s.length-1; i++) {
	%>
	
	<%=s[i]%>
	
	<%
	}
	%>
</body>
</html>