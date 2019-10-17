<%-- 
    Document   : checkmodules
    Created on : 7 May, 2019, 2:49:46 PM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String[] checkbox1 = request.getParameterValues("checkbox1");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    You are taking:<br>
    <% 
        if(checkbox1==null)
            {
                System.out.println("You have no modules this semester");
            }
        else{    
        for(int i=0;i<checkbox1.length;i++) { %>
    <%= checkbox1[i] %><br>
    <%}
        }%>
    </body>
</html>

