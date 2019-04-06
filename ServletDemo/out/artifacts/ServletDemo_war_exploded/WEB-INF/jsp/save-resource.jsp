<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 30.03.2019
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
    <fmt:setBundle basename="messages"/>
    <title><fmt:message key ="save_resource.message" /></title>
</head>
<body>
<fmt:setLocale value="${not empty sessionScope.lang ? sessionScope.lang : 'en_UK'}"/>
<fmt:setBundle basename="messages"/>
<div>
    <a href="${pageContext.request.contextPath}/locale?language=en_UK">ENG</a>
    <a href="${pageContext.request.contextPath}/locale?language=ru_RU">RUS</a>

</div>
<form action="${pageContext.request.contextPath}/save-resource" method="post">
    <div>
        <label for="name"><fmt:message key ="save_resource_name.message" />
            <input id="name" type="text" name="name"/>
        </label><br>
    </div>
    <div>
        <label for="name_of_type_file"><fmt:message key ="save_resource_type.message" />
            <input id="name_of_type_file" type="text" name="name_of_type_file"/>
        </label><br>
    </div>
    <div>
        <label for="name_of_category"><fmt:message key ="save_resource_category.message" />
            <input id="name_of_category" type="text" name="name_of_category"/>
        </label><br>
    </div>
    <div>
        <label for="login"><fmt:message key ="save_resource_login.message" />
            <input id="login" type="text" name="login"/>
        </label><br>
    </div>
    <div>
        <label for="url"><fmt:message key ="save_resource_url.message" />
            <input id="url" type="text" name="url"/>
        </label><br>
    </div>
    <div>
        <label for="size"><fmt:message key ="save_resource_size.message" />
            <input id="size" type="text" name="size"/>
        </label><br>
    </div>
    <input type="submit" value="<fmt:message key ="save_name.message" />">
</form>
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
