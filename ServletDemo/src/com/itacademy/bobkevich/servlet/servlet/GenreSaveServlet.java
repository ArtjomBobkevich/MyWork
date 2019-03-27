package com.itacademy.bobkevich.servlet.servlet;

import com.itacademy.bobkevich.servlet.dto.CreateNewGenreDto;
import com.itacademy.bobkevich.servlet.dto.ViewGenreInfoDto;
import com.itacademy.bobkevich.servlet.service.GenreService;
import com.itacademy.bobkevich.servlet.util.JspPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/save-genre")
public class GenreSaveServlet extends HttpServlet {

    private GenreService genreService= GenreService.getGenreService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("genres",genreService.findAll());

        getServletContext()
                .getRequestDispatcher(JspPath.get("save-genre"))
                .forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CreateNewGenreDto createNewGenreDto=CreateNewGenreDto.builder()
                .name(req.getParameter("name"))
                .build();

        ViewGenreInfoDto savedGenre= genreService.save(createNewGenreDto);
        resp.sendRedirect("/genre-info?id="+ savedGenre.getId());
    }
}
