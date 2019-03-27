package by.itacademy.servlet;

import by.itacademy.service.HeroService;
import by.itacademy.util.JspPathUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/heroes-list")
public class HeroesListServlet extends HttpServlet {

    private HeroService heroService = HeroService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("heroes", heroService.findAll());

        getServletContext()
                .getRequestDispatcher(JspPathUtil.get("heroes-list"))
                .forward(req, resp);
    }
}
