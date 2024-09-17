<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Update Employee</title>
</head>
<body>

	<% ResultSet rs = (ResultSet) request.getAttribute("rs"); %>
	
	
	
	<h2>Update Employee</h2>
    <form action="update" method="post">
    <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="<%= request.getParameter("name") %>" required><br><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="<%= request.getParameter("email") %>" required><br><br>
    <label for="pass">Password:</label>
    <input type="password" id="pass" name="pass" value="<%= request.getParameter("pass") %>" required><br><br>
    <label for="salary">Salary:</label>
    <input type="number" id="salary" name="salary" value="<%= request.getParameter("salary") %>" required><br><br>
    <button type="submit">Update</button>
</form>

</body>
</html>