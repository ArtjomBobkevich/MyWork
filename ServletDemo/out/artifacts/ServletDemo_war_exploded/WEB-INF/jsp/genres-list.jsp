<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 27.03.2019
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Жанры</title>
</head>
<body>
 <div>
     <c:forEach var="genre" items="${requestScope.genres}">
         <a href="${pageContext.request.contextPath}/resources-by-genre-list?id=${genre.id}">Поиск по жанру ${genre.name}</a>
     </c:forEach>
 </div>
 <a href="${pageContext.request.contextPath}/save-genre">Сохранить жанр</a>
 <a href="${pageContext.request.contextPath}/delete-genre">Удалить жанр</a>
</body>
</html>
