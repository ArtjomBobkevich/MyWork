package com.itacademy.bobkevich.servlet.servlet;

import com.itacademy.bobkevich.servlet.entity.Genre;
import com.itacademy.bobkevich.servlet.entity.Resource;
import com.itacademy.bobkevich.servlet.service.ResourceService;
import com.itacademy.bobkevich.servlet.util.JspPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-resource")
public class ResourceDeleteServlet extends HttpServlet {

    private ResourceService resourceService = ResourceService.getResourceService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext()
                .getRequestDispatcher(JspPath.get("delete-resource"))
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Resource resource = Resource.builder()
                .resourceName(req.getParameter("name"))
                .build();
        resourceService.delete(resource);
        resp.sendRedirect("/genre-info?id=1");
    }
}
