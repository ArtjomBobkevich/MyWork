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
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <div>
        <label for="login">Имя пользователя
            <input id="login" type="text" name="login" value="${param.login}"/>
        </label><br>
    </div>
    <div class="form-group">
        <label for="password">Пароль
            <input id="password" type="text" name="password" value="${param.password}"/>
        </label><br>
    </div>
    <input type="submit" value="Войти">
</form>
</body>
</html>
