package demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Form extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		String fnm = 	req.getParameter("Fname");
//		System.out.print(" ");
//		String lnm = 	req.getParameter("Lname");
//		String email = 	req.getParameter("email");
//		String pass = 	req.getParameter("pass");
		
		File f = new File("C:\\Users\\Lenovo\\Desktop\\Advance Java\\JDBC\\home.html");
		FileReader fr = new FileReader(f);
		String s = "";
		int i = fr.read();
		while(i != -1) {
			s = s + (char)i;
			i = fr.read();
		}
		
		PrintWriter pw = res.getWriter();
		pw.write(s);
		
		
	}

}
