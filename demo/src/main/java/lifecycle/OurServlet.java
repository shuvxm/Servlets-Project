package lifecycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/os")
public class OurServlet extends HttpServlet{
	
	public OurServlet() {
		System.out.println("Our servlet no arguments constructor");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("our servlet class init() method");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("our servlet service() method");
	}
	@Override
	public void destroy() {
		System.out.println("our servlet destroy() method");
	}

}