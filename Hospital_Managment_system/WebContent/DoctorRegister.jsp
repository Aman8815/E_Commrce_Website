<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/allcom.jsp" %>
</head>
<body>
   <div class="container">
     <div class="row>">
     <div class="col m6 offset-m3">
       <div class="card">
       <div class="card-content">
             
             <h3> Doctor_Register Here</h3>
             <form action = "Doctor_register" method ="post">
             <label>Docter_name</label>
              <input type ="text"  placeholder="Enter the name" name="d1" id="d1">
              <br>
              <label>Docter_email</label>
              <input type="email" placeholder="Enter the email" name="d2" id="d2">
              <br>
              <label> Doctor_contect</label>
              <input type="number" placeholder="Enter the number" name="d3" id="d3">
              <br>
              <label>Doctor_password</label>
              <input type="passwprd" placehoder="Enter the password" name="d4" id="d4">
             <button class="Submit">Summit</button>
              </form>
       </div>
       </div>     
     </div>
     </div>
  
  
  </div>
</body>
</html>