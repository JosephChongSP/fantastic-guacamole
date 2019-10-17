<%-- 
    Document   : uiradio_action
    Created on : 25 Apr, 2019, 10:01:10 AM
    Author     : jrago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String buttonpressed = request.getParameter("submit");
    String radio1 = request.getParameter("radio1");
%>
<html>
<head><title>UI Radio</title></head>
<body>
Submit Button pressed is: <%= buttonpressed %> <br>
Selected item is: <%= radio1 %><br>
</body>
</html>
