<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 27.03.2019
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="genres.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
 <div>
     <c:forEach var="genre" items="${requestScope.genres}">
         <a href="${pageContext.request.contextPath}/resources-by-genre-list?id=${genre.id}"><fmt:message key ="resources_by_genre.message" /> ${genre.name}</a>
     </c:forEach>
 </div>
 <a href="${pageContext.request.contextPath}/save-genre"><fmt:message key ="save_genre.message" /></a>
 <a href="${pageContext.request.contextPath}/delete-genre"><fmt:message key ="delete_genre.message" /></a>
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
