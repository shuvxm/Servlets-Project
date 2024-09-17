<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Emp Page</title>
</head>
<body>

	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	
	while(rs.next()){
	%>
	<h1><%= rs.getInt(1) %>, <%= rs.getString(2) %>, <%= rs.getDouble(3) %>, <%= rs.getInt(4) %> </h1>
	<%
	}
	%>
	
	
</body>
</html>