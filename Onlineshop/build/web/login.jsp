<%-- 
    Document   : login
    Created on : 30 Apr, 2019, 3:07:06 PM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Page</title>
    </head>
    <body>
        <form action="verifyUser.jsp" method="post">
             Login ID <input name="loginid" type='text'> <br>
             Password <input name="password" type='password'> <br>
             <input type="submit" name="btnSubmit" value="Login">
             <input type="submit" name="btnReset" value="Reset">
        </form>
        <%
            String msg = request.getParameter("msg");
            out.println(msg);
        %>
    </body>
</html>
