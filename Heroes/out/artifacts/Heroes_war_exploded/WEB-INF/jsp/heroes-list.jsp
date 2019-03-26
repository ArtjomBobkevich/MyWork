<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 25.03.2019
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <c:forEach var="request" items="${sessionScope.requests}">
<%--<span>${request.name}</span>--%>
<a href="${pageContext.request.contextPath}/heroes-list?id=${request.id}">${request.name}</a>
</div>
        </c:forEach>
</body>
</html>
