package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.*;
import database.*;

public final class viewProducts_005f_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>Online Electronic Shopping</title>\r\n");
      out.write("        <!--jsp:useBean class=\"product.product\" id=\"productx\" scope=\"session\"!--><!--/jsp:useBean-->\r\n");
      out.write("        ");
      product.product product = null;
      synchronized (_jspx_page_context) {
        product = (product.product) _jspx_page_context.getAttribute("product", PageContext.PAGE_SCOPE);
        if (product == null){
          product = new product.product();
          _jspx_page_context.setAttribute("product", product, PageContext.PAGE_SCOPE);
        }
      }
      out.write(" \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\r\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\"/-->\r\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/text.css\"/-->\r\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/960_16.css\"/-->\r\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/product.css\"  /-->\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/lightbox.css\"  />\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("        <script src=\"js/lightbox.js\"></script>\r\n");
      out.write("        <script src=\"js/myScript.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");

        if (session.getAttribute("user") == null ){// THen new user, show join now
            
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_joinNow.jsp", out, false);
      out.write("\r\n");
      out.write("        ");

        }else {
            
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_logout.jsp", out, false);
      out.write("\r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_search_navigationbar.jsp", out, false);
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_facebookJoin.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container_16\">\r\n");
      out.write("            <div id = \"contents\">\r\n");
      out.write("                <!-- LeftSide -->\r\n");
      out.write("                ");

                    /*
                *       FILTERING OF PRODUCTS AS OF FOLLOWS
 * 1) Retrieve Category 
 *      if Category set 
 *      Show 
 *          SubCategory
 *          Company
 *          Pricing
 *              SQL select * from products WHERE category = 'cat';
 *      2) Retrieve Sub Category 
                if SubCategory is set
 *                  Shw
    *                  Company  
    *                  Pricing
 *                  SQL select * from products WHERE subcategory = 'scat';
            *     else  Show 
            *          SubCategory
            *          Company
            *          Pricing
 *      else 
 *          Show
 *          Category 
 *          Pricing
 *              SQL select * from products;
 * 
 * Accordingly set the SQL Statement 
                */
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"leftside\" class=\"grid_3\">\r\n");
      out.write("                    \r\n");
      out.write("                    ");

                        String category, subcategory;
                        StringBuffer sql = new StringBuffer();
                        sql.append("SELECT * FROM  products p "
                                        + "INNER JOIN  images i "
                                        + "ON (p.product_id=i.product_id ) ");
                        
                        category = "";
                        subcategory = "";
                        if(session.getAttribute("cat") != null ){
                            category = (String) session.getAttribute("cat");
                            ArrayList subCat = product.getSubcategory(category);
                                
                     
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("                            <div>\r\n");
      out.write("                                <ul id=\"leftsideNav\">\r\n");
      out.write("                                    <li><a href=\"#\"><strong>Sub-Categories</strong></a></li>\r\n");
      out.write("                            ");

                            for (int i =0; i< subCat.size(); i++){
                                
      out.write("\r\n");
      out.write("                                <li><a href=\"addProductFilters.jsp?scat=");
      out.print( subCat.get(i) );
      out.write('"');
      out.write('>');
      out.print( subCat.get(i) );
      out.write("</a></li>      \r\n");
      out.write("                                ");

                            } subCat.clear(); 
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                       \r\n");
      out.write("                             ");

                            if (session.getAttribute("scat") != null){
                                subcategory = (String) session.getAttribute("scat");
                                
                            }
                        } else {
                            //Show Category
                            ArrayList Cat = product.getCategory();
                            
      out.write("\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <ul id=\"leftsideNav\">\r\n");
      out.write("                                    <li><a href=\"#\"><strong>Categories</strong></a></li>\r\n");
      out.write("                            ");

                            for (int i =0; i< Cat.size(); i++){
                                
      out.write("\r\n");
      out.write("                                <li><a href=\"addProductFilters.jsp?cat=");
      out.print( Cat.get(i) );
      out.write('"');
      out.write('>');
      out.print( Cat.get(i) );
      out.write("</a></li>      \r\n");
      out.write("                                ");

                            } Cat.clear();
                            
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");

                        }
                    
      out.write("\r\n");
      out.write("                    <!--\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <ul id=\"leftsideNav\">\r\n");
      out.write("                            <li><a href=\"#\"><strong>Categories</strong></a></li>\r\n");
      out.write("                            <li><a href=\"#\">Books</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Calculators</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Art Supplies</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Office Supplies</a></li>\r\n");
      out.write("                            <li><a href=\"#\">School Supplies</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Games</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Movies</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div>\r\n");
      out.write("                        <ul id=\"leftsideNav\">\r\n");
      out.write("                            <li><a href=\"#\"><strong>Sub-Categories</strong></a></li>\r\n");
      out.write("                            <li><a href=\"#\">Books</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Calculators</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Art Supplies</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Office Supplies</a></li>\r\n");
      out.write("                            <li><a href=\"#\">School Supplies</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Games</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Movies</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div>\r\n");
      out.write("                        <ul id=\"leftsideNav\">\r\n");
      out.write("                            <li><a href=\"#\"><strong>Pricing</strong></a></li>\r\n");
      out.write("                            <li><a href=\"#\">Low to High</a></li>\r\n");
      out.write("                            <li><a href=\"#\">High to Low</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    -->\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"adv\">\r\n");
      out.write("                        <h2><br/>This is The Header of an Advertisement</h2>\r\n");
      out.write("                        <p>We offer Advertisement display here </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Middle -->\r\n");
      out.write("            <div id=\"middle\"class=\"grid_13\">\r\n");
      out.write("                <div class=\"grid_13\" id=\"whiteBox\">\r\n");
      out.write("                    <div class=\"ProductHeading\">\r\n");
      out.write("                        <div class=\"grid_12\">\r\n");
      out.write("                                <h2 class=\"heading\">Products >\r\n");
      out.write("                                    ");
      out.print( category );
      out.write(" \r\n");
      out.write("                                    ");
      out.print( subcategory );
      out.write("\r\n");
      out.write("                                </h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                                \r\n");
      out.write("                    <div class=\"grid_12 productListing\">\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                        ");

                            if (session.getAttribute("cat") != null){
                                category = (String)session.getAttribute("cat");
                        
                                
      out.write("\r\n");
      out.write("                                    <div class=\"grid_4 \">\r\n");
      out.write("                                        <a id=\"greenBtn\" href=\"removeProductFilter.jsp?cat=");
      out.print( category );
      out.write("\">Category : ");
      out.print( category );
      out.write(" [x]</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                ");

                                
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");

                                        if (session.getAttribute("scat") != null){
                                            subcategory = (String)session.getAttribute("scat");
                                            sql.append(" AND  sub_category_name =  '"+ subcategory +"' ");
                                            
      out.write("\r\n");
      out.write("                                                <div class=\"grid_4 \">\r\n");
      out.write("                                                    <a id=\"greenBtn\" href=\"removeProductFilter.jsp?scat=");
      out.print( subcategory );
      out.write("\">Sub-Category : ");
      out.print( subcategory );
      out.write(" [x]</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            ");

                                        }
                                    
      out.write("\r\n");
      out.write("                                ");

                            }
                        
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        ");

                            //String sql = "SELECT * FROM  `products` p "
                             //           + "INNER JOIN  `images` i "
                             //           + "USING (  `product-name` ) 
                             //             +`product_qty` > 0
                              //          + "GROUP BY  `product-name` ";

                        DB_Conn con = new DB_Conn();
                        Connection c = con.getConnection();
                        Statement st = c.createStatement();
                        ResultSet rs ;
                         if (sql.toString().equalsIgnoreCase("SELECT * FROM  products p "
                                                            + "INNER JOIN  images i "
                                                            + "ON (  p.product_id=i.product_id  ) "
                                                            )){
                            
                            String newSQL  = "SELECT * FROM products p, images i WHERE p.product_qty > 0 and p.product_id=i.product_id ORDER BY  hits DESC";
                                        //  +" GROUP BY  product-name "
                                       //  + " ORDER BY  hits DESC  ";
                            //out.print("Equals "+sql.toString() +" "+newSQL);
                         rs= st.executeQuery(newSQL);
                         }else { 
                            
                        sql.append(" AND p.product_qty > 0  "
                              //  + " GROUP BY  p.product_name "
                                + " ORDER BY  hits DESC  ");
                            //out.print("Not Equals "+sql.toString());
                            rs= st.executeQuery(sql.toString());                        
                         }
                        

                                while (rs.next()) {
                                    /*
product-name	product_id	sub-category-name	category-name	company-name	price	summary	image-id	image-name*/
                                    String product_id = rs.getString("product_id");

                                    String product_name = rs.getString("product_name");

                                    String sub_category_name = rs.getString("sub_category_name");

                                    String category_name = rs.getString("category_name");

                                    String company_name = rs.getString("company_name");

                                    String price = rs.getString("price");

                                    String summary = rs.getString("summary");
                                    
                                    String image_name = rs.getString("image_name");
/*
                                    out.println("<br/>"+product_id+
                                            "<br/>"+product_name+
                                            "<br/>"+sub_category_name+
                                            "<br/>"+category_name+
                                            "<br/>"+company_name+
                                            "<br/>"+price+
                                            "<br/>"+summary+
                                            "<br/>"+image_name);
                                    */
                        
      out.write("\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                        <div class=\"grid_2\">\r\n");
      out.write("                            <a href=\"product.jsp?id=");
      out.print(product_id);
      out.write("\"><img src=\"");
      out.print( image_name );
      out.write("\" /></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"grid_9\">\r\n");
      out.write("                            <div class=\"grid_5\">\r\n");
      out.write("                                <p id=\"info\"><a href=\"product.jsp?id=");
      out.print(product_id);
      out.write("\"><h3><span class=\"blue\"> ");
      out.print(product_name );
      out.write("</span></h3></a>By ");
      out.print( company_name+" "+ category_name );
      out.write("<br/><span class=\"red\">Rs. ");
      out.print( price );
      out.write("</span></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"grid_3 push_2\">\r\n");
      out.write("                                <p>");
      out.print(sub_category_name );
      out.write("  <a href=\"addToCart.jsp?id=");
      out.print( product_id );
      out.write("\" id=\"greenBtn\">Add to cart</a></p><p>Will Be delivered in 3 Working days</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                        ");

                                }
                            rs.close();
                            st.close();
                            c.close();
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/mainHeaders/topMostViewedProducts_4.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--The Middle Content Div Closing -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--The Center Content Div Closing -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
