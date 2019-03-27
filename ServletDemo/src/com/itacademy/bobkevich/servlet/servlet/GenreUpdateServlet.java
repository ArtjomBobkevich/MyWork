package com.itacademy.bobkevich.servlet.servlet;

import com.itacademy.bobkevich.servlet.dto.CreateNewGenreDto;
import com.itacademy.bobkevich.servlet.dto.ViewGenreInfoDto;
import com.itacademy.bobkevich.servlet.entity.Genre;
import com.itacademy.bobkevich.servlet.service.GenreService;
import com.itacademy.bobkevich.servlet.util.JspPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update-genre")
public class GenreUpdateServlet extends HttpServlet {

    private GenreService genreService= GenreService.getGenreService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("genres",genreService.findAll());

        getServletContext()
                .getRequestDispatcher(JspPath.get("update-genre"))
                .forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Genre updatedGenre = Genre.builder()
                .name(req.getParameter("name"))
                .id(req.getDateHeader("id"))
                .build();

        Genre savedGenre= genreService.update(updatedGenre);
        resp.sendRedirect("/genre-info?id="+ savedGenre.getId());
    }
}
