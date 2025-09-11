<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        
</head>
<body>
<%
HttpSession Session = request.getSession();
String username = (String) Session.getAttribute("uname");
if(username!=null){
out.println(username);
}
%>
    <div class="container">
     <div class="row>">
     <div class="col m6 offset-m3">
       <div class="card">
       <div class="card-content">
             
             <h3>Register Here</h3>
              <h4>Doctor_Login</h4>
              <form action = "docterlogin" mathod = "post">
                <label>Name</label>
                <input type = "text" placeholder="Enter your name" id ="name" name="name">
                <label>Password</label>
                <input type = "password" placeholder="Enter your password" id ="password" name="password">
              <button class="submit">summit</button>
              </form>
              
       </div>
       </div>     
     </div>
     </div>
  
  
  </div>
</body>
</html>