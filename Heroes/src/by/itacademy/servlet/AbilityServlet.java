package by.itacademy.servlet;

import by.itacademy.entity.Ability;
import by.itacademy.service.AbilityService;
import by.itacademy.util.JspPathUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 1 on 11.03.2018.
 */
@WebServlet("/abilities")
public class AbilityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ability> abilities = AbilityService.getInstance().findAll();
        req.setAttribute("abilities", abilities);
        getServletContext()
                .getRequestDispatcher(JspPathUtil.get("abilities"))
                .forward(req, resp);
    }
}
