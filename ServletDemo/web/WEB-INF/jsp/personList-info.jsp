<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02.04.2019
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="person_list.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<div>
    <c:forEach var="personList" items="${requestScope.personList}">
        <a href="${pageContext.request.contextPath}/person-info?login=${personList.login}"><fmt:message key ="person_info.message" /> ${personList.login}</a><br>
    </c:forEach>
</div>
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
