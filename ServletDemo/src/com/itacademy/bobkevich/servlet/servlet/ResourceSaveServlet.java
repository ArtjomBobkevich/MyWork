package com.itacademy.bobkevich.servlet.servlet;

import com.itacademy.bobkevich.servlet.dto.CreateNewGenreDto;
import com.itacademy.bobkevich.servlet.dto.CreateNewResourceDto;
import com.itacademy.bobkevich.servlet.dto.ViewGenreInfoDto;
import com.itacademy.bobkevich.servlet.dto.ViewResourceBasicInfoDto;
import com.itacademy.bobkevich.servlet.dto.ViewResourceFullInfoDto;
import com.itacademy.bobkevich.servlet.entity.Category;
import com.itacademy.bobkevich.servlet.entity.Person;
import com.itacademy.bobkevich.servlet.entity.TypeFile;
import com.itacademy.bobkevich.servlet.service.ResourceService;
import com.itacademy.bobkevich.servlet.util.JspPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/save-resource")
public class ResourceSaveServlet extends HttpServlet {

    private ResourceService resourceService=ResourceService.getResourceService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext()
                .getRequestDispatcher(JspPath.get("save-resource"))  /*тупо перенаправление*/
                .forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CreateNewResourceDto resource =CreateNewResourceDto.builder()
                .resourceName(req.getParameter("name"))
                .typeFile(TypeFile.builder()
                        .name(req.getParameter("name_of_type_file"))
                        .build())
                .category(Category.builder()  /*сохраняет, но нужен подзапрос*/
                        .name(req.getParameter("name_of_category"))
                        .build())
                .person(Person.builder()
                        .login(req.getParameter("login"))
                        .build())
                .url(req.getParameter("url"))
                .size(req.getParameter("size"))
                .build();

        ViewResourceFullInfoDto savedResource= resourceService.save(resource);
        resp.sendRedirect("/resource-info?id="+ savedResource.getId());
    }
}
