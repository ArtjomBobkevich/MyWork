package by.itacademy.servlet;

import by.itacademy.dto.ViewHeroBasicInfoDto;
import by.itacademy.util.JspPathUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/heroes-list")
public class HeroesListServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getSession().setAttribute("requests", Arrays.asList(
                ViewHeroBasicInfoDto.builder()
                        .id(1L)
                        .name("Женщина-невидимка")
                        .build(),
                ViewHeroBasicInfoDto.builder()
                        .id(2L)
                        .name("Супермэн")
                        .build()));

        getServletContext()
                .getRequestDispatcher(JspPathUtil.get("heroes-list"))
                .forward(req,resp);
    }
}
