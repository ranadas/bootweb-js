<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha/css/bootstrap.css"
          rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            console.log("in doc ready");

            function localStorageTest() {
                var testData = 'data in local storage';
                try {
                    // remove the key from local storage
                    localStorage.removeItem("test");
                    localStorage.setItem("test", testData);
                    return true;
                } catch (e) {
                    console.log(e);
                    return false;
                }
            }

            if (localStorageTest() === true) {
                console.log("available");
            } else {
                console.log(" not available");
            }

            $.ajax({
                url: "/users",
                dataType: "json",
                //data: request,
                success: function (data) {
                    console.log("Response " + JSON.stringify(data));
                    var items = data;
                    localStorage.setItem("users", JSON.stringify(data));
                    showUsers(items);
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log(textStatus);
                }
            });


            function showUsers(data) {
                $('#ajaxGetUser').append("<option value='-1'>Users List</option>");
                for (var i = 0, len = data.length; i < len; ++i) {
                    var user = data[i];
                    $('#ajaxGetUser').append("<option value=\"" + user.id + "\"> Password : " + user.password + "</option>");
                }
            }

        });
    </script>
</head>
<body>
<h1><spring:message code="user.list"/></h1>
<div id="ajaxGetUser"></div>

<a href="<spring:url value="/createuser" />"><spring:message code="user.create"/></a>
</body>
</html>