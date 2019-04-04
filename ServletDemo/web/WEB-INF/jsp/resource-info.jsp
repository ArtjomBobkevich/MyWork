<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 26.03.2019
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ресурс подробности</title>
</head>
<body>
Название <span>${requestScope.resource.resourceName}</span><br>
Тип <span>${requestScope.resource.typeFile}</span><br>
Категория <span>${requestScope.resource.category}</span><br>
Выложил <span>${requestScope.resource.person}</span><br>
Ссылка <span>${requestScope.resource.url}</span><br>
Объём <span>${requestScope.resource.size}</span><br>
<a href="${pageContext.request.contextPath}/add-genre-to-resource">Добавить жанр к данному ресурсу</a>
<a href="${pageContext.request.contextPath}/save-comment">Добавить комментарий к ресурсу</a>
<div>
<a href="${pageContext.request.contextPath}/all-comment-by-resource?id=${requestScope.resource.id}">Все комментарии ресурса</a>
</div>
<a href="${pageContext.request.contextPath}/comment-delete">Удалить комментарий к ресурсу</a>
</body>
</html>
