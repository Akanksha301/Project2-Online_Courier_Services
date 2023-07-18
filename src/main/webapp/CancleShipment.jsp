<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cancel shipment page</title>
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
<form action = "CancelShipment" method = "post">
<div class = "container">

<label for="yes_no_radio">Are you sure you want to Cancle courier Shipment ?</label>
<p>
<input type="radio" name="yes_no" value = "yes" checked>Yes
</p>
<p>
<input type="radio" name="yes_no" value = "no">No
<br><br>

<label>
Enter Order Id <input type = "text" name = "orderid">

<input type = "submit" value = "submit" ></label>

</p>
</div>

</form>
</body>
</html>