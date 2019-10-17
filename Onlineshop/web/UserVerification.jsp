<%-- 
    Document   : UserVerification
    Created on : 4 Jul, 2019, 8:53:39 AM
    Author     : jrago
--%>

<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
//        String loginid = request.getParameter("loginid");
//        String password = request.getParameter("password");
//        String msg="";
    String uid=request.getParameter("loginid");
    String pwd=request.getParameter("password");
    
        if ( uid.equals("Lincoln") && pwd.equals("HANDSOME") ) { 
            response.sendRedirect("DisplayTimeTable");   // Brings user back
        }  else if( uid.equals("Jeslyn") && pwd.equals("PRETTY") ){
            response.sendRedirect("DisplayTimeTable");   // Brings user back
        } else if ( !uid.equals("Lincoln") || !uid.equals("Jeslyn")){ 
            response.sendRedirect("login.html");   // Brings user to another webpage
        }
          
    
//    
//    if (uid == null || pwd == null){
//        response.sendRedirect("login.html");
//    }else{
//        
//    }
   
//    try{
//        Class.forName("com.mysql.jdbc.Driver");       
//        String connURL="jdbc:mysql://localhost/jspg?user=root&password=root"; 
//        Connection conn = DriverManager.getConnection(connURL);
//        
//        String sqlStr = "SELECT * FROM login";
//        PreparedStatement pstmt = conn.prepareStatement(sqlStr);
//        pstmt.setString(1, uid);
//        pstmt.setString(2, pwd);
//        
//        ResultSet rs = pstmt.executeQuery(); 
//
//        rs.next();
//        
//        response.sendRedirect("DisplayTimeTable.java");
//        
//        conn.close(); 
//
//    }
//    catch(Exception e){
//        System.err.println("Error :" + e);  
//    }
//    
//        %>

<table border='1'>
            <%                
                for (int i = 1; i <= 5; i++){
                    out.println("<tr>");
                    out.println("<td width='100' align='center'>");
                    out.println(i + " x 5");
                    out.println("<td width='100' align='center'>");
                    out.println(i*5);
                }
            %>
        </table>
    </body>
</html>
