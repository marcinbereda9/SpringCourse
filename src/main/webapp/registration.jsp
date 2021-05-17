<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizza Order</title>
</head>
<body>
<h1>Registration form</h1><br>
	<form method="POST">
		<label>User name: </label>
		<input type="text" name="Name"/><br>
		<label>User last name: </label>	
		<input type="text" name="LastName"/><br>
		<label>Phone number: </label>	
		<input type="number" name="phoneNumber"/><br>
		<label>Address: </label>	
		<input type="text" name="addres"/><br>
		<label>postNumber: </label>	
		<input type="text" name="postNumber"/><br>
		<label>City: </label>	
		<input type="text" name="City"/><br>
		
		<input type="submit" name="submit" value="submit">
	</form>
</body>
</html>