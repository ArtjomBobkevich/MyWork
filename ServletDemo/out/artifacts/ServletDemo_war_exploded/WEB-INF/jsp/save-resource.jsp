<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 30.03.2019
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/save-resource" method="post">
    <div>
        <label for="name">Название
            <input id="name" type="text" name="name"/>
        </label><br>
    </div>
    <div>
        <label for="name_of_type_file">Тип
            <input id="name_of_type_file" type="text" name="name_of_type_file"/>
        </label><br>
    </div>
    <div>
        <label for="name_of_category">Категория
            <input id="name_of_category" type="text" name="name_of_category"/>
        </label><br>
    </div>
    <div>
        <label for="login">Кто даёт
            <input id="login" type="text" name="login"/>
        </label><br>
    </div>
    <div>
        <label for="url">ссылка на скачивание
            <input id="url" type="text" name="url"/>
        </label><br>
    </div>
    <div>
        <label for="size">размер
            <input id="size" type="text" name="size"/>
        </label><br>
    </div>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>
