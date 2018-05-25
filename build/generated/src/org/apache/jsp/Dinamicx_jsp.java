package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import database.DB_Conn;

public final class Dinamicx_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>Online Time Sheet</title>\n");
      out.write("</head>\n");
      out.write("<form>\n");
      out.write(" <body>\n");
      out.write(" <table  border='1' cellpadding='5' cellspacing='0' width='400'>\n");
      out.write("<td align ='center'><h3>Online Time Sheet</h3>\n");
      out.write("    </table>\n");
      out.write("     <br/>     \n");
      out.write("  Epf No: <input type=\"text\" name=\"EPFNo\" size=\"20\"><br>\n");
      out.write("<br/><br/><br/><br/>\n");
      out.write("<table width=\"70%\" border=\"1\">\n");
      out.write("         <thead align='center'>\n");
      out.write("    \n");
      out.write("\t\t<th width=\"5%\">Date</th>\n");
      out.write("\t\t<th width=\"5%\">Hours</th>\n");
      out.write("                <th width=\"10%\">Dep. Site</th>\n");
      out.write("                <th width=\"50%\">Site Name</th>\n");
      out.write("                <th width=\"30%\">Reason</th>\n");
      out.write("\t</thead>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

   
        
         DB_Conn con = new DB_Conn();
                        Connection c = con.getConnection();
                        Statement st = c.createStatement();
                        ResultSet r = null ;
                     //   ResultSet rs ;
        
        
        int counter=1;
       // String q = "select format(TS_DATE,'M/d/yyyy') from TIME_SHEET;";      
        //r= st.executeQuery(q);
        
     
        
      // String qT = "select * from TH_EMP_MST WHERE HRD_EMP_NO = 81;";      
       // rs= st.executeQuery(qT);
        
     //   rs.next();
        
      //  while(r.next())
        {
            
      out.write("\n");
      out.write("                <tr align='Left'>\n");
      out.write("                     <td>");
      out.print( r.getString(1));
      out.write("</td>          \n");
      out.write("                     <!--td><input type=\"text\"><td-->\n");
      out.write("                       <td><input name=\"contacts[");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("].Hours\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                       \n");
      out.write("                       <td>");
      out.print( "S00");
      out.write("</td>\n");
      out.write("                       <td>");
      out.print("Head Office");
      out.write("</td> \n");
      out.write("                       <!--td><select name=\"cboItems\" id=\"cboItems\"></td--> \n");
      out.write("                       <!--td><input type=\"text\" value=\"\" size=\"20\" name=\"_79_firstName\" class=\"form-text\"/><td-->\n");
      out.write("                       <td>\n");
      out.write("                       <select>\n");
      out.write("                        <option value=\"volvo\"></option>\n");
      out.write("                        <option value=\"volvo\">Customer Request</option>\n");
      out.write("                       \n");
      out.write("                      </select>\n");
      out.write("                       </td>\n");
      out.write("                </tr>\n");
      out.write("            ");
 
        }
        
        
    
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("</table\n");
      out.write("<br/><br/>\n");
      out.write("\n");
      out.write(" <p align=\"left\">\n");
      out.write("    <input type=\"submit\" name=\"Submit\" value=\"Submit\">\n");
      out.write("  </p>\n");
      out.write("  </form>\n");
      out.write(" </body>  \n");
      out.write("  </html>");
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
