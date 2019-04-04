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
    <title>Все пользователи</title>
</head>
<body>
<div>
    <c:forEach var="personList" items="${requestScope.personList}">
        <a href="${pageContext.request.contextPath}/person-info?login=${personList.login}">Подробности ${personList.login}</a><br>
    </c:forEach>
</div>
</body>
</html>
