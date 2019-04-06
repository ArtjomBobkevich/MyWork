<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 31.03.2019
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="categories_list.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<div>
    <c:forEach var="category" items="${requestScope.categories}">
        <a href="${pageContext.request.contextPath}/resources-by-category-list?id=${category.id}"><fmt:message key ="resources_by_category_list.message" /> ${category.name}</a>
    </c:forEach>
</div>
<a href="${pageContext.request.contextPath}/category-save"><fmt:message key ="category_save.message" /></a>
<a href="${pageContext.request.contextPath}/category-delete"><fmt:message key ="category_delete.message" /></a>
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
