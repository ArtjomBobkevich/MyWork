<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 27.03.2019
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Авторизация</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <div>
        <label for="login">Имя пользователя
            <input id="login" type="text" name="login"/>
        </label><br>
    </div>
    <c:if test="${param.error}">
        <span> Вы ввели не корректно логин</span><br>
    </c:if>
    <div class="form-group">
        <label for="password">Пароль
            <input id="password" type="password" name="password"/>
        </label><br>
    </div>
    <input type="submit" value="Войти">
</form>
<a href="${pageContext.request.contextPath}/save-person">Зарегистрироваться</a>
</body>
</html>
