<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27.03.2019
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/update-genre" method="post">
<div>
    <label for="name">Жанр
        <input id="name" type="text" name="name" value="${param.name}"/>
    </label><br>
    <label for="id">id
        <input id="id" type="text" name="id" value="${param.id}"/>
    </label><br>
</div>
<input type="submit" value="Сохранить">
</form>
</body>
</html>
