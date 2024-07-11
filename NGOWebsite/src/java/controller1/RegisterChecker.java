
package controller1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
public class RegisterChecker extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String ngoname=request.getParameter("ngoname");
        String pincode=request.getParameter("pincode");
        String  address=request.getParameter("address");
        String registrationid=request.getParameter("registrationid");
        String contactno = request.getParameter("contactno");
        Connection con = null;
        Statement st = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngodata","root","root");
            System.out.println("Connected");
            st = con.createStatement();
            String query ="INSERT INTO ngo values('"+ngoname+"','"+contactno+"','"+pincode+"','"+address+"','"+registrationid+"','pending')";
          
             int i= st.executeUpdate(query);
            
            if(i>0)
            {
                response.sendRedirect("Register.html");
                System.out.println(i+" Record Insertion");            
            }
            else
            {
                System.out.println("Record Insertion Failed");
            }
            con.close();
            
           
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }
}
