package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import database.*;

public final class admin_005faddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title> Online </title>\n");
      out.write("        <!--jsp:useBean class=\"product.product\" id=\"product\" scope=\"session\"--><!--/jsp:useBean-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!--link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/-->\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\"/-->\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/text.css\"/-->\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/960_16.css\"/-->\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/product.css\"  /-->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/reset.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/text.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/960_16.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Product.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/lightbox.css\"  />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script src=\"js/lightbox.js\"></script>\n");
      out.write("        <script src=\"js/myScript.js\"></script>\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            \n");
      out.write("            .highlight {\n");
      out.write("                box-shadow: inset -10px 0px 10px #666;\n");
      out.write("                background: #E0E0E0;\n");
      out.write("                border-radius: 0px 27px 27px 0px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .blueButton {\n");
      out.write("                background: -webkit-linear-gradient(top,#00AAC9, #026A84);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            #buy {\n");
      out.write("                padding: 30px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                -webkit-transition:.3s all ease-in-out;\n");
      out.write("                -moz-transition:.3s all ease-in-out;\n");
      out.write("            }\n");
      out.write("            #buy:hover {\n");
      out.write("                padding: 30px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                box-shadow: inset 0px 2px 17px #444;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #buy {\n");
      out.write("                padding: 30px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                box-shadow: 0px 2px 7px #444;\n");
      out.write("                -webkit-transition:.3s all ease-in-out;\n");
      out.write("                -moz-transition:.3s all ease-in-out;\n");
      out.write("                background: -webkit-linear-gradient(top,#00AAC9, #026A84);\n");
      out.write("                background: -moz-linear-gradient(top,#00AAC9, #026A84);\n");
      out.write("            }\n");
      out.write("            #buy:active {\n");
      out.write("                padding: 30px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                box-shadow: 0px 2px 7px #444;\n");
      out.write("                -webkit-box-shadow: inset 0 0 10px #000;\n");
      out.write("                -moz-box-shadow: inset 0 0 5px #000;\n");
      out.write("                background: -webkit-linear-gradient(top, #026A84,#00AAC9);\n");
      out.write("                background: -moz-linear-gradient(top, #026A84,#00AAC9);\n");
      out.write("            }\n");
      out.write("            #buy:hover {\n");
      out.write("                padding: 30px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                box-shadow: inset 0px 2px 17px #444;\n");
      out.write("                background: -webkit-linear-gradient(top, #026A84,#00AAC9);\n");
      out.write("                background: -moz-linear-gradient(top, #026A84,#00AAC9);\n");
      out.write("            \n");
      out.write("            }*\n");
      out.write("            .adminMenu {\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                margin-right: 0px;\n");
      out.write("                background: #FFF;\n");
      out.write("                box-shadow: 0px 0px 10px #333;\n");
      out.write("            }\n");
      out.write("            .adminMain {\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                background: #FFF;\n");
      out.write("                box-shadow: 0px -1px 10px #333;\n");
      out.write("            }\n");
      out.write("            #leftside {\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("  ");

            if (session.getAttribute("admin") == null) {// THen new user, show join now

         response.sendRedirect("admin_.jsp");
               } else {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_logout1.jsp", out, false);
      out.write("\n");
      out.write("        ");
}
             
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_search_navigationbar.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_facebookJoin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container_16\">\n");
      out.write("            <div class=\"grid_16\" style=\"padding: 10px;\" id=\"whiteBox\">\n");
      out.write("                    <div class=\"grid_3\">\n");
      out.write("                        <br/><h1>Add Product</h1>\n");
      out.write("                    </div>\n");
      out.write("                <div>\n");
      out.write("                        \n");
      out.write("                <div class=\"grid_3\">\n");
      out.write("                        <br/><h1>Step 1. Enter Product Company</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"grid_3\">\n");
      out.write("                        <br/><h1>Step 2. Enter Category</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"grid_3\">\n");
      out.write("                        <br/><h1>Step 3. Enter in Product Name, Tags</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"grid_3\">\n");
      out.write("                        <br/><h1>Step 4. Enter in Pricing & Quantity and Description</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/hesders_sidebars/admin_menuSideBar.jsp", out, false);
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"grid_13\"  style=\"padding: 10px 0px;\" id=\"whiteBox\">\n");
      out.write("                    <div class=\"grid_13\">\n");
      out.write("                        <br/><h1>4 Step Process for Adding Products...</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"grid_7\">\n");
      out.write("                        <a style=\"\n");
      out.write("border: 1px solid black;\n");
      out.write("box-shadow: 0px 2px 10px #333;\" href=\"admin_addProduct_1.jsp\" class=\"grid_5 push_2\" id=\"buy\">Start Adding Products right Now...!</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
