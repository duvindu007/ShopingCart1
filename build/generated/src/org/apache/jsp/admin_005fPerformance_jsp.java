package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import database.*;

public final class admin_005fPerformance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SaiKiran BookStores</title>\n");
      out.write("        <!--jsp:useBean class=\"product.product\" id=\"product\" scope=\"session\"--><!--/jsp:useBean-->\n");
      out.write("        ");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/reset.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/text.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/960_16.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Product.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script src=\"js/lightbox.js\"></script>\n");
      out.write("        <script src=\"js/myScript.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
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
      out.write("         ");

        if (session.getAttribute("admin") == null ){// THen new user, show join now
            
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_joinNow1.jsp", out, false);
      out.write("\n");
      out.write("        ");

        }else {
            
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_logout1.jsp", out, false);
      out.write("\n");
      out.write("        ");

        }
        
        if (session.getAttribute("admin")== null){
            response.sendRedirect("admin_.jsp");
        }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_search_navigationbar.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_facebookJoin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container_16\">\n");
      out.write("\n");
      out.write("            <div class=\"grid_16\" style=\"padding: 10px;\" id=\"whiteBox\">\n");
      out.write("                    <br/>\n");
      out.write("                    \n");
      out.write("                    ");

                    
                        String sqlPending = "SELECT COUNT(status1) as pending  FROM  orders";
                        
                        String sqlApproved = "SELECT COUNT(status1) as approved  FROM  orders";
                        // WHERE  status =  'approved'
                        String sqlQuantity = "SELECT COUNT(product_name) as qty FROM  products WHERE  product_qty <5";
                        
                       sqlQuantity = "SELECT COUNT(product_name) AS qty FROM  products WHERE  product_qty <5";
                        
                        Connection c = new DB_Conn().getConnection();
                        Statement st = c.createStatement();
                        
                        ResultSet rs = null;
                        String  qty = "0", 
                                pendingOrders= "0",
                                approvedOrders= "0";
                        
                        rs = st.executeQuery(sqlQuantity);
                        while (rs.next()){
                                qty = rs.getString("qty");
                        }
                        if (qty.equals("0")){
                            qty = "No";
                        }
                        
                        rs = st.executeQuery(sqlPending);
                        while (rs.next()){
                                pendingOrders = rs.getString("pending");
                        }
                        if (pendingOrders.equals("0")){
                            pendingOrders = "No";
                        }
                        
                        rs = st.executeQuery(sqlApproved);
                        while (rs.next()){
                                approvedOrders = rs.getString("approved");
                        }
                        if (approvedOrders.equals("0")){
                            approvedOrders = "No";
                        }
                    
      out.write("\n");
      out.write("                <h1 class=\"grid_15\">Dashboard Home</h1><hr/>\n");
      out.write("                <a href=\"admin_manageProduct.jsp\" id=\"buy\"  class=\"grid_3\">");
      out.print( qty );
      out.write(" Items below Quantity</a>     \n");
      out.write("                <a href=\"admin_approvedOrders.jsp\" id=\"buy\"  class=\"grid_3\">");
      out.print( approvedOrders );
      out.write(" Items to be Delivered</a>    \n");
      out.write("                <a href=\"admin_pendingOrders.jsp\" id=\"buy\" class=\"grid_3\">");
      out.print( pendingOrders );
      out.write(" Items to be Approved</a>    \n");
      out.write("           </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            <!--Loading the AJAX API-->\n");
      out.write("                <script type=\"text/javascript\" src=\"js/gclibrary/jsapi.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"js/gclibrary/core.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"js/gclibrary/core1.js\"></script>\n");
      out.write("                \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/gChartings/gChart_ComboLine.jsp", out, false);
      out.write("\n");
      out.write("                \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/hesders_sidebars/admin_menuSideBar.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"grid_13\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/gChartings/gCharts_pieChartItemsSoldByCategory.jsp", out, false);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/gChartings/gCharts_pieChartItemsViewedByCategory.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/gChartings/gCharts_top10ProductsSold.jsp", out, false);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/gChartings/gCharts_top10Products_viewed.jsp", out, false);
      out.write("\n");
      out.write("                 </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_footer.jsp", out, false);
      out.write("\n");
      out.write("       \n");
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
