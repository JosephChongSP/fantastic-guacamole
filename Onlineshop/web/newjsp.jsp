<%-- 
    Document   : newjsp
    Created on : 16 May, 2019, 8:13:34 AM
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
    String uid=request.getParameter("loginid");
    String pwd=request.getParameter("password");
    
    try{
        Class.forName("com.mysql.jdbc.Driver");       
        String connURL="jdbc:mysql://localhost/jspg?user=root&password=root"; 
        Connection conn = DriverManager.getConnection(connURL);
        
        String pStr = "INSERT INTO students(id,name,score) VALUES (4, 'Tim', 77)" ;
        PreparedStatement pstmt = conn.prepareStatement(pStr);
        pstmt.setString(1, uid);
        pstmt.setString(2, pwd);
        
        ResultSet rs = pstmt.executeQuery(); 

        rs.next();
        total = rs.getInt("total");
        
        conn.close(); 

    }
    catch(Exception e){
        System.err.println("Error :" + e);  
    }
    
    
    
    
//    Statement stmt = conn.createStatement(); 
//    String sqlStr = "SELECT * FROM students";
//    ResultSet rs = stmt.executeQuery(sqlStr); 
       
//    //create table
//    String sqlStr = "CREATE TABLE students ("
//            +"id INTEGER NOT NULL, " 
//            + "name VARCHAR (20) NOT NULL, "
//                    + "score INTEGER NOT NULL"
//                    + " )";  
//    stmt.executeUpdate(sqlStr);
//
//    //insert records
//    
//    stmt.executeUpdate(sqlStr);

    
    
//    String insertstr = "INSERT INTO Inventory (ITEM,QTY) VALUES (?,?)";
//
//
//
//    
//    PreparedStatement pstmt = conn.prepareStatement(insertstr);
//    pstmt.setString(1,"P4");
//    pstmt.setInt(2,888);
//    int count = pstmt.executeUpdate();
%>
    </body>
</html>
