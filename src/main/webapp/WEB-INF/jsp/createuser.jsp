<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<h1><spring:message code="user.create"/></h1>
<a href="<spring:url value="/listuser" />"><spring:message code="user.list"/></a>
<form:form method="POST" action="/createuser" modelAttribute="form">
    <form:errors path="" element="div"/>
    <div>
        <form:label path="id"><spring:message code="user.id"/></form:label>
        <form:input path="id"/>
        <form:errors path="id"/>
    </div>
    <div>
        <form:label path="password1"><spring:message code="user.password1"/></form:label>
        <form:password path="password1"/>
        <form:errors path="password1"/>
    </div>
    <div>
        <form:label path="password1"><spring:message code="user.password2"/></form:label>
        <form:password path="password2"/>
        <form:errors path="password2"/>
    </div>
    <div>
        <input type="submit"/>
    </div>
</form:form>
</body>
</html>
