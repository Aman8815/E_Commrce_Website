package Adminservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employeeregister
 */
@WebServlet("/m1")
public class Employeeregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		    String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String number = request.getParameter("number");
	        String password =request.getParameter("password");
	        String q ="insert into Employee_register(name,email,number,password)values(?,?,?,?)";
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	String url = "jdbc:mysql://localhost:3306/hospital_management";
	        	String username = "root";
	        	String passward = "root";
	        	
	        	Connection con = DriverManager.getConnection(url,username,passward);
	        	  PreparedStatement pstmt = con.prepareStatement(q);
	        	  pstmt.setString(1,name);
	        	  pstmt.setString(2,email);
	        	  pstmt.setString(3,number);
	        	  pstmt.setString(4,password);
	        	  pstmt.executeUpdate();
	        	  
	        	  String query = "insert into Employee_login(name,password) values(?,?)";
	        	  PreparedStatement stmt = con.prepareStatement(query);
	        	  stmt.setString(1,name);
	        	  stmt.setString(2,password);
	        	  stmt.executeUpdate();
	        	  con.close();
	        	  response.sendRedirect("Adminmenu.jsp");
	        	out.println("Record Update");
	        }catch (Exception e) {
				out.println(e.getMessage());
	        	// TODO: handle exception
			}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
