<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User</title>
        <style>
            p{
                font-family: cursive;
                font-size: 18px;
                word-spacing: 4;
            }
            h1{
                font-style: italic;
            }
        </style>
    </head>
    
    <body background = "pexels-chevanon-photography-11080991.jpg" style="background-repeat: no-repeat">
        <h1 align="center">Many animals ,Many hearts</h1>  
        
        <div>
        <div style="
         
         width: 50%;
        float: left;height: 120px;">
          
        <p>Animals have a huge importance in our nature.<BR> We might don’t see any direct connection between agriculture and animals.<BR> But most of the animals have a huge contribution to agriculture and food growing sources.<BR> There is a large number of animals are facing huge aggression and their life is being hard.</p>
        
        </div>
            <div style="text-align: right;width: 50%;height: 120px;float: left;">
        <form action="User1.jsp" method="post">
      <h2 align="right" bgcolor="green"> SEARCH HERE: <input type="numeric" name="pincode1" placeholder="Search here"/>
      <input type="submit" value="Search" >
      </h2>
        </form>
         </div>
        </div>
        <form action="Register.html">
            
        <table>
            <tr>
                <td><input style="color: #FFFFFF;
    background-color: #4CAF50;border-radius: 5px;
    font-size: 17px;
    font-family: 'Source Sans Pro', sans-serif;
    padding: 6px 18px;" type="submit"  value="NGO REGISTRATION" style="height:30px; width:200px "></td>
            
            </tr>
        </table>
        </form>
        
        
        <%
        String pincode1=request.getParameter("pincode1");
        if(pincode1!=null)
        {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngodata","root","root");
            System.out.println("Connected");
            st = con.createStatement();
            String query ="SELECT * From ngo where pincode='"+pincode1+"' AND status='approved'";
            System.out.println("Query = "+query);
            rs = st.executeQuery(query);
            %>
           
            <table align="right" width="400"   bgcolor="#C1E1C1" >

                <tr>
                    <td><b>NGO Name</b></td>
                    <td><b>NGO Contact</b></td>
                    <td><b>NGO Pincode</b></td>
                    <td><b>NGO Address</b></td>
                    <td><b>NGO Registration ID</b></td>
                </tr>    
               
        <%
            while(rs.next())
            {
                %>   
                <tr>
                    <td><br/><%=rs.getString(1)%></td>
                    <td><br/><%=rs.getString(2)%></td>
                    <td><br/><%=rs.getString(3)%></td>
                    <td><br/><%=rs.getString(4)%></td>
                    <td><br/><%=rs.getString(5)%></td>
                </tr>    
               
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
}
        %>
        </table>
            
</body>
</html>
