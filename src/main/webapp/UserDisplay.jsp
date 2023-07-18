<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ page import = "com.Application.Servlet.*" %>
 <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>

<style>
html {
  line-height: 1.15;
  -webkit-text-size-adjust: 100%;
  box-sizing: border-box;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:root {
  --small-green-circle: #78eea6;
  --main-accent-color: #9b45e4;
  --secondary-accent-color: #e13a9d;
}

a {
  background-color: transparent;
}

img {
  border-style: none;
}

button {
  font-family: inherit;
  font-size: 100%;
  line-height: 1.15;
  margin: 0;
  overflow: visible;
  -webkit-appearance: button;
}

button::-moz-focus-inner,
[type="button"]::-moz-focus-inner {
  border-style: none;
  padding: 0;
}

body {
  margin: 0;
  background: #e6b2c6;
  background: -webkit-linear-gradient(to right, #e6b2c6, #d6e5fa);
  background: linear-gradient(to right, #e6b2c6, #d6e5fa);
  font-family: "Lato", sans-serif;
  font-weight: normal;
  background-repeat: no-repeat;
}

.container {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(200px, auto));
  justify-content: center;
  align-items: center;
  height: 100vh;
  text-align: center;
}

.card {
  padding: 1em;
  border-radius: 0.8em;
  background-color: #fefefe;
  box-shadow: 0 2.8px 2.2px rgba(0, 0, 0, 0.02),
    0 6.7px 5.3px rgba(0, 0, 0, 0.028), 0 12.5px 10px rgba(0, 0, 0, 0.035),
    0 22.3px 17.9px rgba(0, 0, 0, 0.042), 0 41.8px 33.4px rgba(0, 0, 0, 0.05),
    0 100px 80px rgba(0, 0, 0, 0.07);
  position: relative;
}

.card__image {
    width: 100px;
    border-radius: 50%;
    border : 2px solid black ;
}

.card__info {
  margin: 1em 0;
  list-style-type: none;
  padding: 0;
}

.card__text h3 {
  margin-bottom: 0.3em;
  font-size: 1.4em;
  color: #6f6f6f;
  font-family: Helvetica, Arial, sans-serif;

}

.card__text p {
  margin: 0;
  color: #999;
  font-size: 0.95em;
}

.card__action {
  display: flex;
  justify-content: space-around;
}

.profile__button {
  padding: 0.9em 1.3em;
  text-transform: uppercase;
  color: #fff;
  border: none;
  border-radius: 0.5em;
  cursor: pointer;
  position: relative;
}

.profile__button:before {
  content: "";
  position: absolute;
  border-radius: 0.5em;
  transition: all 0.35s ease-in-out;
}

.profile__button:hover:before {
  top: -6px;
  bottom: -6px;
  left: -6px;
  right: -6px;
}

.profile--bookShipment {
  background-color: var(--secondary-accent-color);
  width : 80% ;
}

.profile__button:hover:before {
  border: 4px solid var(--secondary-accent-color);
  
}

.profile--trackShipment {
  background-color: var(--secondary-accent-color);
  width : 80% ;
}

.profile--trackShipment:hover:before {
  border: 4px solid var(--secondary-accent-color);
}

.profile--history {
  background-color: var(--secondary-accent-color);
  width : 80% ;
}

.profile--history:hover:before {
  border: 4px solid var(--secondary-accent-color);
}

.profile--cancelShipment {
  background-color: var(--secondary-accent-color);
  width : 80% ;
}

.profile--cancelShipment:hover:before {
  border: 4px solid var(--secondary-accent-color);
}

.profile--deleteAccount {
  background-color: var(--secondary-accent-color);
  width : 80% ;
}

.profile--deleteAccount:hover:before {
  border: 4px solid var(--secondary-accent-color);
}

.profile--logout {
  background-color: var(--secondary-accent-color);
  width : 80% ;
}

.profile--logout:hover:before {
  border: 4px solid var(--secondary-accent-color);
}

@media (min-width: 425px) {
  .card {
    padding: 3em;
  }

  .card:after {
    top: 50px;
    right: 160px;
  }

  .profile__button {
    padding: 0.9em 1.8em;
  }
}
</style>

<body>
<main class="container">
  <div class="card">
  <img src="img_162386.png" alt="User image" class="card__image" />
    <div class="card__text">
     
      <h3><i>WELCOME
      <% 
      String username = (String)request.getSession().getAttribute("username");
      String password = (String)request.getSession().getAttribute("password");

      String Query = "select uname from user_register where uusername = ? and upassword = ? " ;

     String driver = "com.mysql.jdbc.Driver";
     String Db_url = "jdbc:mysql://localhost:3306/onlinecourierservices";
     String Db_username = "root";
     String Db_password = "Create@1234";
     try{
    	 Class.forName(driver);
    	 Connection con = DriverManager.getConnection(Db_url,Db_username,Db_password);
    	 PreparedStatement ps = con.prepareStatement(Query);
		 ps.setString(1, username);
		 ps.setString(2, password);
		 ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			%>
			   <%= rs.getString("uname") %>
			<% 
			}
 }
 catch(Exception e){
	 
 }
 %>
 </i></h3>
      <p></p>
    </div>
  
    <div class="profile">
       <a href = "http://localhost:8080/OnlineCourierServices/Home.jsp">
      <button class="profile__button profile--deleteAccount">Home</button>
      </a>
      <br><br>
      <a href = "http://localhost:8080/OnlineCourierServices/BookShipments.jsp">
      <button class="profile__button profile--bookShipment">Book Shipment</button>
      </a>
      <br><br>
      <a href = "http://localhost:8080/OnlineCourierServices/Track.jsp">
      <button class="profile__button profile--trackShipment">Track Shipment</button>
      </a>
      <br><br>
      <a href = "http://localhost:8080/OnlineCourierServices/History.jsp">
      <button class="profile__button profile--history">History</button>
      </a>
      <br><br>
      <a href = "http://localhost:8080/OnlineCourierServices/CancleShipment.jsp">
      <button class="profile__button profile--cancelShipment">Cancel Shipment</button>
      </a>
      <br><br>
      <a href = "http://localhost:8080/OnlineCourierServices/Logout.jsp">
      <button class="profile__button profile--logout">Logout</button>
      </a>
      <br><br>
      <a href = "http://localhost:8080/OnlineCourierServices/DeleteAccount.jsp">
      <button class="profile__button profile--deleteAccount">Delete Account</button>
      </a>
      <br><br>
    </div>
  </div>
</main>
</body>
</html>