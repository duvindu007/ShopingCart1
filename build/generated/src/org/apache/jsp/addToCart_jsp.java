package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import user.user;

public final class addToCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includesPage/_search_navigationbar.jsp");
    _jspx_dependants.add("/includesPage/_facebookJoin.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Online - Cart</title>\n");
      out.write("        <!-- Default Stylesheets -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\n");
      out.write("         <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/reset.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/text.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/960_16.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Product.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\"/-->\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/text.css\"/-->\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/960_16.css\"/-->\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\"/-->\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/product.css\"  /-->\n");
      out.write("          <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/lightbox.css\"  />\n");
      out.write("          \n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/myScript.js\"></script>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #loginBtn {\n");
      out.write("                margin:15px auto;\n");
      out.write("                padding:5px;\n");
      out.write("                color:#000;\n");
      out.write("                text-shadow: 0 1px 0 white;\n");
      out.write("                border-radius:5px;\n");
      out.write("                background: -webkit-linear-gradient(top, #aee800, #8fbe00);\n");
      out.write("                background: -moz-linear-gradient(top, #aee800, #8fbe00);\n");
      out.write("                text-align:center;\n");
      out.write("                box-shadow: 0 1px 4px rgba(0, 0, 0, 0.27);\n");
      out.write("                -webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.27);\n");
      out.write("                -moz-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.27);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #loginBtn:hover {\n");
      out.write("                color:#000;\n");
      out.write("                border-radius:7px;\n");
      out.write("                text-shadow: 0 -1px 0 white;\n");
      out.write("                text-align:center;\n");
      out.write("                background: -webkit-linear-gradient(top, #8fbe00,#aee800);\n");
      out.write("                background: -moz-linear-gradient(top, #8fbe00,#aee800);\n");
      out.write("                box-shadow: 0 1px 4px rgba(0, 0, 0, 0.4);\n");
      out.write("                cursor:pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--jsp:useBean id=\"cart\" scope=\"session\" class=\"cart.cart\"--><!--/jsp:useBean-->\n");
      out.write("         ");
      cart.cart cart = null;
      synchronized (_jspx_page_context) {
        cart = (cart.cart) _jspx_page_context.getAttribute("cart", PageContext.PAGE_SCOPE);
        if (cart == null){
          cart = new cart.cart();
          _jspx_page_context.setAttribute("cart", cart, PageContext.PAGE_SCOPE);
        }
      }
      out.write(" \n");
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
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div id = \"topSearch\">\n");
      out.write("    <div class=\"container_16\">\n");
      out.write("        <div class=\"grid_16\">\n");
      out.write("            <div class=\"grid_9\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"text\" id=\"search\" class=\"searchBox\" placeholder=\"Quick search an item ...\" autofocus=\"true\"/>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"grid_6\" id=\"topNav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                    <li><a href=\"viewProducts_.jsp\">PRODUCTS</a></li>\n");
      out.write("                    <li><a href=\"contact-support.jsp\">CONTACT</a></li>\n");
      out.write("                    <li><a href=\"faq.jsp\">FAQ</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id = \"topThird\">\n");
      out.write("    <div class=\"container_16\">\n");
      out.write("        <div class=\"grid_16\">\n");
      out.write("            <div class=\"grid_9\">\n");
      out.write("               <p><span>Electronics Online Shoping</span> is one of the best places to have your <span>Electronics</span>            for any Items We are the only one to have your <span>thoughts</span> at the right place... For More Information Call Us :+94-0000000</p>\n");
      out.write("           \n");
      out.write("            <!-- <p><span>Mahavir Paints</span> is the one of the most best places in Mira Bhyyandar to find <span>First Class Paints</span></p>\n");
      out.write("            -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"grid_6\" id=\"top\">\n");
      out.write("                <a href=\"http://www.facebook.com\"> <div id=\"greenBtn\" align=\"center\" class =\"Btn\">Join the Community on Facebook!!</div></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");

    if (session.getAttribute("admin") != null){
        
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function (){\n");
      out.write("        //alert (\"fdvgf\");\n");
      out.write("                \n");
      out.write("        $('#search').keyup (function (){\n");
      out.write("            searchbar = $('#search').attr('value');\n");
      out.write("            if (searchbar.length >= 3){\n");
      out.write("                //$('#loadSearches').load('findProductLoad.jsp', {searchbar:searchbar});\n");
      out.write("                            \n");
      out.write("                $('#loadSearches').css('display');\n");
      out.write("                $.get('findProductLoad.jsp', {searchbar:searchbar}, function (data){\n");
      out.write("                    //alert (data);\n");
      out.write("                    if (data.length > 760){\n");
      out.write("                        $('#loadSearches').html(data).slideDown(500);\n");
      out.write("                    }\n");
      out.write("                    else {\n");
      out.write("                        $('#loadSearches').slideUp(500);\n");
      out.write("                        $('#loadSearches').html(\"\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                       \n");
      out.write("            }else {\n");
      out.write("                 $('#loadSearches').slideUp(500);\n");
      out.write("                $('#loadSearches').html(\"\");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("            \n");
      out.write("</script>\n");

    } else {
        
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function (){\n");
      out.write("        //alert (\"fdvgf\");\n");
      out.write("                \n");
      out.write("        $('#search').keyup (function (){\n");
      out.write("            searchbar = $('#search').attr('value');\n");
      out.write("            if (searchbar.length >= 3){\n");
      out.write("                //$('#loadSearches').load('findProductLoad.jsp', {searchbar:searchbar});\n");
      out.write("                            \n");
      out.write("                $('#loadSearches').css('display');\n");
      out.write("                $.get('findProductLoad_1.jsp', {searchbar:searchbar}, function (data){\n");
      out.write("                    //alert (data);\n");
      out.write("                    if (data.length > 760){\n");
      out.write("                        $('#loadSearches').html(data).slideDown(500);\n");
      out.write("                    }\n");
      out.write("                    else {\n");
      out.write("                        $('#loadSearches').slideUp(500);\n");
      out.write("                        $('#loadSearches').html(\"\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                       \n");
      out.write("            }else {\n");
      out.write("                 $('#loadSearches').slideUp(500);\n");
      out.write("                $('#loadSearches').html(\"\");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("            \n");
      out.write("</script>\n");

    }

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container_16\" id=\"loadSearches\" ></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container_16\">\n");
      out.write("            <div class=\"grid_16\" id=\"whiteBox\">\n");
      out.write("                <div class=\"grid_8 push_3\" >\n");
      out.write("                    <h1 class=\"push_2\" style=\"padding:10px 00px\">Products In your Cart</h1>\n");
      out.write("\n");
      out.write("                    ");

                        user User = new user();
                        session.getAttribute("user");
                        //out.println(session.getAttribute("user"));
                        User = (user) session.getAttribute("user");
                        
                        if (session.getAttribute("user") != null) {
                    
      out.write("\n");
      out.write("                    <h3 class=\"showForm\" id=\"loginBtn\" style=\"padding:10px 00px\">Please Login before buying...</h3>\n");
      out.write("\n");
      out.write("                    ");
                } else {
                        //out.println("login by " + User.getUserEmail());

                    
      out.write("\n");
      out.write("                    <h3 class=\"push_2\" >Your Cart contains following...</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        String sid = request.getParameter("id");
                        int id;
                        if (request.getParameter("id") != null) {
                            response.sendRedirect("viewProducts_.jsp");
                        } else {
                            id = Integer.parseInt(sid);

                            boolean b = cart.addProduct(id);

                            if (b == true) {
                                out.println(id + " " + cart.getProductName(id) + " added !! with price of " + cart.getProductPrice(id));
                            } else {
                                out.println("Not added !!");
                            }

                            out.println("<br/>Total value price of the cart " + cart.getTotalPriceOfCart());
                            ArrayList<String> productNames = new ArrayList();
                            ArrayList<Double> productPrices = new ArrayList();
                            ArrayList<Integer> Qty = new ArrayList();
                            ArrayList<Integer> ids = new ArrayList();

                            productNames = cart.getProductNames();
                            productPrices = cart.getPrices();
                            Qty = cart.getQty();
                            ids = cart.getId();
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"CartTable\" style=\"padding:10px 00px\" class=\"grid_11\">\n");
      out.write("                        <div class=\"grid_5\">\n");
      out.write("                            <h2>Name Of Product</h2> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grid_2\">\n");
      out.write("                            <h2>Price</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grid_2\">\n");
      out.write("                            <h2>Quantity</h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");

                            for (int i = 0; i < productNames.size(); i++) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"grid_5\">\n");
      out.write("                            ");
      out.print(productNames.get(i));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grid_2\">\n");
      out.write("                            Rs. ");
      out.print(productPrices.get(i));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grid_1\">\n");
      out.write("                            x");
      out.print(Qty.get(i));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grid_2\">\n");
      out.write("                            Rs. ");
      out.print( Qty.get(i) * productPrices.get(i));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");

                            }
                            productNames.clear();
                            productPrices.clear();

                        
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("\n");
      out.write("                        <div class=\"grid_5\">\n");
      out.write("                            <strong>Total Price of your Cart</strong>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"grid_3 push_3\">\n");
      out.write("                            Rs ");
      out.print( Math.ceil(cart.getTotalPriceOfCart()) );
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <a href=\"buyItems.jsp\">\n");
      out.write("                            <div class=\"grid_3\" id=\"greenBtn\">\n");
      out.write("                                Buy These Items\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"viewProducts_.jsp\">\n");
      out.write("                            <div class=\"grid_3\" id=\"greenBtn\">\n");
      out.write("                                Continue Shopping\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br/>\n");
      out.write("                    <br/>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <br/>\n");
      out.write("                    ");

                            }
                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
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
