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
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/add-genre-to-resource" method="post">
    <div>
        <label for="resourceId">Ресурс
            <input id="resourceId" type="text" name="resourcedId"/>
        </label><br>
    </div>
    <div>
        <label for="genreId">Жанр
            <input id="genreId" type="text" name="genreId"/>
        </label><br>
    </div>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>
