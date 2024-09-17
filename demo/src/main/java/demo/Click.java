package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/click")
public class Click extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("click class doGet()");
		
		PrintWriter pw = resp.getWriter();
		pw.write("<html><body style='background:cyan;'><h1>hello</h1></body></html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("click class doPost()");
		PrintWriter pw = resp.getWriter();
		pw.write("<html><body style='background:cyan;'><h1>hii</h1></body></html>");
	}
}
