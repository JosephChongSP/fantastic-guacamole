<%-- 
    Document   : sayHello
    Created on : 4 Jul, 2019, 8:26:26 AM
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
        
<!--        <form action="HellowWorldServlet" method="post">
            <input type="submit" value="Say Hello from Servlet"/>
        </form>-->

        <form name="loginForm" action="MyServlet">
            Enter USERNAME: <input type="text" name="userNAME" >
            <input type="submit" name="btnsubmit" value="Login">
        </form>

    </body>
</html>
