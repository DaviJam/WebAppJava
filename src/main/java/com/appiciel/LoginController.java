package com.appiciel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "LoginServlet",
        urlPatterns = "/login"
)
public class LoginController extends HttpServlet {

    public LoginController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Login WORKING");

        RequestDispatcher requestDispatcher;
        /**
         * Set the content type
         */
        requestDispatcher = req.getRequestDispatcher("userform.jsp");

        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST WORKING");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String userId = req.getParameter("Ident");
        String surname = req.getParameter("Surname");
        String name = req.getParameter("Name");
        String email = req.getParameter("Email");
        String pass = req.getParameter("Password");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>DaServlet test</title>");
        out.println("</head>");
        out.println("<body>");
        out.printf("<h1>User identification is %s</h1>", userId);
        out.printf("<h1>User surname is %s</h1>", surname);
        out.printf("<h1>User name is %s</h1>", name);
        out.printf("<h1>User email is %s</h1>", email);
        out.printf("<h1>User pass is %s</h1>", pass);

        out.println("</body>");
        out.println("</html>");

    }
}
