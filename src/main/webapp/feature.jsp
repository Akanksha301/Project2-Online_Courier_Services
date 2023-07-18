<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feature page</title>
</head>
<style>
body{
height : 100% ;
background : white ;
}

.right{
  position: absolute;
  top: 20;
  right: 0;
  box-sizing: border-box;
  padding: 30px;
  width: 700px;
  height: 700px;
  background: url(image1.jpg);
  background-size: cover;
  background-position: center;
  border-radius: 0 2px 2px 0;
}

.left {
  position: absolute;
  top: 0;
  left: 0;
  box-sizing: border-box;
  padding: 40px;
  width: 800px;
  height: 800px;
}

button {
	border-radius: 30px;
	border: 1px solid #daebe8;
	background-color: #87bdd8;
	color: #FFFFFF;
	font-size: 30px;
	font-weight: bold;
	padding: 12px 45px;
	letter-spacing: 1px;
}

</style>


<body>
<div class = "container">
<div class = "left">

<button>Pick-up Services</button>
<br><br><br>
<button>Home Delivery  </button>
<br><br><br>
<button>Security</button>
<br><br><br>
<button>Tracking  </button>
<br><br><br>
<button>International Courier Services</button>
<br><br><br>
<button>Express Delivery Services </button>

</div>

<div class = "right">
</div>

</div>
</body>
</html>