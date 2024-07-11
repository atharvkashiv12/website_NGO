package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public final class AdminAdder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hello Admin</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"animal-gcf542cc98_1920.jpg\">\n");
      out.write("        <h1 align=\"center\">Welcome Admin</h1>\n");
      out.write("        <form action=\"AdminRegistration.html\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                 <td><input type=\"submit\"  value=\"ADD ADMIN \" style=\"height:70px; width:200px\" </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        ");

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
                 
      out.write("\n");
      out.write("                 <form action=\"ApprovedNgo\" method=\"post\">\n");
      out.write("                <table bgcolor=\"#989898\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(1));
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"name\" value=\"");
      out.print(rs.getString(1));
      out.write("\" >\n");
      out.write("                    </td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"contact\" value=\"");
      out.print(rs.getString(2));
      out.write("\" >\n");
      out.write("                    </td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(3));
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"pin\" value=\"");
      out.print(rs.getString(3));
      out.write("\" >\n");
      out.write("                    </td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(4));
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"add\" value=\"");
      out.print(rs.getString(4));
      out.write("\" >\n");
      out.write("                    </td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                    <td><br/>");
      out.print(rs.getString(5));
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(rs.getString(5));
      out.write("\" >\n");
      out.write("                    </td>\n");
      out.write("                     </tr>\n");
      out.write("                     \n");
      out.write("                     <tr>\n");
      out.write("                    <td><input type=\"submit\"  value=\"Approve\" style=\"height:50px; width:100px\"></td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("                     </form>\n");
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

        
      out.write("\n");
      out.write("        \n");
      out.write("       <a href=\"logout.jsp\" bgcolor=\"red\">Sign out</a>\n");
      out.write("    </body>\n");
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
