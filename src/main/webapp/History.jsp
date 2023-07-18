<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shipment History Page</title>
</head>
<body>

<table border ="1" style="width : 100%">
    <tr>
             
       <th>pick address</th>
       <th>Drop address</th>
       <th>Order Type</th>
       <th>Date and time</th>
       <th>Order Status </th>
       <th>Order Id </th>

   </tr> 
   
<%

String username = (String)request.getSession().getAttribute("username");
String password = (String)request.getSession().getAttribute("password");

String Query = "select paddress,daddress,ordertype,Datetime,orderStatus,orderid from shipment_detail where uusername = ? " ;

String driver = "com.mysql.jdbc.Driver";
String Db_url = "jdbc:mysql://localhost:3306/onlinecourierservices";
String Db_username = "root";
String Db_password = "Create@1234";
     try{
    	 Class.forName(driver);
    	 Connection con = DriverManager.getConnection(Db_url,Db_username,Db_password);
    	 PreparedStatement ps = con.prepareStatement(Query);
		 ps.setString(1, username);
		 ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			%>
			<tr> 
			   <td><%=rs.getString("paddress") %></td>
			   <td><%=rs.getString("daddress") %></td>
			   <td><%=rs.getString("ordertype") %></td>
			   <td><%=rs.getString("Datetime") %></td>
			   <td><%=rs.getString("orderStatus") %></td>
			   <td><%=rs.getString("orderid") %></td>
			</tr>
			<% 
			}
 }
 catch(Exception e){
	 
 }
 %>  
 
   
</table>
</body>
</html>