package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import database.*;

public final class admin_005f_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Online</title>\n");
      out.write("<!--jsp:useBean class=\"product.product\" id=\"product\" scope=\"session\"--><!--/jsp:useBean>-->\n");
      product.product product = null;
      synchronized (_jspx_page_context) {
        product = (product.product) _jspx_page_context.getAttribute("product", PageContext.PAGE_SCOPE);
        if (product == null){
          product = new product.product();
          _jspx_page_context.setAttribute("product", product, PageContext.PAGE_SCOPE);
        }
      }
      out.write(" \n");
      out.write("\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/reset.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/text.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/960_16.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Product.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\n");
      out.write("<script src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("<script src=\"js/myScript.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");

if (session.getAttribute("admin") == null ){// THen new user, show join now
 
       

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_joinNow1.jsp", out, false);
      out.write('\n');

   
}else {

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_logout1.jsp", out, false);
      out.write('\n');

}

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_search_navigationbar.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_facebookJoin.jsp", out, false);
      out.write("\n");
      out.write("107\n");
      out.write("<div class=\"container_16\">\n");
      out.write("<div class=\"grid_13 push_2\" id=\"whiteBox\" style=\"padding:10px 0px 10px 0px;\">\n");
      out.write("<h1 class=\"push_4\" style=\"padding: 10px;\" >Administrator Login</h1>\n");
      out.write("<hr/> <br/><div class=\"grid_9 push_2\" style=\"padding:10px;\">\n");
      out.write("<form method=\"post\" action=\"admin_login\">\n");
      out.write("<div class=\"grid_2\">\n");
      out.write("Email\n");
      out.write("</div>\n");
      out.write("<div class=\"grid_5\">\n");
      out.write("<input type=\"text\" name=\"email\" placeholder=\"xyz@xyz.com\" />\n");
      out.write("</div>\n");
      out.write("<div class=\"clear\"></div><br/>\n");
      out.write("<div class=\"grid_2\">\n");
      out.write("Password\n");
      out.write("</div>\n");
      out.write("<div class=\"grid_5\">\n");
      out.write("<input type=\"password\" name=\"pass\" /><br/><br/>\n");
      out.write("\n");
      out.write("<input id=\"greenBtn\" type=\"submit\" value=\"Login\"/>\n");
      out.write("</div>\n");
      out.write("<div class=\"clear\"></div><br/>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
