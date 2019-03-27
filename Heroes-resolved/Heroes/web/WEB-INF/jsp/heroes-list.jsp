<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.03.2019
  Time: 20:59
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
        <c:forEach var="hero" items="${requestScope.heroes}">
            <a href="${pageContext.request.contextPath}/show-hero-details?id=${hero.id}">${hero.name}</a><br>
        </c:forEach>
    </div>
</body>
</html>
