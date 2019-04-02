package com.itacademy.bobkevich.servlet.servlet;

import com.itacademy.bobkevich.servlet.entity.Category;
import com.itacademy.bobkevich.servlet.entity.Comment;
import com.itacademy.bobkevich.servlet.service.CommentService;
import com.itacademy.bobkevich.servlet.util.JspPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/comment-delete")
public class CommentDeleteServlet extends HttpServlet {

    private CommentService commentService=CommentService.getCommentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext()
                .getRequestDispatcher(JspPath.get("comment-delete"))
                .forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Comment comment =Comment.builder() /*на этом пока остановился*/
                .text(req.getParameter("text"))
                .build();
        commentService.commentDelite(comment);
        resp.sendRedirect("/delete-info");
    }
}
