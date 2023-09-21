<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./1.css"  type="text/css"/>
</head>
<body>
<h1> Join our email list </h1>
<p>To join our email list, enter your name and email address below.</p>
<form action="emailList" method="post">
	<input type="hidden" name="action" value="add">
	<label> Email:</label>
	<input type="email" name="email" required><br>
	<label>First Name:</label>
	<input type="text" name="firstName" required><br>
	<label> Last Names </label>
	<input type="text" name="lastName" required><br>
	<label>&nbsp;</label>
	<input type="submit" value="Join Now" id="submit">
</form>
</body>
</html>