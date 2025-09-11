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
             
             <h3>Register Here</h3>
            
             <form action="m1" method = "post">
                <label>Name</label>
                <input type ="text" PalceHolder="Enter your name" id ="name" name = "name">            
                 <br>
                 <label>Email</label>
                 <input type = "email" palceholder="Enter your email" id ="email" name="email">            
                <br>
                <label>number</label>
                <input type = "number" placeholder="enter the number" id="number" name="number">
                  <label>Password</label>
                  <br>
                  <input type = "password" placeholder="enter the new password" id="password" name="password">  
                  <br>          
                   <button class = " submit btn btn-out-line-success" >summit</button>
             </form>
              
       
       </div>
       </div>     
     </div>
     </div>
</body>
</html>