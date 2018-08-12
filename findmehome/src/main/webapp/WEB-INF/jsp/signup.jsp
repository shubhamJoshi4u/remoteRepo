<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Indian Properties | Buy/Sell/Rent Properties | Real Estate</title>
</head>
<body>
<H2>User Registration</H2>
<form action="signup/registration" method="post">  
<input type="text" name="userName" value="username" onclick="this.value=''"/><br/>  
<input type="text" name="emailId"  value="email id" onclick="this.value=''"/><br/>  
<input type="password" name="password"  value="password" onclick="this.value=''"/><br/>  
<input type="text" name="city" value="City" onclick="this.value=''"/><br/>  
<input type="text" name="mobileNo"  value="Mobile Number" onclick="this.value=''"/><br/>  
<input type="text" name="userType"  value="user type" onclick="this.value=''"/><br/>
<font color="red"><form:errors path="user.*" /> </font> <br />
<input type="submit" value="register"/>  
</form>  
</body>
</html>