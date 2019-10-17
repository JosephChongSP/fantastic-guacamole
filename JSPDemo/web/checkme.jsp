<%-- 
    Document   : checkme
    Created on : 25 Apr, 2019, 8:44:09 AM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

//        if ( user.equals("me") && pwd.equals("secret") ) { 
//            response.sendRedirect("home.jsp");   // Brings user to another webpage
//        }  else { 
//            response.sendRedirect("login.html"); // Brings user to another webpage
//        }
        %>
        <%-- --%>

        <b> You have just entered <%=user%> and <%=pwd%>. Thank you!</b>
    </body>
</html>
