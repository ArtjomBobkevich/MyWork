<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 30.03.2019
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="save_resource.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<form action="${pageContext.request.contextPath}/save-resource" method="post">
    <div>
        <label for="name"><fmt:message key ="save_resource_name.message" />
            <input id="name" type="text" name="name" required placeholder="title"/>
        </label><br>
    </div>
    <div>
        <select name="typeFileId" id="typeFileId">
            <c:forEach var="typeFileId" items="${requestScope.typefiles}">
                <option value="${typeFileId.id}">${typeFileId.name}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        <select name="categoryId" id="categoryId">
            <c:forEach var="categoryId" items="${requestScope.categories}">
                <option value="${categoryId.id}">${categoryId.name}</option>
            </c:forEach>
        </select>
    </div>
    <div>
    </div>
    <div>
        <label for="url"><fmt:message key ="save_resource_url.message" />
            <input id="url" type="text" name="url" required placeholder="url"/>
        </label><br>
    </div>
    <div>
        <label for="size"><fmt:message key ="save_resource_size.message" />
            <input id="size" type="number" name="size" required placeholder="size"/>
        </label><br>
    </div>
    <input type="submit" value="<fmt:message key ="save_name.message" />">
</form>
<a href="${pageContext.request.contextPath}/add-genre-to-resource"><fmt:message key ="add_genre_to_resource.message" /></a><br>
<a href="${pageContext.request.contextPath}/begin"><fmt:message key ="return.message" /></a><br>
<a href="${pageContext.request.contextPath}/logout"><fmt:message key ="logout.message" /></a>
</body>
</html>
