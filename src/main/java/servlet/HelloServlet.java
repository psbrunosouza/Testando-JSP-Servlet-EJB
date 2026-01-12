package servlet;

import ejb.LivrosEJB;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @EJB
    private LivrosEJB livrosEJB;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name == null || name.isEmpty()) {
            name = "Mundo";
        }

        String message = livrosEJB.sayHello(name);

        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println(message);
    }
}
