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
    <title><fmt:message key ="person_info.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<fmt:message key ="person_info_login.message" /> <span>${requestScope.person.login}</span><br>
<fmt:message key ="person_info_name.message" /> <span>${requestScope.person.first_name}</span><br>
<fmt:message key ="person_info_last_name.message" /> <span>${requestScope.person.last_name}</span><br>
<fmt:message key ="person_info_age.message" /> <span>${requestScope.person.age}</span><br>
<fmt:message key ="person_info_mail.message" /> <span>${requestScope.person.mail}</span><br>
<fmt:message key ="person_info_access.message" /> <span>${requestScope.person.personRole}</span><br>
<a href="${pageContext.request.contextPath}/delete-person"><fmt:message key ="person_delete.message" /></a><br>
<a href="${pageContext.request.contextPath}/begin"><fmt:message key ="return.message" /></a><br>
<a href="${pageContext.request.contextPath}/logout"><fmt:message key ="logout.message" /></a>
</body>
</html>
