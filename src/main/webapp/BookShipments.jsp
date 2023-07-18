<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Shipment Page</title>
</head>
<style>
body{
background : linear-gradient(to right,#00ffff 0%, #0000ff 100%);

}
.container{
    position : absolute ;
    top : 100px;
    left :25% ;
    background-color: rgba(0, 0, 0, .4);
    -webkit-backdrop-filter: blur(10px);
    backdrop-filter: blur(10px);
  	box-shadow: 0 14px 28px rgba(0,0,0,0.25), 0 10px 10px rgba(0,0,0,0.22);
	width: 768px;
	max-width: 100%;
	min-height: 480px;
	padding: 40px;
}

h1 {
  margin: 0 0 20px 0;
  font-weight: 300;
  font-size: 28px;
}

input {
  display: block;
  box-sizing: border-box;
  margin-bottom: 20px;
  padding: 4px;
  width: 220px;
  height: 32px;
  border: none;
  border-bottom: 1px solid #AAA;
  font-family: 'Roboto', sans-serif;
  font-weight: 400;
  font-size: 15px;
  transition: 0.2s ease;
}

.right{
height : fit-content ;
position : absolute ;
top : 0 ;
left : 50% ;
padding: 40px; 
}

.bottomright{
height : fit-content ;
position : absolute ;
top : 37% ;
left : 50% ;
padding: 40px; 
}

.radio1{
position : absolute ;
top : 70% ;
left : 90px ;
width : 100% ;
height : 2em ;
border-radius : -20% ;
}

.radio2{
position : absolute ;
top : 100% ;
left : 90px ;
width : 100% ;
border-radius : -20% ;
}

span{
position : absolute ;
top : 20%;
left : -20% ;
font-family: 'Roboto', sans-serif;
font-weight: 400;
font-size: 17px;
background : white ;
}

input[type="submit"] {
  position : center ;
  margin-top: 28px;
  width: 120px;
  height: 32px;
  background: black;
  border: none;
  border-radius: 2px;
  color: #FFF;
  font-family: 'Roboto', sans-serif;
  font-weight: 500;
  text-transform: uppercase;
  transition: 0.1s ease;
  cursor: pointer;
}

</style>
<body>
<form action = "BookShipment" method = "post">
<div class = "container">

<div class = "left">
<h1>Pick-Up Location</h1>
    
    <input type="text" name="paddress" placeholder="Pick Address" />
    <input type="text" name="pcountry" placeholder="Pick Country" />
    <input type="text" name="ppincode" placeholder="Pick pincode" />
</div>
<div class = "right">
<h1>Drop Location</h1>
    
    <input type="text" name="daddress" placeholder="Drop Address" />
    <input type="text" name="dcountry" placeholder="Drop Country" />
    <input type="text" name="dpincode" placeholder="Drop pincode" />
    
   </div>
   <div class = "bottomleft">
   <h1> Parcel Details</h1>
    
    <input type="text" name="height" placeholder="Height" />
    <input type="text" name="width" placeholder="Width" />
    <input type="text" name="weight" placeholder=" Weight in kg " />
   </div>
   
   <div class = "bottomright">
   <h1>Delivery Type</h1>
   <label class="radio1">
   <input name="radio" type="radio" checked value = "standard" >
   <span>Standard Delivery</span>
   </label>
   <label class="radio2">
   <input name="radio" type="radio" value = "express" >
   <span>Express Delivery</span>
   </label>
   </div>
    
    <input type = "submit" value = "submit">
</div>

</form>

</body>
</html>