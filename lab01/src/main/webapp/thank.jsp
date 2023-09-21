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
<h1>Thanks for joining our email list </h1>
<p> Here is the information that you entered:</p>

<label style="font-weight: 700;">First Name:</label>
<span>${user.firstName}</span><br>
<label style="font-weight: 700;"> Last Name:</label>
<span>${user.lastName}</span><br>
<label style="font-weight: 700;"> Email:</label>
<span>${user.email}</span><br>
<label style="font-weight: 700;"> Date of Birth:</label>
<span>${user.dateOfBirth}</span><br>

<div class="contactVia">
	
	<p style="font-weight: 700;">You hear about you in: <span style="font-weight: 100">${user.contactVia}</span><br></p>
	
	
</div>
<div class="replyUs">

		<p style="font-weight: 700;">Would you like to receive announcements about new CDs and special offers?<br><span style="font-weight: 100">${user.replyUs}</span><br></p>
</div>
<div class="yourChoose">
	<p style="font-weight: 700;">Please contact me by: <span style="font-weight: 100">${user.yourChoose}</span></p>
</div>

<div class="button">
	<form action="emailList" method="get">
	<input type="hidden" name="action" value="join">
	<input type="submit" value="Return">

</form>
</div>

</body>
</html>