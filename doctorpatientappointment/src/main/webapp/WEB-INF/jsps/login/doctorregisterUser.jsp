<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action= "doctorregisterUser" method="post">
<pre>
last Name: <input type= "text" name="doctorlastname"/>
First Name: <input type= "text" name="doctorfirstname"/>
street address: <input type= "text" name="doctorstreetaddress"/>
area address: <input type= "text" name="doctorareaaddress"/>
postal code: <input type= "text" name="doctorpostalcode"/>
phone number: <input type= "text" name="doctorcontact"/>
Doctor Type: <input type= "text" name="doctortype"/>
Doctor Experience: <input type= "text" name="doctorexperience"/>
Doctor availability on sunday: <input type= "text" name="doctorsunday"/>
Doctor availability on monday: <input type= "text" name="doctormonday"/>
Doctor availability on tuesday: <input type= "text" name="doctortuesday"/>
Doctor availability on wednesday: <input type= "text" name="doctorwednesday"/>
Doctor availability on thursday: <input type= "text" name="doctorthursday"/>
Doctor availability on friday: <input type= "text" name="doctorfriday"/>
Doctor availability on saturday: <input type= "text" name="doctorsaturday"/>
gender: <input type= "text" name="doctorgender"/>
city: <input type= "text" name="doctorcityid"/>
email: <input type= "text" name="doctoremail"/>
Password: <input type= "password" name="doctorpassword"/>
Confirm Password: <input type= "password" name="confirmpassword"/>
<input type="submit" value="register"/>
</pre>
</form>
</body>
</html>