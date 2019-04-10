<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09.04.2019
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <c:forEach var="comment" items="${requestScope.commentaries}">
        <a >${comment.text}</a><br>
    </c:forEach>
</div>
<a href="${pageContext.request.contextPath}/comment-delete"><fmt:message key ="delete_comment.message" /></a><br>
</body>
</html>
