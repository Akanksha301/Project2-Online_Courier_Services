<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body
{
  font-family: "Open Sans";
}
#wrapper
{
  border: 1px solid #888;
  display: inline-block;
  padding:20px;
  
}
</style>
<body>
<form action = "DeleteAccount" method = "post">
<div class = "container">

<label for="yes_no_radio">Are you sure you want to delete account from Quick~Services</label>
<p>
<input type="radio" name="yes_no" value = "yes" checked>Yes
</p>
<p>
<input type="radio" name="yes_no" value = "no">No
<br><br>
<input type = "submit" value = "submit" >
</p>
</div>

</form>
</body>
</html>