package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.Serializable;
import java.sql.*;
import database.*;

public final class admin_005faddProduct_005fcontroller_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Online Products</title>\n");
      out.write("        ");
      product.product product = null;
      synchronized (_jspx_page_context) {
        product = (product.product) _jspx_page_context.getAttribute("product", PageContext.PAGE_SCOPE);
        if (product == null){
          product = new product.product();
          _jspx_page_context.setAttribute("product", product, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/reset.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/text.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/960_16.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Product.css\"  />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/lightbox.css\"  />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\n");
      out.write("     \n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script src=\"js/lightbox.js\"></script>\n");
      out.write("        <script src=\"js/myScript.js\"></script>\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
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
      out.write("            /*\n");
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
      out.write("            }*/\n");
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
      out.write("       ");

        if (session.getAttribute("user") == null ){// THen new user, show join now
            
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_joinNow.jsp", out, false);
      out.write("\n");
      out.write("        ");

        }else {
            
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_logout.jsp", out, false);
      out.write("\n");
      out.write("        ");

        }
        
      out.write("\n");
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
      out.write("                    <div class=\"grid_15\">\n");
      out.write("                        <br/><h1>Add Product </h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                \n");
      out.write("                <div id=\"leftside\" class=\"grid_3\">\n");
      out.write("                    <ul id=\"leftsideNav\">\n");
      out.write("                        <li><a><strong>Dash Home</strong></a></li>\n");
      out.write("                        <li><a>Stock</a></li>\n");
      out.write("                        <li><a>Performance</a></li>\n");
      out.write("                        <li><a>Orders</a></li>\n");
      out.write("                        <li><a href=\"productInsert.jsp\">Add Product</a></li>\n");
      out.write("                        <li><a>Settings</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!--jsp:useBean class=\"product.product\" id=\"product\" scope=\"session\"--><!--/jsp:useBean-->\n");
      out.write("                \n");
      out.write("                <!--jsp:useBean class=\"product.productBean\" scope=\"session\" id=\"productBean\"--><!--/jsp:useBean-->\n");
      out.write("                \n");
      out.write("                ");
      product.productBean productBean = null;
      synchronized (_jspx_page_context) {
        productBean = (product.productBean) _jspx_page_context.getAttribute("productBean", PageContext.PAGE_SCOPE);
        if (productBean == null){
          productBean = new product.productBean();
          _jspx_page_context.setAttribute("productBean", productBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                \n");
      out.write("                <!--jsp:useBean id=\"productBean\" scope=\"session\"  class=\"product.productBean\"/--> \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("productBean"), "company", "${param.company}", _jspx_page_context, null);
      out.write("     \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("productBean"), "category", "${param.category}", _jspx_page_context, null);
      out.write("     \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("productBean"), "subcategory", "${param.subCategory}", _jspx_page_context, null);
      out.write("     \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("productBean"), "name", "${param.productName}", _jspx_page_context, null);
      out.write("     \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("productBean"), "tags", "${param.tags}", _jspx_page_context, null);
      out.write("     \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("productBean"), "price", "${param.price}", _jspx_page_context, null);
      out.write("     \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("productBean"), "quantity", "${param.productQty}", _jspx_page_context, null);
      out.write("     \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("productBean"), "summary", "${param.summary}", _jspx_page_context, null);
      out.write("     \n");
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"grid_13\"  style=\"padding: 10px 0px;\" id=\"whiteBox\">\n");
      out.write("                    <div class=\"grid_13\">\n");
      out.write("                        <br/><h1>Add Product Controller</h1><hr/>\n");
      out.write("                    ");

                    if (request.getParameter("page") != null){
                        response.sendRedirect(request.getParameter("page"));
                    }else {
                        response.sendRedirect("index.jsp");
                    }
                      
                    
      out.write("\n");
      out.write("                \n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("        </div>\n");
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
