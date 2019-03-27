<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.03.2019
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        Псевдоним <span>${requestScope.hero.name}</span><br>
        Имя <span>${requestScope.hero.identity}</span><br>
        Пол <span>${requestScope.hero.gender}</span><br>
        Возраст <span>${requestScope.hero.age}</span><br>
        Способность <span>${requestScope.hero.abilityName}</span><br>
    </div>
</body>
</html>
