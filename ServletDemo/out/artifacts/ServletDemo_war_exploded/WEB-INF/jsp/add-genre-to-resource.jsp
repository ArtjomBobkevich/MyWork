<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 30.03.2019
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Добавление жанра</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/add-genre-to-resource" method="post">
    <div>
        <label for="resourceName">Ресурс
            <input id="resourceName" type="text" name="resourceName"/>
        </label><br>
    </div>
    <div>
        <label for="genreName">Жанр
            <input id="genreName" type="text" name="genreName"/>
        </label><br>
    </div>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>
