package by.itacademy.servlet;

import by.itacademy.dto.ViewHeroFullInfoDto;
import by.itacademy.util.JspPathUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show-heroes-details")
public class AllAboutHeroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("request2", ViewHeroFullInfoDto.builder()
                .name("Супермэн")
                .identity("Кларк Кент")
                .age(40)
                .gender("MALE")
                .abilityName("Сверхсила")
                .build());

        getServletContext()
                .getRequestDispatcher(JspPathUtil.get("show-heroes-details"))
                .forward(req, resp);
    }
}