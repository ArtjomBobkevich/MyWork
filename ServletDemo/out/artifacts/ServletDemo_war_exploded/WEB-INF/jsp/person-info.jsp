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
    <title>пользователь подробности</title>
</head>
<body>
Логин <span>${requestScope.person.login}</span><br>
Имя <span>${requestScope.person.first_name}</span><br>
Фамилия <span>${requestScope.person.last_name}</span><br>
Возраст <span>${requestScope.person.age}</span><br>
Почта <span>${requestScope.person.mail}</span><br>
Права <span>${requestScope.person.personRole}</span><br>
<a href="${pageContext.request.contextPath}/delete-person">Удалить пользователя</a><br>
</body>
</html>
