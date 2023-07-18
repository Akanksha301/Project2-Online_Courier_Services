<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<Style>
.title-word {
  animation: color-animation 4s linear infinite;
}

.title-word-1 {
  --color-1: #DF8453;
  --color-2: #3D8DAE;
  --color-3: #E4A9A8;
}

.title-word-2 {
  --color-1: #DBAD4A;
  --color-2: #ACCFCB;
  --color-3: #17494D;
}

.title-word-3 {
  --color-1: #ACCFCB;
  --color-2: #E4A9A8;
  --color-3: #ACCFCB;
}

.title-word-4 {
  --color-1: #3D8DAE;
  --color-2: #DF8453;
  --color-3: #E4A9A8;
}

@keyframes color-animation {
  0%    {color: var(--color-1)}
  32%   {color: var(--color-1)}
  33%   {color: var(--color-2)}
  65%   {color: var(--color-2)}
  66%   {color: var(--color-3)}
  99%   {color: var(--color-3)}
  100%  {color: var(--color-1)}
}

/* Here are just some visual styles. 🖌 */

.container {
  display: grid;
  place-items: center;  
  text-align: center;
  height: 100vh
}

.title {
  font-family: "Montserrat", sans-serif;
  font-weight: 400;
  font-size: 5.6vw;
  text-transform: uppercase;
}
</Style>
<body>

<div class="container">
  <h2 class="title">
    <span class="title-word title-word-1">Shipment</span>
    <span class="title-word title-word-2">book</span>
    <span class="title-word title-word-3">Successfully</span>
    <br><br>
    <span class="title-word title-word-4">OrderId :
    <% 

String username = (String)request.getSession().getAttribute("username");
String password = (String)request.getSession().getAttribute("password");


String driver = "com.mysql.jdbc.Driver";
String Db_url = "jdbc:mysql://localhost:3306/onlinecourierservices";
String Db_username = "root";
String Db_password = "Create@1234";

String Query = "Select orderid from shipment_detail where uusername = ?";


try{
	 Class.forName(driver);
	 Connection con = DriverManager.getConnection(Db_url,Db_username,Db_password);
	 PreparedStatement ps = con.prepareStatement(Query);
		ps.setString(1, username);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			%>
			<%= rs.getInt("orderid") %>
			<%
			}
			
}
catch(ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}
catch(SQLException e){
	 e.printStackTrace();
}

%>
    </span>
  </h2>
</div> 

</body>
</html>