<%-- 
    Document   : processSearch
    Created on : 27 Jun, 2019, 8:27:28 AM
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
        <%--
//    String srchStr=request.getParameter("searchString");
//    
//            if ( !srchStr.equals("WEB")) { 
//            response.sendRedirect("search.jsp");
//        }  else { 
//            
//        }
//    try{
//        Class.forName("com.mysql.jdbc.Driver");       
//        String connURL="jdbc:mysql://localhost/jspg?user=root&password=root"; 
//        Connection conn = DriverManager.getConnection(connURL);
//        
//        String sqlStr = "SELECT * FROM Inventory";
//        PreparedStatement pstmt = conn.prepareStatement(sqlStr);
//        pstmt.setString(1, srchStr);        
//        ResultSet rs = pstmt.executeQuery(); 
//
//        rs.next();
//        
//        conn.close(); 
//
//    }
//    catch(Exception e){
//        System.err.println("Error :" + e);  
//    }
//    
        --%>
        <form action="processSearch.jsp" method="post">
             Search Phone: <input name="searchString" type='text' required>
             <input type="search" name="btnSearch" value="Search">
        </form>
        <table border='1'>
            <%
                int ID;    
                String  Brand, Model, Functions, Quantity;
                String search=request.getParameter("searchString");
    try{
        Class.forName("com.mysql.jdbc.Driver");       
        String connURL="jdbc:mysql://localhost/jspg?user=root&password=root"; 
        Connection conn = DriverManager.getConnection(connURL);
        
        Statement stmt = conn.createStatement();
        String sqlStr = "SELECT * FROM Inventory WHERE functions" + "like'%" + search + "%'order by brand, model";
        ResultSet rs= stmt.executeQuery(sqlStr);
//        PreparedStatement pstmt = conn.prepareStatement(sqlStr);
//        pstmt.setString(1, search);        
//        ResultSet rs = pstmt.executeQuery(); 

        while (rs.next()){
            ID = rs.getInt("id");
            Brand = rs.getString("brand");
            Model = rs.getString("model");
            Functions = rs.getString("functions");
            Quantity = rs.getString("quantity");
        }
        
        conn.close(); 

    }
    catch(Exception e){
        System.err.println("Error :" + e);  
    }
 
//                int count = 0;             
//                count = 0;
//                out.println("<tr>");
//                    out.println("<td width='100' align='center'>");
//                    out.println("Brand");
//                    out.println("<td width='100' align='center'>");
//                    out.println("Model");
//                    out.println("<td width='100' align='center'>");
//                    out.println("Functions");
//                    out.println("<td width='100' align='center'>");
//                    out.println("Quantity");
//                    out.println("<td width='100' align='center'>");
//                    out.println("Actions");
//                for (int i = 1; i <= count; i++){
//                    out.println("<tr>");
//                    out.println("<td width='100' align='center'>");
//                    out.println();
//                    out.println("<td width='100' align='center'>");
//                    out.println();
//                    out.println("<td width='100' align='center'>");
//                    out.println();
//                    out.println("<td width='100' align='center'>");
//                    out.println();
//                    out.println("<td width='100' align='center'>");
//                    out.println();
                
//                for (int i = 1; i <= 5; i++){
//                    out.println("<tr>");
//                    out.println("<td width='100' align='center'>");
//                    out.println(i + " x 5");
//                    out.println("<td width='100' align='center'>");
//                    out.println(i*5);
//                }
            %>
        </table>
    </body>
</html>
