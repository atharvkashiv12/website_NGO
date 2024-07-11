package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class User1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User</title>\n");
      out.write("        <style>\n");
      out.write("            p{\n");
      out.write("                font-family: cursive;\n");
      out.write("                font-size: 18px;\n");
      out.write("                word-spacing: 4;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                font-style: italic;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body background = \"pexels-chevanon-photography-11080991.jpg\" style=\"background-repeat: no-repeat\">\n");
      out.write("        <h1 align=\"center\">Many animals ,Many hearts</h1>  \n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("        <div style=\"\n");
      out.write("         \n");
      out.write("         width: 50%;\n");
      out.write("        float: left;height: 120px;\">\n");
      out.write("          \n");
      out.write("        <p>Animals have a huge importance in our nature.<BR> We might don’t see any direct connection between agriculture and animals.<BR> But most of the animals have a huge contribution to agriculture and food growing sources.<BR> There is a large number of animals are facing huge aggression and their life is being hard.</p>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("            <div style=\"text-align: right;width: 50%;height: 120px;float: left;\">\n");
      out.write("        <form action=\"User1.jsp\" method=\"post\">\n");
      out.write("      <h2 align=\"right\" bgcolor=\"green\"> SEARCH HERE: <input type=\"numeric\" name=\"pincode1\" placeholder=\"Search here\"/>\n");
      out.write("      <input type=\"submit\" value=\"Search\" >\n");
      out.write("      </h2>\n");
      out.write("        </form>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"Register.html\">\n");
      out.write("            \n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td><input style=\"color: #FFFFFF;\n");
      out.write("    background-color: #4CAF50;border-radius: 5px;\n");
      out.write("    font-size: 17px;\n");
      out.write("    font-family: 'Source Sans Pro', sans-serif;\n");
      out.write("    padding: 6px 18px;\" type=\"submit\"  value=\"NGO REGISTRATION\" style=\"height:30px; width:200px \"></td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

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
            
      out.write("\n");
      out.write("           \n");
      out.write("            <table align=\"right\" width=\"400\"   bgcolor=\"#C1E1C1\" >\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>NGO Name</b></td>\n");
      out.write("                    <td><b>NGO Contact</b></td>\n");
      out.write("                    <td><b>NGO Pincode</b></td>\n");
      out.write("                    <td><b>NGO Address</b></td>\n");
      out.write("                    <td><b>NGO Registration ID</b></td>\n");
      out.write("                </tr>    \n");
      out.write("               \n");
      out.write("        ");

            while(rs.next())
            {
                
      out.write("   \n");
      out.write("                <tr>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                </tr>    \n");
      out.write("               \n");
      out.write("                ");

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
        
      out.write("\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
