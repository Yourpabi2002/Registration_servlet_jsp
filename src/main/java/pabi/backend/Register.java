package pabi.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter out=res.getWriter();
		String myname=req.getParameter("name1");
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		String mygen=req.getParameter("gender1");
		String mycity=req.getParameter("city1");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pabi_reg","root","pabi");
			
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypass);
			ps.setString(4, mygen);
			ps.setString(5, mycity);
			int count=ps.executeUpdate();
			if(count>0) {
				res.setContentType("text/html");
				out.print("<h3 style='color:green'> User Successfully Registered</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
				rd.include(req, res);
			}else {
				res.setContentType("text/html");
				out.print("<h3 style='color:red'> User Not Registered</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
				rd.include(req, res);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
