<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
    <%
        HttpSession sessions = request.getSession(false);
        if (sessions != null && sessions.getAttribute("email") != null) {
            String email = (String) session.getAttribute("email");
            out.println("<h1>Welcome, " + email + "</h1>");
        } else {
            out.println("<h1>Please log in first</h1>");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
        }
    %>
</body>
</html>
