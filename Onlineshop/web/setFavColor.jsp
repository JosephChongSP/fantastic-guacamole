<%-- 
    Document   : setFavColor
    Created on : 2 Jul, 2019, 2:55:31 PM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String colorStr = request.getParameter("myfavcolor");
    session.setAttribute("favColor",colorStr);
    response.sendRedirect("displayFavColor.jsp");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
