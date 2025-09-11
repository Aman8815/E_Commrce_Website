package Adminservlet;

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
 * Servlet implementation class newlogin
 */
@WebServlet("/A1")
public class Admin_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out =response.getWriter();
		String s1 =request.getParameter("u1");
		String s2 =request.getParameter("u2");
		 

		out.println("<html>");
		out.println("<body>");
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_management","root","root");
		Statement st = con.createStatement();
		String q="Select * from admin where name='"+s1+"' AND password='"+s2+"'"; 
		 ResultSet rs=st.executeQuery(q);
		 if(rs.next())
		 {
		// Cookie ck=new Cookie("uname",s1);
//		     ck.setMaxAge(60*60);
//		     response.addCookie(ck);
//		     
//		     
		// Cookie ck2=new Cookie("upass",s2);
//		     ck2.setMaxAge(60*30);
//		     response.addCookie(ck2);
		      HttpSession session=request.getSession();
		session.setAttribute("uname", s1);
		response.sendRedirect("Adminmenu.jsp");

		 }
		else
		{
			response.sendRedirect("Admin.jsp");

		}
		con.close();
		}
		catch(Exception e)
		{
		out.println(e);
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
		}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
