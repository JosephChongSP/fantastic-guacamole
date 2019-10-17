<%-- 
    Document   : search
    Created on : 27 Jun, 2019, 8:11:56 AM
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
    String uid=request.getParameter("loginid");
    String pwd=request.getParameter("password");
    
    try{
        Class.forName("com.mysql.jdbc.Driver");       
        String connURL="jdbc:mysql://localhost/jspg?user=root&password=root"; 
        Connection conn = DriverManager.getConnection(connURL);
        
        String sqlStr = "SELECT * FROM login";
        PreparedStatement pstmt = conn.prepareStatement(sqlStr);
        pstmt.setString(1, uid);
        pstmt.setString(2, pwd);
        
        ResultSet rs = pstmt.executeQuery(); 

        rs.next();
        
        conn.close(); 

    }
    catch(Exception e){
        System.err.println("Error :" + e);  
        response.sendRedirect("login.html");
    }
    

        %>
        <form action="processSearch.jsp" method="post">
             Search Phone: <input name="searchString" type='text' required>
             <input type="search" name="btnSearch" value="Search">
        </form>
    </body>
</html>
