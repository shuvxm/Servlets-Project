<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Account</title>
<link rel="stylesheet" href=" <%= application.getContextPath() %>/CSS/style.css">
</head>
<body>
	 <header class="login-nav">
    	<h1>Employee Management System</h1>
    	<nav class="signup-nav">
    	    <a href="index.jsp"class="nav-a">Login</a>
        </nav>
    </header>
    <div class="form-head signup-main">
    	<form action="signup" method="post">
            <h2>Give your credentials for Signup</h2>
            <input type="number" name="id" required placeholder="ID *"> <br><br>
            <input type="text" name="name" required placeholder="Name *"> <br><br>
            <input type="email" name="email" required="required" placeholder="Email *"><br><br>
            <input type="password" name="pass" required="required" placeholder="Password *" ><br><br>
            <input type="number" name="salary"  placeholder="Salary"> <br><br>
            <input type="text" name="deptno" required placeholder="Dept No"> <br><br>
            <button type="submit" style="text-align: center; margin-left: 14%;">Signup</button>
            <!-- <a href="" style="text-decoration: none; color:chocolate">click here </a><span>for new account</span> -->
    		<p>Already have an account? <a href="login.jsp">Login here</a></p>
    	</form>
    	
    </div>
</body>
</html>