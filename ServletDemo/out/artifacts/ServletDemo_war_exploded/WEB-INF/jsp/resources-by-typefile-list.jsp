<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02.04.2019
  Time: 16:04
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
    <c:forEach var="resource" items="${requestScope.resource}">
        <a >${resource.resourceName}</a><br>
        <a >${resource.typeFile}</a><br>
        <a >${resource.category}</a><br>
    </c:forEach>
</div>
</body>
</html>
