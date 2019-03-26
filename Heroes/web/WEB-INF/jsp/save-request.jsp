<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22.03.2019
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/save-request" method="post">
        <label>Description:
            <input type="text" name="description"/>
        </label><br>
        <label>Date:
            <input type="date" name="date"/>
        </label><br>
        <input type="submit" value="SAVE" />
    </form>
</body>
</html>
