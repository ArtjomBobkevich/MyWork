package com.itacademy.bobkevich.servlet.servlet;

import com.itacademy.bobkevich.servlet.entity.Resource;
import com.itacademy.bobkevich.servlet.service.GenreService;
import com.itacademy.bobkevich.servlet.util.JspPath;
import com.itacademy.bobkevich.servlet.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@WebServlet("/resources-by-genre-list")
public class AllResourceBythisGenreServlet extends HttpServlet {

    private GenreService genreService=GenreService.getGenreService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String id = req.getParameter("id");
//        req.setAttribute("resources",genreService.findWhoHaveThisGenre(Long.parseLong(id)));

//        getServletContext()
//                .getRequestDispatcher(JspPath.get("resources-by-genre-list"))
//                .forward(req, resp);

        String genreId= req.getParameter("id");
        if (StringUtils.isEmpty(genreId)){
            resp.setContentType("text/html");
            resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
            List<Resource> resources =genreService.findWhoHaveThisGenre(Long.valueOf(genreId));
            for (Resource resource: resources){
                resp.getWriter().println(resource.getId()+resource.getResourceName()+resource.getTypeFile().getId()+resource.getCategory().getId()+resource.getPerson().getLogin()+resource.getUrl()+resource.getSize());
            }
        }
    }
}