<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<body>
<h1><spring:message code="user.list"/></h1>
<ul>
    ${users}
    <%--<c:forEach items="${users}" var="user">--%>
        <%--<li>--%>
            <%--<c:out value="${user.getId()}"/>--%>
        <%--</li>--%>
    <%--</c:forEach>--%>
</ul>

<a href="<spring:url value="/createuser" />"><spring:message code="user.create"/></a>
</body>
</html>