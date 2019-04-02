<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 30.03.2019
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/delete-resource" method="post">
    <div>
        <label for="name">Ресурс
            <input id="name" type="text" name="name"/>
        </label><br>
    </div>
    <input type="submit" value="Удалить">
</form>
</body>
</html>
