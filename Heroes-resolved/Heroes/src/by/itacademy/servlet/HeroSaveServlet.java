package by.itacademy.servlet;

import by.itacademy.dto.CreateNewHeroDto;
import by.itacademy.dto.ViewHeroBasicInfoDto;
import by.itacademy.entity.Gender;
import by.itacademy.service.AbilityService;
import by.itacademy.service.HeroService;
import by.itacademy.util.JspPathUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/save-hero")
public class HeroSaveServlet extends HttpServlet {

    private HeroService heroService = HeroService.getInstance();
    private AbilityService abilityService = AbilityService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("abilities", abilityService.findAll());

        getServletContext()
                .getRequestDispatcher(JspPathUtil.get("save-hero"))
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CreateNewHeroDto createNewHeroDto = CreateNewHeroDto.builder()
                .name(req.getParameter("name"))
                .identity(req.getParameter("identity"))
                .age(Integer.parseInt(req.getParameter("age")))
                .gender(Gender.valueOf(req.getParameter("gender")))
                .abilityId(Long.parseLong(req.getParameter("ability")))
                .build();
//        if (validator.validate(dto)) {
            ViewHeroBasicInfoDto savedHero = heroService.save(createNewHeroDto);
            resp.sendRedirect("/show-hero-details?id=" + savedHero.getId());
//        } else {
//
//        }
    }
}
