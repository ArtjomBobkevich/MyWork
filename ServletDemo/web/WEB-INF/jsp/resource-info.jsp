<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 26.03.2019
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="resource_info.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<fmt:message key ="resource_info_name.message" /><span>${requestScope.resource.resourceName}</span><br>
<fmt:message key ="resource_info_type.message" /><span>${requestScope.resource.typeFile}</span><br>
<fmt:message key ="resource_info_category.message" /><span>${requestScope.resource.category}</span><br>
<fmt:message key ="resource_info_author.message" /><span>${requestScope.resource.person}</span><br>
<fmt:message key ="resource_info_link.message" /><span>${requestScope.resource.url}</span><br>
<fmt:message key ="resource_info_size.message" /><span>${requestScope.resource.size}</span><br>
<a href="${pageContext.request.contextPath}/add-genre-to-resource">Добавить жанр к данному ресурсу</a>
<a href="${pageContext.request.contextPath}/save-comment">Добавить комментарий к ресурсу</a>
<div>
<a href="${pageContext.request.contextPath}/all-comment-by-resource?id=${requestScope.resource.id}">Все комментарии ресурса</a>
</div>
<a href="${pageContext.request.contextPath}/comment-delete">Удалить комментарий к ресурсу</a>
</body>
</html>
