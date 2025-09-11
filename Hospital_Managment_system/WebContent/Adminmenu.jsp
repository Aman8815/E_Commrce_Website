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
<div>

<h4>Hello  
<%    
HttpSession Session = request.getSession();
String username = (String) Session.getAttribute("uname");
out.println(username);

%>
</h4>

</div>
    <div class="container">
     <div class="row>">
     <div class="col m6 offset-m3">
       <div class="card">
       <div class="card-content">
             
            <h3>Admin Menu</h3> 
            <%@include file="component/navbar.html" %>
             
       
       </div>
       </div>     
     </div>
     </div>
  
  
  </div>
</body>
</html>