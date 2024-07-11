<%-- 
    Document   : home
    Created on : 26 Jun, 2022, 6:08:53 PM
    Author     : athar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <a href="logout.jsp">Sign out</a>
        <%
            String username=(String)session.getAttribute("username");
            if(username==null || username.trim().equals(""))
            {
                response.sendRedirect("login.html");
            }
        %>
        <h1>Welcome <%=username%>....!</h1>
        
        <h2>Login Successful...</h2>
    </body>
</html>
