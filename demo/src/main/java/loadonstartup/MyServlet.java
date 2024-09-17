package loadonstartup;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/a", loadOnStartup=1)
public class MyServlet extends HttpServlet{
	public MyServlet() {
		System.out.println("MyServlet no arg const..");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("my servlet do get method");
	ServletConfig config = getServletConfig();
	System.out.println(config.getInitParameter("class"));
	ServletContext context = getServletContext();
	
	}

}
