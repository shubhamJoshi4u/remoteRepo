<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Indian Properties | Buy/Sell/Rent Properties | Real Estate</title>
</head>
<body>
<H2>User Registration</H2>
<form action="/registration" method="post">

I am <input type = "radio" name = "builder">Builder
<input type = "radio" name = "agent">Agent
<input type = "radio" name = "individual">Individual
<input type = "radio" name = "other">Other
<br>
<table>
<tr><td>Email </td>  <td><input type ="text" name = "emailid"> </td> </tr>
<tr><td>password </td>  <td> <input type ="password" name = "password">  </td> </tr>
<tr><td>Name </td> <td><input type ="text" name = "emailid"></td> </tr>
<tr><td>Mobile </td> <td><input type ="text" name = "emailid"></td> </tr>
<tr><td>City </td> <td><input type ="text" name = "emailid"></td> </tr>
</table>
<input type="checkbox" name ="agreed">I agree to the terms and condition
<br>
<input type ="button" name = "submit" value ="Register"> 
</form>
</body>
</html>