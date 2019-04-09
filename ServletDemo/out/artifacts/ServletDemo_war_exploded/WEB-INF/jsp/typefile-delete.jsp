<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 31.03.2019
  Time: 0:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="typefile_delete.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
    <form action="${pageContext.request.contextPath}/typefile-delete" method="post">
        <div>
            <select name="typeFileId" id="typeFileId">
                <c:forEach var="typeFileId" items="${requestScope.typeFiles}">
                    <option value="${typeFileId.id}">${typeFileId.name}</option>
                </c:forEach>
            </select>
        </div>
    <input type="submit" value="<fmt:message key ="delete_name.message" />">
</form>
<a href="${pageContext.request.contextPath}/begin"><fmt:message key ="return.message" /></a><br>
<a href="${pageContext.request.contextPath}/logout"><fmt:message key ="logout.message" /></a>
</body>
</html>
