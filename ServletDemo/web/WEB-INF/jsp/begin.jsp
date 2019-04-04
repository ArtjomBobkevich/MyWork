<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04.04.2019
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Главная страница</title>
</head>
<body>
<div>
    <a href="${pageContext.request.contextPath}/resources-list">Все ресурсы</a><br>
    <a href="${pageContext.request.contextPath}/categories-list">Все категории</a><br>
    <a href="${pageContext.request.contextPath}/genres-list">Все жанры</a><br>
    <a href="${pageContext.request.contextPath}/typefiles-list">Все типы файлов</a><br>
    <a href="${pageContext.request.contextPath}/save-resource">Сохранить ресурс</a><br>
    <a href="${pageContext.request.contextPath}/delete-resource">Удалить ресурс</a><br>
    <a href="${pageContext.request.contextPath}/personList-info">Все пользователи</a><br>
</div>
</body>
</html>