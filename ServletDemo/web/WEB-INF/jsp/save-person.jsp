<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02.04.2019
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="registration.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<form action="${pageContext.request.contextPath}/save-person" method="post">
    <div>
        <label for="login_name"><fmt:message key ="login_name.message" />
            <input id="login_name" type="text" name="login_name"/>
        </label><br>
    </div>
    <div>
        <label for="firstName"><fmt:message key ="firstName.message" />
            <input id="firstName" type="text" name="firstName"/>
        </label><br>
    </div>
    <div>
        <label for="lastName"><fmt:message key ="lastName.message" />
            <input id="lastName" type="text" name="lastName"/>
        </label><br>
    </div>
    <div>
        <label for="age"><fmt:message key ="age.message" />
            <input id="age" type="number" name="age"/>
        </label><br>
    </div>
    <div>
        <label for="mail"><fmt:message key ="mail.message" />
            <input id="mail" type="text" name="mail"/>
        </label><br>
    </div>
    <div>
        <label for="password"><fmt:message key ="password_name.message" />
            <input id="password" type="password" name="password"/>
        </label><br>
    </div>
    <input type="submit" value="<fmt:message key ="save_name.message" />">
</form>
<a href="${pageContext.request.contextPath}/begin"><fmt:message key ="return.message" /></a><br>
<a href="${pageContext.request.contextPath}/logout"><fmt:message key ="logout.message" /></a>
</body>
</html>
