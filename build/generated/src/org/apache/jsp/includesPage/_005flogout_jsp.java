package org.apache.jsp.includesPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.ArrayList;
import user.user;

public final class _005flogout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\n");
      out.write("    .backRed {\n");
      out.write("        background: #CC0000;\n");
      out.write("        padding: 3px 7px;\n");
      out.write("        margin-right: 3px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      cart.cart cart = null;
      synchronized (session) {
        cart = (cart.cart) _jspx_page_context.getAttribute("cart", PageContext.SESSION_SCOPE);
        if (cart == null){
          cart = new cart.cart();
          _jspx_page_context.setAttribute("cart", cart, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');

    ArrayList<Integer> Qty = new ArrayList();
    Qty = cart.getQty();
    int totalQty = 0;
    for (int i=0; i<Qty.size(); i++){
        totalQty += Qty.get(i);
    }
    
        
    
   user User = (user) session.getAttribute("user");
    String email = User.getUserEmail();
    String userName = User.getUsername();
    int uid = User.getUserId();
    
    String printName;
    if (userName == null){
        printName = email;
    }
    else {
        printName = userName;
    }

      out.write("\n");
      out.write("   <div id = \"topWrapper\">\n");
      out.write("        <div class=\"container_16\">\n");
      out.write("                <div class=\"grid_16\">\n");
      out.write("                        <div id=\"logo\" class=\"grid_6\"> <a href=\"index.jsp\"><img src=\"images/logo/icon.png\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grid_9\" id=\"top\">\n");
      out.write("                            <ul>\n");
      out.write("                                <a href=\"_logoutServlet\"><li id=\"greenBtn\" class =\"Btn showForm\">Logout</li></a>\n");
      out.write("                                <a href=\"userinfo.jsp?uid=");
      out.print( uid );
      out.write("\"><li class =\"Btn showForm\">");
      out.print( printName );
      out.write("</li></a>\n");
      out.write("                                ");

                                    if (session.getAttribute("admin") != null){
                                
      out.write("\n");
      out.write("                                <a href=\"admin_Performance.jsp\"><li class =\"Btn showForm\">Administrator: </li></a>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                <a href=\"addToCart_view.jsp\"><li class =\"Btn showForm\"><span class=\"backRed\">");
      out.print( totalQty );
      out.write("</span> in My Cart </li></a>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
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
