<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login form</title>
<link rel="stylesheet" href=" <%= application.getContextPath() %>/CSS/style.css">
</head>
<body>
	 <div class="container">
	 	<h1>Welcome to the login Page</h1>
        <form action="<%= application.getContextPath() %>/data" method="post">
            <label for="fnm">Full Name:</label>
            <input type="text" name="fname" id="fnm" placeholder="James">
               <br> <br>
            <label for="lnm">Last Name:</label>
            <input type="text" name="lname" id="lnm" placeholder="Bond">
            
            <br> <br>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="yourex@gmail.com">
               <br> <br>
            <label for="pass">Password:</label>
            <input type="password" id="pass" name="password">
               <br> <br>
            <label for="dob">DOB:</label>
            <input type="date" id="dob" name="dob">
               <br> <br>
            <button type="submit">Submit</button>
            
            
        </form>
    </div>
    
   <script src="<%= application.getContextPath() %>/JS/script.js"></script>
</body>
</html>