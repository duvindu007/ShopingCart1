package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import database.*;

public final class admin_005faddProduct_005f3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Frameset//EN\" \"http://www.w3.org/TR/REC-html40/frameset.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Online</title>\n");
      out.write("        <!--jsp:useBean class=\"product.product\" id=\"product\" scope=\"session\"--><!--/jsp:useBean-->\n");
      out.write("\n");
      out.write("         ");
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
      out.write("        \n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/text.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/960_16.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/product.css\"  />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\"  />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\"/>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script src=\"js/lightbox.js\"></script>\n");
      out.write("        <script src=\"js/myScript.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("            .buy {\n");
      out.write("                margin-top:7px;\n");
      out.write("                margin-bottom:15px;\n");
      out.write("                float:right;\n");
      out.write("                padding:5px;\n");
      out.write("                color:#000;\n");
      out.write("                text-shadow: 0 1px 0 white;\n");
      out.write("                padding:10px;\n");
      out.write("                border-radius:5px;\n");
      out.write("                background: -webkit-linear-gradient(top, #aee800, #8fbe00);\n");
      out.write("                background: -moz-linear-gradient(top, #aee800, #8fbe00);\n");
      out.write("                text-align:center;\n");
      out.write("                box-shadow: 0 1px 4px rgba(0, 0, 0, 0.27);\n");
      out.write("                -webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.27);\n");
      out.write("                -moz-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.27);\n");
      out.write("            }\n");
      out.write("            .buy:hover {\n");
      out.write("                float:right;\n");
      out.write("                color:#000;\n");
      out.write("                border-radius:7px;\n");
      out.write("                text-shadow: 0 -1px 0 white;\n");
      out.write("                text-align:center;\n");
      out.write("                padding:10px;\n");
      out.write("                background: -webkit-linear-gradient(top, #8fbe00,#aee800);\n");
      out.write("                background: -moz-linear-gradient(top, #8fbe00,#aee800);\n");
      out.write("                box-shadow: 0 1px 4px rgba(0, 0, 0, 0.4);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .highlight {\n");
      out.write("                box-shadow: inset -10px 0px 10px #666;\n");
      out.write("                background: #E0E0E0;\n");
      out.write("                border-radius: 0px 27px 27px 0px;\n");
      out.write("            }\n");
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
      out.write("        ");

            if (session.getAttribute("user") == null) {// THen new user, show join now

      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_joinNow.jsp", out, false);
      out.write("\n");
      out.write("        ");
        } else {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_logout.jsp", out, false);
      out.write("\n");
      out.write("        ");
            }
        
        if (session.getAttribute("admin")!= null){
            response.sendRedirect("admin_.jsp");
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
      out.write("                <div class=\"grid_3\">\n");
      out.write("                    <br/><h1>Add Product</h1><hr/>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("                    <div class=\"grid_3\">\n");
      out.write("                        <br/><h1>Step 1. Enter Product Company</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_3\">\n");
      out.write("                        <br/><h1>Step 2. Enter Category</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_3 highlight\">\n");
      out.write("                        <br/><h1>Step 3. Enter in Product Name, Tags</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_3\">\n");
      out.write("                        <br/><h1>Step 4. Enter in Pricing & Quantity and Description</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/hesders_sidebars/admin_menuSideBar.jsp", out, false);
      out.write("\n");
      out.write("                  \n");
      out.write("\n");
      out.write("         <!--jsp:useBean class=\"product.productBean\" scope=\"session\" id=\"productBean\"--><!--/jsp:useBean-->\n");
      out.write("          ");
      product.productBean productBean = null;
      synchronized (_jspx_page_context) {
        productBean = (product.productBean) _jspx_page_context.getAttribute("productBean", PageContext.PAGE_SCOPE);
        if (productBean == null){
          productBean = new product.productBean();
          _jspx_page_context.setAttribute("productBean", productBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write(" \n");
      out.write("            \n");

    if (productBean.getCompany() != null || 
            productBean.getCompany()  == ""){
        response.sendRedirect("admin_addProduct_1.jsp");
    }
    else if ( productBean.getCategory() != null || 
                    productBean.getCategory()  == "" ||
                    productBean.getSubcategory()  != null || 
                    productBean.getSubcategory()  == "" ){
        response.sendRedirect("admin_addProduct_2.jsp");
    }

      out.write("\n");
      out.write("            \n");
      out.write("<style type=\"text/css\">\n");
      out.write("    .error {\n");
      out.write("        box-shadow: 0px 0px 7px #CC0000;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready (function (){\n");
      out.write("        var next= $('.next');\n");
      out.write("        var name= $('#productName');\n");
      out.write("        var tags= $('#tags');\n");
      out.write("        \n");
      out.write("        name.keyup(function (){\n");
      out.write("            if ((name.attr('value').indexOf('\\'') != -1)){\n");
      out.write("                name.addClass('error');\n");
      out.write("                next.attr ('disabled', true);\n");
      out.write("            } else {\n");
      out.write("                name.removeClass('error');\n");
      out.write("                next.attr ('disabled', false);\n");
      out.write("            }\n");
      out.write("            var valueTag = name.attr('value');\n");
      out.write("            tags.val(valueTag);\n");
      out.write("        });\n");
      out.write("        tags.keyup(function (){\n");
      out.write("            if ((tags.attr('value').indexOf('\\'') != -1)){\n");
      out.write("                tags.addClass('error');\n");
      out.write("                next.attr ('disabled', true);\n");
      out.write("            }else {\n");
      out.write("                tags.removeClass('error');\n");
      out.write("                next.attr ('disabled', false);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("         <div class=\"grid_13\"  style=\"padding: 10px 0px;\" id=\"whiteBox\">\n");
      out.write("                \n");
      out.write("                <div class=\"grid_13\">\n");
      out.write("                    <br/><h1>Step 3. Enter in Product Name, Tags</h1><hr/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <form method=\"post\" action=\"admin_addProduct_controller.jsp\">\n");
      out.write("                    <input type=\"hidden\" name=\"company\" value=\"");
      out.print( productBean.getCompany() );
      out.write("\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"category\" value=\"");
      out.print( productBean.getCategory() );
      out.write("\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"subCategory\" value=\"");
      out.print( productBean.getSubcategory() );
      out.write("\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"page\" value=\"admin_addProduct_4.jsp\"/>\n");
      out.write("\n");
      out.write("                    <div class=\"grid_4\">\n");
      out.write("                        <h3>Enter Product Name </h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_5\">\n");
      out.write("                        <input id=\"productName\" type=\"text\" name= \"productName\"  placeholder=\"Product Name\" required/><br/>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div><br/>\n");
      out.write("                    <div class=\"grid_4\">\n");
      out.write("                        <h3>Enter Tags [?]</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_5\">\n");
      out.write("                        <textarea id=\"tags\" name= \"tags\" placeholder=\"Write in tags here without commas\" required></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"clear\"></div><br/>\n");
      out.write("                    <div class=\"grid_7\">\n");
      out.write("                        <input id=\"buy\" class=\"next\" type=\"submit\" value=\"Next >\"/>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
