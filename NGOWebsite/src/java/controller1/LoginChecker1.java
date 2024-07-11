
package controller1;

import DTO.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;


public class LoginChecker1 extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        UserDTO user=new UserDTO();
        user.setUsername(username);
        user.setPassword(password);
        
        
        LoginAuthenticator authenticator=new LoginAuthenticator();
        boolean login = authenticator.isLogin(user);
        if(login)
        {
            HttpSession session=request.getSession(true);
            session.setAttribute("username",username);
            response.sendRedirect("AdminAdder.jsp");
        }
        else
        {
           response.sendRedirect("login.html"); 
        } 
    }
}

