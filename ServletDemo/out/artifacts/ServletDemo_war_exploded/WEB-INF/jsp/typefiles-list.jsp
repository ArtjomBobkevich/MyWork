<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 31.03.2019
  Time: 0:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Типы файлов</title>
</head>
<body>
<div>
    <c:forEach var="typefile" items="${requestScope.typefiles}">
        <a href="${pageContext.request.contextPath}/resources-by-typefile-list?id=${typefile.id}">Поиск по ${typefile.name}</a>
    </c:forEach>
</div>
<a href="${pageContext.request.contextPath}/typefile-save">Сохранить тип файла</a>
<a href="${pageContext.request.contextPath}/typefile-delete">Удалить тип файла</a>
</body>
</html>
