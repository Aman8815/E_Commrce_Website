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
 * Servlet implementation class Doctor_register
 */
@WebServlet("/Doctor_register")
public class Doctor_register extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("d1");
	    String email = request.getParameter("d2");
	    String number = request.getParameter("d3");
	    String password = request.getParameter("d4");
	    PrintWriter out = response.getWriter();
	    String q = "insert into Docter_Register(name,email,number,password) values(?,?,?,?) ";
	    try { 
	    	 
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	String url = "jdbc:mysql://localhost:3306/Hospital_management";
	    	String username="root";
	    	String passward = "root";
	    	
	    	Connection con = DriverManager.getConnection(url,username,passward);
	    	  
	    	PreparedStatement stmt = con.prepareStatement(q);
	    	stmt.setString(1,name);
	    	stmt.setString(2, email);
	    	stmt.setString(3,number);
	    	stmt.setString(4,password);	 
	    	stmt.executeUpdate();
	        out.println("Rcord inserted");
	        
	        
	        
//	        login inserted in docter login details
	        
	        String query = "insert into Docter_login(name,password) values(?,?)";
	        PreparedStatement pstmt = con.prepareStatement(query);
	        pstmt.setString(1,name);
	        pstmt.setString(2,password);
	        pstmt.executeUpdate();
	        out.println("Login recored update");
	        
	        con.close();
	    }catch (Exception e) {
			out.println(e.getMessage());
		}
	    
	    
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
