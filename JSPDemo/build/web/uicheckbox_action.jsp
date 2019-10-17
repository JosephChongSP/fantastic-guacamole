<%-- 
    Document   : uicheckbox_action
    Created on : 25 Apr, 2019, 10:14:47 AM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String buttonpressed = request.getParameter("submit");
    String chkbox1 = request.getParameter("checkbox1");
    String[] checkbox1 = request.getParameterValues("checkbox1");
%>
<html><head><title>UI Checkbox</title></head>
<body>
    Submit Button pressed is: <%= buttonpressed %> <br>
    First Selected item is: <%= chkbox1 %> <br>
    Selected Items are:<br>
    <% for(int i=0;i<checkbox1.length;i++) { %>
    <%= checkbox1[i] %><br>
    <% } %>
</body></html>
