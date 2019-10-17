<%-- 
    Document   : SEPTesting
    Created on : 2 Jul, 2019, 2:18:11 PM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
            Cookie mycookie = new Cookie("usernane", "cookie monster");
            mycookie.setMaxAge(60);
            response.addCookie(mycookie);
        %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="retrieveCookie.jsp" name="form1" method="post">
            <input type="submit">
        </form>
    </body>
</html>
