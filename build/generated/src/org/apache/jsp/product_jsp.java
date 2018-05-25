package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.*;
import database.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write(" <!--%@ page import=\"java.sql.*\" %-->\n");
      out.write("\n");
      out.write("<!--% Class.forName(\"com.microsoft.sqlserver.jdbc.SQLServerDriver\"); %-->\n");
      out.write("\n");
      out.write("  \n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title> Electronics</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<!--link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/-->\n");
      out.write("<!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\"/-->\n");
      out.write("<!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/text.css\"/-->\n");
      out.write("<!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/960_16.css\"/-->\n");
      out.write("<!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\"/-->\n");
      out.write("<!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/product.css\" /-->\n");
      out.write("<!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\" /-->\n");
      out.write("<script src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");

if (session.getAttribute("user") == null ){// THen new user, show join now

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_joinNow.jsp", out, false);
      out.write('\n');

}else {

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_logout.jsp", out, false);
      out.write('\n');

}

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_search_navigationbar.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_facebookJoin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    \n");




String id = request.getParameter("id");
if (request.getParameter("id") == null) {
response.sendRedirect("viewProducts_.jsp");


}else {

 //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
 //Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ShopingCartDB;user=sa;password=4525449");

 //Statement statement = connection.createStatement() ;
 //ResultSet resultset  = statement.executeQuery("SELECT * FROM products p, images i  WHERE  p.product_id=i.product_id and p.product_id =1") ; 

//resultset.next();

 DB_Conn c = new DB_Conn();
 Connection con = c.getConnection();

 Statement st = con.createStatement();

//
 String getProductQuery = "SELECT * FROM  products p , images i  WHERE  p.product_id =1";
 ResultSet rs = st.executeQuery(getProductQuery);

 rs.next();

String product_id = rs.getString("product_id");
int product_hits = rs.getInt("hits");
String product_name = rs.getString("product_name");
String sub_category_name = rs.getString("sub_category_name");
String category_name = rs.getString("category_name");
String company_name = rs.getString("company_name");
String price = rs.getString("price");
String summary = rs.getString("summary");
String image_name = rs.getString("image_name");
 


 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container_16\">\n");
      out.write("<div class=\"grid_16\" id=\"productStrip\">\n");
      out.write("<div class=\"ProductHeading\">\n");
      out.write("<div class=\"grid_16\">\n");
      out.write("<h2 class=\"heading\">");
      out.print( product_name);
      out.write('-');
      out.write(' ');
      out.print(company_name);
      out.write(' ');
      out.print( category_name);
      out.write("</h2>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"grid_10\">\n");
      out.write("<div class=\"grid_10\">\n");
      out.write("<br/>\n");
      out.write("<h5>Category :<a href=\"#\"><span class=\"blue\">");
      out.print( category_name);
      out.write("</span></a> > <a href=\"#\"><span class=\"blue\">");
      out.print( sub_category_name);
      out.write("</span></a></h5>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("<br/>\n");
      out.write("<h5>Priced At <span class=\"BigRed\">Rs. ");
      out.print( price);
      out.write("</span></h5>\n");
      out.write("<br/>\n");
      out.write("<br/>\n");
      out.write("<a href=\"addToCart.jsp?id=");
      out.print( product_id );
      out.write("\">\n");
      out.write("<div class=\"grid_3\" id=\"buy\">\n");
      out.write("Buy This Product Now\n");
      out.write("</div>\n");
      out.write("</a>\n");
      out.write("<h1>Summary Of this item</h1>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("<p>Summary of ");
      out.print( product_name);
      out.write('\n');
      out.print( summary);
      out.write("\n");
      out.write("<h1>Brief Description</h1>\n");
      out.write("<br/>\n");
      out.write("<table class=\"grid_6\" id=\"descripTable\">\n");
      out.write("<tr class=\"grid_6\">\n");
      out.write("<td>Name:</td>\n");
      out.write("<td>");
      out.print( product_name);
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"grid_6\">\n");
      out.write("<td>Category</td>\n");
      out.write("<td>");
      out.print( category_name);
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"grid_6\">\n");
      out.write("<td>Sub-Category</td>\n");
      out.write("<td>");
      out.print( sub_category_name);
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"grid_6\">\n");
      out.write("<td>Company </td>\n");
      out.write("<td>");
      out.print( company_name);
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"grid_5\">\n");
      out.write("<div id=\"productImages\">\n");
      out.write("<!-- Images with T are thumbs Images While with Q are The actual source Images -->\n");
      out.write("<img class=\"BigProductBox\" alt=\"");
      out.print( product_name );
      out.write("\" src=\"");
      out.print( image_name);
      out.write("\" />\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("\n");

//p.product_id=i.product_id
String getImages = "SELECT image_name FROM products p, images i WHERE p.product_id=i.product_id AND  p.product_id ='" + product_id + "'";
rs.close();
 rs = st.executeQuery(getImages);
//rs = statement.executeQuery(getImages);
int img_number = 1;
rs.next();
// GET THE REST OF THE PRODUCT IMAGES
while (rs.next()) {
image_name = rs.getString("image_name");

      out.write("\n");
      out.write("<a href=\"");
      out.print( image_name );
      out.write("\" rel=\"lightbox[product]\" title=\"Click on the right side of the image to move forward.\">\n");
      out.write("<img class=\"SmallProductBox\" alt=\"");
      out.print( image_name );
      out.write(" 1 of 8 thumb\" src=\"");
      out.print( image_name );
      out.write("\" />\n");
      out.write("\n");
      out.write("</a>\n");
      out.write("                        ");
                            
                            }
 //statement.execute("UPDATE  products "
//+" SET  hits =  '"+(product_hits+1)+"' "
//+" WHERE  products.product_id =1");
// statement.close();
                        }
                        
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/mainHeaders/topMostViewedProducts_5_1.jsp", out, false);
      out.write("\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_footer.jsp", out, false);
      out.write("\n");
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
