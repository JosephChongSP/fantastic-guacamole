<%-- 
    Document   : getSubjectSP
    Created on : 16 May, 2019, 8:56:28 AM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="displaySubjectSP.jsp" method="post">
        Retrieve subject taught by teacher:<input type="text" name="teacher"/>
        <br />
        <input type="submit" name="btnSubmit" value="Retrieve"/>
        <input type="submit" name="btnReset" value="Reset"/>
        </form>
    </body>
</html>
