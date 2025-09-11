<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin.jsp</title>
<%@include file="component/allcom.jsp" %>

</head>
<body>

    <div class="container-fluid">
     <div class="row>">
     <div class="col m6 offset-m5">
       <div class="card">
       <div class="card-content">
             
             <h3>Admin_Login_here</h3>
             <form action="A1" method = "post">
             <label>Name</label>
             <input type="text" name="u1" id="u1">
             <br>
             <label>Password</label>
              <input type="password" name="u2" id="u2">
              <br>
              <button class="submit btn btn-outline-success ">summit</button>
             </form>
             
       
       </div>
       </div>     
     </div>
     </div>
  
  
  </div> 
</body>
</html>