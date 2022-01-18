<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String una = (String) session.getAttribute("uname");
		
	%>
	<h3>Hi <%=una %> this is your Account Setting Page</h3>
	
	<h4><a href="logout.jsp">Logout</a></h4>

</body>
</html>