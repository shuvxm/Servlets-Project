package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class Form extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processing doGet() request...");
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("form submiting using post method");
		
		String fnm = req.getParameter("fname");
		String lnm = req.getParameter("Lname");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		String dob = req.getParameter("dob");
		
		// sending data to browser
		resp.setContentType("text/html");
				
		PrintWriter pw = resp.getWriter();
//		pw.println("<h1>Information of Submited Data...</h1>");
		pw.println("<h1>form submitted successfully!</h1>");

//		pw.write("<h2>First name: "+fnm+"</h2>");
//		pw.write("Last name: "+lnm);
//		pw.write("Email: "+email);
//		pw.write("Password: "+pass);
//		pw.write("date of Birth: "+dob);
		
//		pw.write("<h4>First name: "+fnm+"</h4>");
//		pw.write("<h4>Last name: "+lnm+"</h4>");
//		pw.write("<h4>Email: "+email+"</h4>");
//		pw.write("<h4>Password: "+pass+"</h4>");
//		pw.write("<h4>Date of Birth: "+dob+"</h4>");
		
		
		pw.print("""
				<h4>First name: %s  </h4>
				<h4>Last name: %s   </h4>
				<h4>Email: %s       </h4>
				<h4>Password: %s   </h4>
			<h4>Date of Birth: %s  </h4>
				
				
				""".formatted(fnm,lnm,email,pass,dob)
				);

		
	}

}
