<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <script type="text/javascript">
        var taste = localStorage.getItem('users');
        console.log(taste);
        console.log(JSON.parse(taste));
    </script>
</head>
<body>
<h1><spring:message code="hello"/></h1>
</body>
</html>
