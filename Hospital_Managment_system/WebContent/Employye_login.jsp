<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/allcom.jsp" %>
   <div class="container">
     <div class="row>">
     <div class="col m6 offset-m3">
       <div class="card">
       <div class="card-content">
       <%
       
       HttpSession Session = request.getSession();
       String username = (String) Session.getAttribute("uname");
       if(username!=null){
       out.println(username);
       }
       
       %>
             
             <h3>Register Here</h3>
            
             <form action="Employeelogin" method = "post">
                <label>Name</label>
                <input type ="text" PalceHolder="Enter your name" id ="name" name = "name">            
                 
                 <br>            
              
                  <label>Password</label>
                  <input type = "password" placeholder="enter the new password" id="password" name="password">            
                   <button class = " submit btn btn-out-line-success" >summit</button>
             </form>
              
       
       </div>
       </div>     
     </div>
     </div>
</head>
<body>

</body>
</html>