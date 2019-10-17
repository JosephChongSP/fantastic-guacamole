<%-- 
    Document   : verifyUser
    Created on : 30 Apr, 2019, 2:24:56 PM
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
//        String loginid = request.getParameter("loginid");
//        String password = request.getParameter("password");
//        String msg="";
//
//        if ( loginid.equals("Lincoln") && password.equals("LincolnISHandsome") ) { 
//            msg="Welcome, Lincoln.";
//            response.sendRedirect("member.jsp");   // Brings user back
//        }  else { 
//            msg="You have just entered "+loginid+" and "+password+". Thank you!";
//            response.sendRedirect("login.jsp");   // Brings user to another webpage
//        }
          int total = 0;
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
        total = rs.getInt("total");
        
        conn.close(); 

    }
    catch(Exception e){
        System.err.println("Error :" + e);  
    }
    
        %>

        <table border='1'>
            <%
                int count = 0;             
                count = 0;
                out.println("<tr>");
                    out.println("<td width='100' align='center'>");
                    out.println("User ID");
                    out.println("<td width='100' align='center'>");
                    out.println("Password ");
                for (int i = 1; i <= count; i++){
                    out.println("<tr>");
                    out.println("<td width='100' align='center'>");
                    out.println();
                    out.println("<td width='100' align='center'>");
                    out.println();
                
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
