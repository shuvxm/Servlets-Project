<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
	margin:0px;
	}
	.f1{
		background-color:rgba(25,45,78);
		color:white;
		display:flex;
		justify-content:center;
		align-items:center;
		flex-direction:column;
		padding-top:10px;
		border-radius:20px;
	}
	input{
	border-radius:10px;
	text-align:center;
	}
	#button{
		margin-left:80px;
	}
</style>
</head>
<body>
	<a href="all"> <button>View All Employee</button></a>
	
	<br><br>
	<h1> <a href="a">My Servlet</a></h1>
	<h1> <a href="os">OurServlet</a></h1>
	
	<br><br>
	
	<a href="login">click here</a>
	<br><br>
	<a href="myaccount">click for my account</a>
	<br><br> <br><br>
	
	<div class="f1">
		<form action="print" method="post">
			<input type="text" name="Fname" placeholder="First Name"> 
			<input type="text" name="Lname" placeholder="Last Name"> <br> <br>
			<input type="email" name="email" placeholder="yourex@gmail.com"> 
			<input type="password" name="pass" placeholder="yourpassword"> <br> <br>
			
			<input type="submit" id="button" value="Submit"/>
		</form>
	</div>
	
	<a href="f11">Print</a>
	
	<br><br><br><br>
	
	<form action="casio">
		<input type="number" name="n1">
		<input type="number" name="n2">
		<button type="submit">ADD</button>
	</form>
	
	<br><br><br><br>
	<br>
	 <center>
            <h2>Login Page</h2>
            <form id="loginFormId" name="loginForm" method="post" action="loginServlet">
                    <span id="user">Username: </span><input type="text" name="username" />
                    <br><br>
                    <span id="pass">Password: </span><input type="password" name="password" />
                      <br><br>
                    <input id="btn" type="submit" value="Login" />
            </form>
        </center>
        
        <br><br><br><br>
        
        <h1><a href="click"> click</a></h1>
        <form action="click" method="post">
        	<button type="submit">click</button>
        </form>
        
</body>
</html>