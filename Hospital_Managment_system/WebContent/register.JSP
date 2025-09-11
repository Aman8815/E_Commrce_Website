<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INDEX_JSP</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        
</head>
<body>
    <div class="container">
     <div class="row>">
     <div class="col m6 offset-m3">
       <div class="card">
       <div class="card-content">
             
             <h3>Register Here</h3>
            
             <form action="register" method = "post">
                <label>Name</label>
                <input type ="text" PalceHolder="Enter your name" id ="name" name = "name">            
                 
                 <label>Email</label>
                 <input type = "email" palceholder="Enter your email" id ="email" name="email">            
              
                  <label>Password</label>
                  <input type = "password" placeholder="enter the new password" id="password" name="password">            
                   <button class = " submit btn btn-out-line-success" >summit</button>
             </form>
              
       
       </div>
       </div>     
     </div>
     </div>
</body>
</html>