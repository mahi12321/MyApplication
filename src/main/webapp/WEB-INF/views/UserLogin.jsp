<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
 header{
  color:white;
  margin-left:auto;
  margin-right:auto;
  margin-top:50px;
  border-radius:20px;
  padding:50px;
 }
 header h1{
 color:white;
 font-size: 35px;
 }
 header form{
 color:white;
 font-size: 20px;
 font-family: serif;
 }
 header input{
 border-radius: 5px;
 padding: 3px;
 }
 .login{
 width:450px;
 height:350px;
 border:2px solid #2c2d2e;
 margin-left: 450px;
 margin-top: 5px;
 border-radius: 20px;
 font-weight: bold;
 padding:10px;
 }
 h1{
 margin-bottom: 50px;
 }
 #submit{
 font-size: 15px;
 padding: 5px;
 height: 30px;
 width: 100px;
 }
 h4 a{
 text-decoration: none;
 color:#800404;
 }
</style>
</head>
<body style="background-image: url('/images/laptop7.jpg'); background-repeat: no-repeat; background-size:cover;">
<header>
<div class="login">
<center>
<h1>Login Page</h1>
<form:form action="doLogin" method="POST" modelAttribute="user">
<pre>
USERNAME    <form:input path="userName"/><br/>
PASSWORD    <form:password path="userPwd"/><br/>
          <input type="submit" value="Login" id="submit"/>
</pre>
</form:form>
<h4><a href="reg">Registration !!</a></h4>
<h4 style="color:red" id="reg">${message}</h4>
</center>
</div>
</header>
</body>
</html>