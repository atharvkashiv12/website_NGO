
package model;

import DB.DBConnector;
import DTO.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginAuthenticator 
{
    public boolean isLogin(UserDTO user)
    {
        String username=user.getUsername();
        String password=user.getPassword();
        String tablePassword = "";
        
        
        try
        {
            Statement st = DBConnector.getStatement();
            String query= "select adminpass from Admin where adminname='"+username+"'";
            System.out.println("Query="+query);
            
            ResultSet rs= st.executeQuery(query);
            if(rs.next())
            {
                tablePassword=rs.getString(1);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
       if(username!=null && password!=null && !username.trim().equals("")  && password.equals(tablePassword))
       {
           return true;
       }
       return false;
    }
    
}
