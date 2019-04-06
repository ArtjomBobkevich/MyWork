<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 30.03.2019
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="delete_resource.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<form action="${pageContext.request.contextPath}/delete-resource" method="post">
    <div>
        <label for="name"><fmt:message key ="delete_resource_name.message" />
            <input id="name" type="text" name="name"/>
        </label><br>
    </div>
    <input type="submit" value="<fmt:message key ="delete_name.message" />">
</form>
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
