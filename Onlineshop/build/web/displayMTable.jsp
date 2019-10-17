<%-- 
    Document   : displayMTable
    Created on : 30 Apr, 2019, 3:20:46 PM
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

        <table border='1'>
            <%
                String number = request.getParameter("number");
                int n = Integer.parseInt(number);
                for (int i = 1; i <= 5; i++){
                    out.println("<tr>");
                    out.println("<td width='100' align='center'>");
                    out.println(i + " x " + n);
                    out.println("<td width='100' align='center'>");
                    out.println(i*n);
                }
            %>
        </table>
    </body>
</html>
