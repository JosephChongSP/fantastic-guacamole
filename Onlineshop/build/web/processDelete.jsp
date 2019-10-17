<%-- 
    Document   : processDelete
    Created on : 16 May, 2019, 10:25:13 AM
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
          int total = 0;
    String uid=request.getParameter("userid");
//    String pwd=request.getParameter("password");
    
    try{
        Class.forName("com.mysql.jdbc.Driver");       
        String connURL="jdbc:mysql://localhost/jspg?user=root&password=root"; 
        Connection conn = DriverManager.getConnection(connURL);
        
        String sqlStr = "DELETE FROM login WHERE userif = '"+ uid+"'";
        PreparedStatement pstmt = conn.prepareStatement(sqlStr);
        pstmt.setString(1, uid);
//        pstmt.setString(2, pwd);
        
        ResultSet rs = pstmt.executeQuery(); 

        rs.next();
        total = rs.getInt("total");
        
        conn.close(); 

    }
    catch(Exception e){
        System.err.println("Error :" + e);  
    }
    
        %>
    </body>
</html>
