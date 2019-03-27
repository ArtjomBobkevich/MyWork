<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 27.03.2019
  Time: 8:42
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
<c:forEach var="resource" items="${requestScope.resources}">
    <a href="${pageContext.request.contextPath}/show-resource-details?id=${resource.id}">${resource.resourceName}</a><br>
</c:forEach>
</div>
</body>
</html>
