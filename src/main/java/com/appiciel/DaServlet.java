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
        name = "DaServlet",
        urlPatterns = "/accueil"
)
public class DaServlet extends HttpServlet {

    public DaServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("WORKING");
        /**
         * Set the content type
         */
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>DaServlet test</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to my DaServlet</h1>");
        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST WORKING");
        resp.setContentType("text/html");
        RequestDispatcher requestDispatcher;
        /**
         * Set the content type
         */
        requestDispatcher = req.getRequestDispatcher("index.jsp");

        requestDispatcher.forward(req, resp);

    }
}
