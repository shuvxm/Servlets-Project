package ems;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        String salaryStr = req.getParameter("salary");

        if (idStr == null || name == null || email == null || pass == null || salaryStr == null) {
            // Handle the case where any of the parameters is null
            req.setAttribute("error", "Missing required fields");
            RequestDispatcher rd = req.getRequestDispatcher("updateEmployee.jsp");
            rd.forward(req, resp);
            return;
        }

        int id = Integer.parseInt(idStr.trim());
        double salary = Double.parseDouble(salaryStr.trim());

        Connection con = null;
        PreparedStatement ps = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "root");

            // Prepare the SQL update statement
            String sql = "UPDATE emp SET name=?, email=?, password=?, sal=? WHERE id=?";
            ps = con.prepareStatement(sql);

            // Set the values for the prepared statement
            ps.setString(1, name.trim());
            ps.setString(2, email.trim());
            ps.setString(3, pass.trim());
            ps.setDouble(4, salary);
            ps.setInt(5, id);

            // Execute the update
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                resp.sendRedirect("viewEmployees");
            } else {
                req.setAttribute("error", "No employee found with the given ID");
                RequestDispatcher rd = req.getRequestDispatcher("updateEmployee.jsp");
                rd.forward(req, resp);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources in the finally block
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
