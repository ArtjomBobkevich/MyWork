<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <%--<c:if test="${requestScope.request2.description eq 'TEST2'}">--%>
            <%--<span>Description OK!</span>--%>
        <%--</c:if>--%>
        <%--<c:forEach var="request" items="${sessionScope.requests}">--%>
            <%--<div>--%>
                <%--<span>${request.date}. ${request.description}</span>--%>
                <%--<a href="${pageContext.request.contextPath}/request?id=${request.id}">Link to display request</a>--%>
            <%--</div>--%>
        <%--</c:forEach>--%>
        <%--<c:forEach var="requestIndex" begin="0" end="${sessionScope.requests.size() + 2}">--%>
            <%--<p>${sessionScope.requests[requestIndex].date}. ${sessionScope.requests[requestIndex].description}</p>--%>
        <%--</c:forEach>--%>
            <form action="${pageContext.request.contextPath}/jstl" method="get">
                <%--<select name="language">--%>
                    <%--<option value="J">Java</option>--%>
                    <%--<option value="R">Ruby</option>--%>
                    <%--<option value="C">C</option>--%>
                    <%--<option>Oops</option>--%>
                <%--</select>--%>
                <%--<div>--%>
                    <%--<input type="checkbox" name="language" value="J">Java <br>--%>
                    <%--<input type="checkbox" name="language" value="R">Ruby <br>--%>
                    <%--<input type="checkbox" name="language" value="C">C <br>--%>
                <%--</div>--%>
                    <%--<c:forEach var="language" items="${requestScope.languages}">--%>
                        <%--<input type="radio" name="language" value="${language.name}">${language.description} <br>--%>
                    <%--</c:forEach>--%>
                <div>
                    <%--<input type="radio" name="language" value="J">Java <br>--%>
                    <%--<input type="radio" name="language" value="R">Ruby <br>--%>
                    <%--<input type="radio" name="language" value="C">C <br>--%>
                </div>
                <input type="submit" value="Send">
            </form>
    </div>
</body>
</html>
