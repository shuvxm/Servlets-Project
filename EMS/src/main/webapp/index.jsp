<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login Page</title>
	<link rel="stylesheet" href=" <%= application.getContextPath() %>/CSS/style.css">
</head>

<body>
	<%= session.getAttribute("email") %>
	<%= session.getAttribute("password") %>
	
	 <nav class="login-nav">
    	<h1>Employee Management System</h1>
    
    	<a href="signup.jsp" class="nav-a" >Create Account</a>
    </nav>
    <div class="form-head">
    	<form action="login" method="post">
            <h2>Login from your credentials</h2>
    		<input type="email" name="email" required="required" placeholder="Email *"><br><br>
            <input type="password" name="pass" required="required" placeholder="Password *" ><br><br>
    		<button type="submit">Login</button>
            <a href="signup.jsp" style="text-decoration: none; color:chocolate">click here </a><span>for new account</span>
    	
    	</form>
    </div>
 
    
</body>
</html>