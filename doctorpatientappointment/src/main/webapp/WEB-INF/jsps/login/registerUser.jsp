<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action= "registerUser" method="post">
<pre>
last Name: <input type= "text" name="patientlastname"/>
First Name: <input type= "text" name="patientfirstname"/>
street address: <input type= "text" name="patientstreetaddress"/>
area address: <input type= "text" name="patientareaaddress"/>
postal code: <input type= "text" name="patientpostalcode"/>
phone number: <input type= "text" name="patientcontact"/>
gender: <input type= "text" name="patientgender"/>
city: <input type= "text" name="patientcity"/>
email: <input type= "text" name="patientemail"/>
Password: <input type= "password" name="patientpassword"/>
Confirm Password: <input type= "password" name="confirmpassword"/>
<input type="submit" value="register"/>
</pre>
</form>
</body>
</html>



