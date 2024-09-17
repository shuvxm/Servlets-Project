package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Calculator extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Calculator class Service method started...");
		String n1 = req.getParameter("n1");
		String n2 = req.getParameter("n2");
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int sum = num1 + num2;
		int minus = num1- num2;
		int mul = num1 * num2;
		
		System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
		
		PrintWriter pw = res.getWriter();
		pw.write("sum: " +sum);
		pw.write("sub: "+minus);
		pw.write("mul: "+mul);

	}

}
