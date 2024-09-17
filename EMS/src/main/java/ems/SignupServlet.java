package ems;

import java.io.IOException;
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

@WebServlet(urlPatterns = "/signup")
public class SignupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        double sal = Double.parseDouble(req.getParameter("salary"));

        Connection con = null;
        PreparedStatement ps = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "root");

            // Prepare the SQL statement
            String sql = "INSERT INTO emp (id, name, email, password, sal) VALUES (?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);

            // Set the values for the prepared statement
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, pass);
            ps.setDouble(5, sal);

            // Execute the update
            ps.executeUpdate();

            // Redirect to a servlet that retrieves all employees and forwards to home.jsp
//            resp.sendRedirect("ViewEmployeesServlet");
            

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
//        } finally {
//            // Close resources in the finally block
//            try {
//                if (ps != null) ps.close();
//                if (con != null) con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "root");
			ps = con.prepareStatement("select * from emp");
			
			ResultSet rs = ps.executeQuery();
			
			req.setAttribute("rs", rs);
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
			
			
			ps.close();
			con.close();

		} catch (ClassNotFoundException | SQLException es) {
			es.printStackTrace();
		}
    }
    }
}
