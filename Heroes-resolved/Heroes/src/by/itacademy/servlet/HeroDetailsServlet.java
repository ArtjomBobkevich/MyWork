package by.itacademy.servlet;

import by.itacademy.dto.ViewHeroFullInfoDto;
import by.itacademy.service.HeroService;
import by.itacademy.util.JspPathUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show-hero-details")
public class HeroDetailsServlet extends HttpServlet {

    private HeroService heroService = HeroService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        req.setAttribute("hero", heroService.findById(Long.parseLong(id)));

        getServletContext()
                .getRequestDispatcher(JspPathUtil.get("hero-info"))
                .forward(req, resp);
    }
}
