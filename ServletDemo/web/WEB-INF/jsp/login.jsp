<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 27.03.2019
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="authorization.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<form action="${pageContext.request.contextPath}/login" method="post">
    <div>
        <label for="login"><fmt:message key ="username.message" />
            <input id="login" type="text" name="login"/>
        </label><br>
    </div>
    <c:if test="${param.error}">
        <span> Вы ввели не корректно логин</span><br>
    </c:if>
    <div class="form-group">
        <label for="password"><fmt:message key ="password.message" />
            <input id="password" type="password" name="password"/>
        </label><br>
    </div>
    <input type="submit" value="<fmt:message key ="enter.message" />">
</form>
<a href="${pageContext.request.contextPath}/save-person"><fmt:message key ="registration.message" /></a>
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
