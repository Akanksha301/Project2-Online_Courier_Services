<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  font-size: 4.0vw;
  text-transform: uppercase;
}
</Style>
<body>

<div class="container">
  <h2 class="title">
    <span class="title-word title-word-1">Registration</span>
    <span class="title-word title-word-2">Sucessesful</span>
    <span class="title-word title-word-3"><a href = "http://localhost:8080/OnlineCourierServices/Login.jsp">Please login</a></span>
    
    
  </h2>
</div>
</body>
</html>