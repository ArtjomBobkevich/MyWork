<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 26.03.2019
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Название <span>${requestScope.resource.resourceName}</span><br>
Тип <span>${requestScope.resource.typeFile}</span><br>
Категория <span>${requestScope.resource.category}</span><br>
Выложил <span>${requestScope.resource.person}</span><br>
Ссылка <span>${requestScope.resource.url}</span><br>
Объём <span>${requestScope.resource.size}</span><br>
</body>
</html>
