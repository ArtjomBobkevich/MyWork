<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 01.04.2019
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Комментарий удалить</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/comment-delete" method="post">
    <div>
        <label for="text">Коментарий
            <input id="text" type="text" name="text"/>
        </label><br>
    </div>
    <input type="submit" value="Удалить">
</form>
</body>
</html>
