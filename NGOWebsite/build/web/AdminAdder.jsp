<%-- 
    Document   : AdminAdder
    Created on : 2 Aug, 2022, 8:07:57 PM
    Author     : athar
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Admin</title>
    </head>
    <body background="animal-gcf542cc98_1920.jpg">
        <h1 align="center">Welcome Admin</h1>
        <form action="AdminRegistration.html">
        <table>
            <tr>
                 <td><input type="submit"  value="ADD ADMIN " style="height:70px; width:200px" </td>
            </tr>
        </table>
        </form>
        <%
        Connection con=null;
        Statement st =null;
        ResultSet rs=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngodata","root","root");
            System.out.println("Connected");
            
            st = con.createStatement();
            
            String query = "SELECT * FROM ngo where status='pending'";
            
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
                 %>
                 <form action="ApprovedNgo" method="post">
                <table bgcolor="#989898">
                <tr>
                    <td><br/><%=rs.getString(1)%>
                        <input type="hidden" name="name" value="<%=rs.getString(1)%>" >
                    </td>
                     </tr>
                     <tr>
                    <td><br/><%=rs.getString(2)%>
                        <input type="hidden" name="contact" value="<%=rs.getString(2)%>" >
                    </td>
                     </tr>
                     <tr>
                    <td><br/><%=rs.getString(3)%>
                        <input type="hidden" name="pin" value="<%=rs.getString(3)%>" >
                    </td>
                     </tr>
                     <tr>
                    <td><br/><%=rs.getString(4)%>
                        <input type="hidden" name="add" value="<%=rs.getString(4)%>" >
                    </td>
                     </tr>
                     <tr>
                    <td><br/><%=rs.getString(5)%>
                        <input type="hidden" name="id" value="<%=rs.getString(5)%>" >
                    </td>
                     </tr>
                     
                     <tr>
                    <td><input type="submit"  value="Approve" style="height:50px; width:100px"></td>
                </tr>
                </table>
                     </form>
                <%
            }
            con.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        } 

        %>
        
       <a href="logout.jsp" bgcolor="red">Sign out</a>
    </body>
</html>
