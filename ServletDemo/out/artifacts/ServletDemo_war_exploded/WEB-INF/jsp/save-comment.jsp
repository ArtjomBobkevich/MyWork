<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 01.04.2019
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/save-comment" method="post">
    <div>
        <label for="name">Имя ресурса
            <input id="name" type="text" name="name"/>
        </label><br>
    </div>
    <div>
        <label for="text">Комментарий
            <input id="text" type="text" name="text"/>
        </label><br>
    </div>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>
