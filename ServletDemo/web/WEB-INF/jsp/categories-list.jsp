<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 31.03.2019
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Категории</title>
</head>
<body>
<div>
    <c:forEach var="category" items="${requestScope.categories}">
        <a href="${pageContext.request.contextPath}/resources-by-category-list?id=${category.id}">Поиск по категории ${category.name}</a>
    </c:forEach>
</div>
<a href="${pageContext.request.contextPath}/category-save">Сохранить категорию</a>
<a href="${pageContext.request.contextPath}/category-delete">Удалить категорию</a>
</body>
</html>
