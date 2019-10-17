<%-- 
    Document   : uiselect_action
    Created on : 25 Apr, 2019, 9:51:33 AM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String buttonpressed= request.getParameter("submit");
    String list1= request.getParameter("list1");
%>

<html><head><title>UI Select</title></head>
    <body>
        Submit Button pressed is: <%= buttonpressed %> <br>
        Selected item is: <%= list1 %> <br>
    <body>
</html>
