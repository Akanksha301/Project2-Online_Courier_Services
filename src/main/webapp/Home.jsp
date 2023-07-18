<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

body{
background : url(HomePageBgImage.jpg);
background-size: 100%;
background-repeat: no-repeat;
}

.topnav {
border-radius: 25px;
height: fit-content;
display: inline-flex;
background-color: rgba(0, 0, 0, .4);
-webkit-backdrop-filter: blur(10px);
backdrop-filter: blur(10px);  
align-items: center;
overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 20px 22px;
  text-decoration: none;
  font-size: 25px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background: linear-gradient(to bottom, #e8edec, #d2d1d3);
  box-shadow: 0px 3px 20px 0px black;
  transform: scale(1.2);
  color: black;
}

.bookshipment {
    position : absolute ;
    top : 20%;
    left : 70% ;
    width: 320px;
    padding: 20px;
    border-radius: 25px;
    background-color: rgba(0, 0, 0, .4);
    -webkit-backdrop-filter: blur(10px);
    backdrop-filter: blur(10px); 
    margin: 0 auto;
}

.bookshipment h1 {
    text-align: center;
    color: #000;
    font-size: 18px;
    text-transform: uppercase;
    margin-top: 0;
    margin-bottom: 20px;
}

.bookshipment p {
text-align: center;
    color: #000;
    font-size: 14px;
    text-transform: uppercase;
    margin-top: 0;
    margin-bottom: 20px;
}

.bookshipment button {
    width: 100%;
    height: 40px;
    background: black;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #e15960;
    color: #fff;
    font-weight: bold;
    text-transform: uppercase;
    font-size: 14px;
    font-family: Montserrat;
    outline: none;
    cursor: pointer;
}

.trackshipment {
    position : absolute ;
    top : 50%;
    left : 70% ;
    width: 320px;
    padding: 20px;
    border-radius: 25px;
    background-color: rgba(0, 0, 0, .4);
    -webkit-backdrop-filter: blur(10px);
    backdrop-filter: blur(10px); 
    margin: 0 auto;
}

.trackshipment h1 {
    text-align: center;
    color: #000;
    font-size: 18px;
    text-transform: uppercase;
    margin-top: 0;
    margin-bottom: 20px;
}

.trackshipment p {
text-align: center;
    color: #000;
    font-size: 14px;
    text-transform: uppercase;
    margin-top: 0;
    margin-bottom: 20px;
}

.trackshipment button {
    width: 100%;
    height: 40px;
    background: black;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #e15960;
    color: #fff;
    font-weight: bold;
    text-transform: uppercase;
    font-size: 14px;
    font-family: Montserrat;
    outline: none;
    cursor: pointer;
}

</style>

<body >
<div class = "container" >
<div class="topnav">
  <a class="http://localhost:8080/OnlineCourierServices/Home.jsp" href="#home">Home</a>
  <a href="http://localhost:8080/OnlineCourierServices/Login.jsp">Login</a>
  <a href="http://localhost:8080/OnlineCourierServices/Registration.jsp">Register</a>
  <a href="http://localhost:8080/OnlineCourierServices/feature.jsp">Feature</a>
  <a href="http://localhost:8080/OnlineCourierServices/contact.jsp">Contact</a>
  <a href="http://localhost:8080/OnlineCourierServices/AboutUs.jsp">About</a>
</div>

<div class="bookshipment">
    <h1>Book your Shipment</h1>
    <p>Book a shipment by requesting pick-up and we'll be at your door Shortly</p>
    <a href = "http://localhost:8080/OnlineCourierServices/BookShipments.jsp">
    <button>Book your Shipment</button>
    </a>
</div>

<div class="trackshipment">
    <h1>Track your Shipment</h1>
    <p>Click to know where your parcel has been reached</p>
    <a href = "http://localhost:8080/OnlineCourierServices/Track.jsp">
    <button>Track your Shipment</button>
    </a>
</div>

</div>


</body>
</html>