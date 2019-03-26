//package by.itacademy.servlet;
//
//import by.itacademy.matveyenka.dto.RequestDto;
//import by.itacademy.matveyenka.util.JspPath;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Arrays;
//
//@WebServlet("/jstl")
//public class JstlServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(Arrays.toString(req.getParameterValues("language")));
//
//        req.setAttribute("request2", RequestDto.builder()
//                .date("2019-01-01")
//                .description("TEST")
//                .build());
//        req.getSession().setAttribute("requests", Arrays.asList(
//                RequestDto.builder()
//                        .id(1L)
//                        .date("2018-08-09")
//                        .description("First request")
//                        .build(),
//                RequestDto.builder()
//                        .id(2L)
//                        .date("2017-03-06")
//                        .description("Second request")
//                        .build()
//        ));
//        getServletContext()
//                .getRequestDispatcher(JspPath.get("jstl"))
//                .forward(req, resp);
//    }
//}
