//package com.itacademy.bobkevich.servlet.servlet;
//
//import com.itacademy.bobkevich.servlet.dto.CreateNewCommentDto;
//import com.itacademy.bobkevich.servlet.dto.CreateNewGenreDto;
//import com.itacademy.bobkevich.servlet.dto.ViewGenreInfoDto;
//import com.itacademy.bobkevich.servlet.dto.ViewResourceBasicInfoDto;
//import com.itacademy.bobkevich.servlet.entity.Genre;
//import com.itacademy.bobkevich.servlet.entity.Resource;
//import com.itacademy.bobkevich.servlet.service.ResourceService;
//import com.itacademy.bobkevich.servlet.util.JspPath;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet("/add-genre-to-resource")
//public class AddGenreToResourceServlet extends HttpServlet {  /*пока не корректно работает*/
//
//    private ResourceService resourceService = ResourceService.getResourceService();
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        getServletContext()
//                .getRequestDispatcher(JspPath.get("add-genre-to-resource"))
//                .forward(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//
//        String resourceId = req.getParameter("resourceName");
//        String genreId = req.getParameter("genreName");
//        resourceService.addGenre(resourceId, genreId);
//    }
//}
