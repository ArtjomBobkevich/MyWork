<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 31.03.2019
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Категории сохранить</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/category-save" method="post">
    <div>
        <label for="name">Категория
            <input id="name" type="text" name="name" value="${param.name}"/>
        </label><br>
    </div>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>
