<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28.03.2019
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/delete-genre" method="post">
    <div>
        <label for="name">Жанр
            <input id="name" type="text" name="name" value="${param.name}"/>
        </label><br>
    </div>
    <input type="submit" value="Удалить">
</form>
</body>
</html>
