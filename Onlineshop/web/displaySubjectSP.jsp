<%-- 
    Document   : displaySubjectSP
    Created on : 16 May, 2019, 9:05:35 AM
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
        <%
            Class.forName("com.mysql.jdbc.Driver");
            String tcher = request.getParameter("teacher");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/jspg?user=root&password=root");
            
            String simpleProc = "{call get_subjects(?)}";
            
            CallableStatement cs= conn.prepareCall(simpleProc);
            cs.setString(1, tcher);
            cs.execute();
            
            ResultSet rs= cs.getResultset();
            while(rs.next()){
                out.print(rs.getString("subjCode")+", ");
                out.println(rs.getString("subjName")+"<br>");
            }
            conn.close();
        %>
    </body>
</html>
