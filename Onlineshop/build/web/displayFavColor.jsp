<%-- 
    Document   : displayFavColor
    Created on : 2 Jul, 2019, 2:59:41 PM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String myColor = (String)session.getAttribute("favColor");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        Your Favorite Color = <%=myColor %>
    </body>
</html>
