<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02.04.2019
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Удаление учётной записи</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/delete-person" method="post">
    <div>
        <label for="login">Login
            <input id="login" type="text" name="login"/>
        </label><br>
    </div>
    <input type="submit" value="Удалить">
</form>
</body>
</html>
