package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import database.*;

public final class admin_005faddProduct_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Online Products</title>\n");
      out.write("         ");
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
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script src=\"js/lightbox.js\"></script>\n");
      out.write("        <script src=\"js/myScript.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
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
      out.write("\n");
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
      out.write("\n");
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
      out.write("       \n");
      out.write("        ");
            }
        
    //    if (session.getAttribute("admin")== null){
     //       response.sendRedirect("admin_.jsp");
      //  }
      //  
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_search_navigationbar.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_facebookJoin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container_16\">\n");
      out.write("                <div class=\"grid_16\" style=\"padding: 10px;\" id=\"whiteBox\">\n");
      out.write("                    <div class=\"grid_3\">\n");
      out.write("                        <br/><h1>Add Product</h1><hr/>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("\n");
      out.write("                        <div class=\"grid_3 highlight\">\n");
      out.write("                            <br/><h1>Step 1. Enter Product Company</h1><hr/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grid_3\">\n");
      out.write("                            <br/><h1>Step 2. Enter Category</h1><hr/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grid_3\">\n");
      out.write("                            <br/><h1>Step 3. Enter in Product Name, Tags</h1><hr/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grid_3\">\n");
      out.write("                            <br/><h1>Step 4. Enter in Pricing & Quantity and Description</h1><hr/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/hesders_sidebars/admin_menuSideBar.jsp", out, false);
      out.write("\n");
      out.write("                  \n");
      out.write("            ");

                DB_Conn conn = new DB_Conn();
                Connection con = conn.getConnection();
                Statement st = con.createStatement();
                //String sql_getCategory = "SELECT  `category_name` FROM  `category`; ";
                //String sql_getSubCategory = "SELECT  `sub-category_name` FROM  `sub-category`;";
                String sql_getCompany = "SELECT  company_name FROM  product_company;";
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <!--jsp:useBean class=\"product.productBean\" scope=\"session\" id=\"productBean\"--><!--/jsp:useBean-->\n");
      out.write("                \n");
      out.write("            <div class=\"grid_13\"  style=\"padding: 10px 0px;\" id=\"whiteBox\">\n");
      out.write("                <div class=\"grid_13\">\n");
      out.write("                    <br/><h1>Step 1. Start selecting Product Company Or, Enter a one...</h1><hr/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <form method=\"post\" action=\"admin_addProduct_controller.jsp\">\n");
      out.write("                    <input type=\"hidden\" id=\"buy\" name=\"page\" value=\"admin_addProduct_2.jsp\" action=\"admin_addProduct_2.jsp\"/>\n");
      out.write("                    <div class=\"grid_2\">\n");
      out.write("                        <h3>Select Company</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_5\">\n");
      out.write("                        <select name=\"company\" id=\"company\">\n");
      out.write("\n");
      out.write("                            <option value=\"\" selected>Select a Company</option>\n");
      out.write("\n");
      out.write("                            ");

                                ResultSet company = st.executeQuery(sql_getCompany);
                                while (company.next()) {
                                    String companyName = company.getString("company_name");
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <option value=\"");
      out.print( companyName);
      out.write('"');
      out.write('>');
      out.print( companyName);
      out.write("</option>\n");
      out.write("\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div><br/>\n");
      out.write("                    <div class=\"grid_2\">\n");
      out.write("                        Or\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_5\">\n");
      out.write("                        <h4 id=\"step1Feedback\" class=\"grid_8 center\">-------------------------------------------------------------<br/></h4>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div><br/>\n");
      out.write("                    <div class=\"grid_2\">\n");
      out.write("                        <h3>Add A Company</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_5\">\n");
      out.write("                        <input id=\"companyName\" type=\"text\" name= \"companyName\" placeholder=\"Company Name here\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_2\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div><br/>\n");
      out.write("                    <div class=\"grid_7\">\n");
      out.write("                        <input id=\"addProductNameBtn\" class=\"buy\" type=\"button\" value=\"Add Company\"/>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_5\">\n");
      out.write("                        <input id=\"buy\" type=\"submit\" value=\"Next >\"/>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
