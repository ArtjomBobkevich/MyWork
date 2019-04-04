<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02.04.2019
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Регистрация</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/save-person" method="post">
    <div>
        <label for="login_name">Login
            <input id="login_name" type="text" name="login_name"/>
        </label><br>
    </div>
    <div>
        <label for="firstName">Имя
            <input id="firstName" type="text" name="firstName"/>
        </label><br>
    </div>
    <div>
        <label for="lastName">Фамилия
            <input id="lastName" type="text" name="lastName"/>
        </label><br>
    </div>
    <div>
        <label for="age">Возраст
            <input id="age" type="text" name="age"/>
        </label><br>
    </div>
    <div>
        <label for="mail">Mail
            <input id="mail" type="text" name="mail"/>
        </label><br>
    </div>
    <div>
        <label for="password">Пароль
            <input id="password" type="password" name="password"/>
        </label><br>
    </div>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>
