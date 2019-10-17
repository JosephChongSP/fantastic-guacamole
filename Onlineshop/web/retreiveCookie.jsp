<%-- 
    Document   : retreiveCookie
    Created on : 2 Jul, 2019, 2:22:26 PM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Cookie[] mycookies=request.getCookies();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <%for(int i=0;i<mycookies.length;i++){%>
            <tr>
                <%
                    if(mycookies[i].getName().equals("username")){
                %>
                <td><%= mycookies[i].getName() %></td>
                <td><%= mycookies[i].getValue() %></td>
            </tr>
            <%}}%>
        </table>
    </body>
</html>
