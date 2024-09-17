package demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class B extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("B class");
		System.out.print(req.getParameter("Fname"));
		System.out.print(" ");
		System.out.println(req.getParameter("Lname"));
		System.out.println(req.getParameter("email"));
		System.out.println(req.getParameter("pass"));
	}

}
