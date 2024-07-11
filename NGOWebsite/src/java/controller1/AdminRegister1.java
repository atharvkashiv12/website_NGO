/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author athar
 */
public class AdminRegister1 extends HttpServlet 
{
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String adminname=request.getParameter("name");
        String  adminadd=request.getParameter("address");
        String admincontactno = request.getParameter("contactno");
        String  adminpass=request.getParameter("password");
        Connection con = null;
        Statement st = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngodata","root","root");
            System.out.println("Connected");
            st = con.createStatement();
            String query ="INSERT INTO Admin values('"+adminname+"','"+admincontactno+"','"+adminadd+"','"+adminpass+"')";
          
            int i= st.executeUpdate(query);
            
            if(i>0)
            {
                response.sendRedirect("AdminRegistration.html");
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


