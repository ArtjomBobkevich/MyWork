<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04.04.2019
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="main_page.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<div>
    <a href="${pageContext.request.contextPath}/resources-list"><fmt:message key ="resources_list.message" /></a><br>
    <a href="${pageContext.request.contextPath}/categories-list">Все категории</a><br>
    <a href="${pageContext.request.contextPath}/genres-list">Все жанры</a><br>
    <a href="${pageContext.request.contextPath}/typefiles-list">Все типы файлов</a><br>
    <a href="${pageContext.request.contextPath}/save-resource">Сохранить ресурс</a><br>
    <a href="${pageContext.request.contextPath}/delete-resource">Удалить ресурс</a><br>
    <a href="${pageContext.request.contextPath}/personList-info">Все пользователи</a><br>
</div>
</body>
</html>