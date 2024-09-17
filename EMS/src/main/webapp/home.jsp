<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Employees</title>
<link rel="stylesheet" href=" <%= application.getContextPath() %>/CSS/style.css">
</head>
<body>
    <header class="login-nav">
        <h1>Employee Management System</h1>
        <nav class="home-nav">
            <ul>
                <a href="#"><li>Home</li></a>
                <a href="#"><li>About</li></a>
                <a href="#"><li>Services</li></a>
                <a href="signup.jsp" id="add"><button>Add Employee</button></a>
                <button><li>Logout</li></button>
            </ul>
        </nav>
    </header>
    <div class="container">
        <table border="2">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Password</th>
                <th>Salary</th>
                <th colspan="2">Action</th>
            </tr>
            <%
            ResultSet rs = (ResultSet) request.getAttribute("rs");
            if (rs != null) {
                while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getInt("id") %></td>
                <td><%=rs.getString("name") %></td>
                <td><%=rs.getString("email") %></td>
                <td><%=rs.getString("password") %></td>
                <td><%=rs.getDouble("sal") %></td>
                <td><a href="delete?id=<%=rs.getInt("id")%>"><button>Delete</button></a></td>
                <td><a href="update?id=<%=rs.getInt("id")%>"><button>Update</button></a></td>
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td colspan="6">No employees found.</td>
            </tr>
            <%
            }
            %>
        </table>
    </div>
</body>
</html>
