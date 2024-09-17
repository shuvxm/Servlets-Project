package ems;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//@WebServlet("/login")
public class EmployeeLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		System.out.println(email);
		System.out.println(password);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			PreparedStatement ps = con.prepareStatement("select * from emp where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				HttpSession session = req.getSession();
				session.setAttribute("email", rs.getString(3));
				session.setAttribute("password", rs.getString(4));
				RequestDispatcher rd = req.getRequestDispatcher("abc.jsp");
				rd.forward(req, resp);
			}
			else {
				PrintWriter pw = resp.getWriter();
				pw.write("<html><body><h1>Invalid Credentials</h1></body></html>");
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.include(req, resp);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	
	}

}
