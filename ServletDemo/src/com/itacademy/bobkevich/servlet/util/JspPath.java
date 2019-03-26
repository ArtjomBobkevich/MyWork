package com.itacademy.bobkevich.servlet.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class JspPath {

    private static final String FORMAT = "/WEB-INF/jsp/%s.jsp";

    public static String get (String pageName){
        return String.format(FORMAT,pageName);
    }
}
