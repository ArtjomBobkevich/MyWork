<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02.04.2019
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="find_by.message" /> </title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<div>
    <c:forEach var="resource" items="${requestScope.resource}">
        <a >${resource.resourceName}</a><br>
        <a >${resource.typeFile}</a><br>
        <a >${resource.category}</a><br>
    </c:forEach>
</div>
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
