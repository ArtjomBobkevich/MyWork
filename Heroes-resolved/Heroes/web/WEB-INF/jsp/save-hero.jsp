<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.03.2019
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/save-hero" method="post">
        <div class="form-group">
            <label for="name">Псевдоним
                <input class="form-control" id="name" type="text" name="name" value="${param.name}"/>
            </label><br>
        </div>
        <div class="form-group">
            <label for="identity">Реальное имя
                <input class="form-control" id="identity" type="text" name="identity"/>
            </label><br>
        </div>
        <div class="form-group">
            <label for="age">Возраст
                <input class="form-control" id="age" type="number" name="age"/>
            </label><br>
        </div>
        <div class="form-group">
            <input class="form-control" type="radio" name="gender" value="MALE"/> Мужчина
            <input class="form-control" type="radio" name="gender" value="FEMALE"/> Женщина
        </div>
        <div class="form-group">
            <select class="form-control" name="ability" id="ability">
                <c:forEach var="ability" items="${requestScope.abilities}">
                    <option value="${ability.id}">${ability.name}</option>
                </c:forEach>
            </select>
        </div>
        <input class="btn btn-success" type="submit" value="Сохранить">
    </form>
</body>
</html>
