package index;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class docterlogin
 */
@WebServlet("/docterlogin")
public class docterlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("name");
	    String password = request.getParameter("password");
	    PrintWriter out = response.getWriter();
	    
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	String url = "jdbc:mysql://localhost:3306/Hospital_management";
	    	String username = "root";
	    	String passward = "root";
	    	String s1 = "Please re-enter the password and name";
	    	
	    	Connection con = DriverManager.getConnection(url,username,passward);
	    	Statement st = con.createStatement();
			String q="Select * from Docter_login where name='"+name+"' AND password='"+password+"'"; 
			 ResultSet rs=st.executeQuery(q);
			 if(rs.next())
			 {
			// Cookie ck=new Cookie("uname",s1);
//			     ck.setMaxAge(60*60);
//			     response.addCookie(ck);
//			     
//			     
			// Cookie ck2=new Cookie("upass",s2);
//			     ck2.setMaxAge(60*30);
//			     response.addCookie(ck2);
			      HttpSession session=request.getSession();
			session.setAttribute("uname",name);
			response.sendRedirect("Adminmenu.jsp");

			 }
			else
			{HttpSession session=request.getSession();
			session.setAttribute("uname",s1);
				 
				response.sendRedirect("Doctor_Login.jsp");

			}
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
