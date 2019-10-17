<%-- 
    Document   : favColorForm
    Created on : 2 Jul, 2019, 2:48:01 PM
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
        <form action="setFavColor.jsp" name="form1" method="post">
            Favorite Color:<input name="myfavcolor" type="text"><br>
            <input type="submit" name="submit" value="Set Favorite Color">
        </form>
    </body>
</html>
