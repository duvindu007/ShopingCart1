package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.DB_Conn;
import java.sql.*;
import database.*;
import java.util.ArrayList;
import java.util.ArrayList;
import user.user;

public final class productInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/includesPage/_stylesheets.jsp");
    _jspx_dependants.add("/includesPage/_joinNow.jsp");
    _jspx_dependants.add("/includesPage/_logout.jsp");
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");

    DB_Conn conn = new DB_Conn();
    Connection con = conn.getConnection();
    Statement st = con.createStatement();
    String sql_getCategory = "SELECT  category_name FROM  category;";
    String sql_getSubCategory = "SELECT  sub_category_name FROM  sub_category;";
    String sql_getCompany = "SELECT  company_name FROM  product_company;";
    String sql_getprice = "select price from products";
    String sql_getsummary= "select summary from products";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>Online</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/reset.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/text.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/960_16.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Product.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\r\n");
      out.write("        ");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/text.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/960_16.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">");
      out.write("\r\n");
      out.write("        <!--\r\n");
      out.write("                <link rel=\"stylesheet\" type=\"text/css\" href=\"css/forms/button.css\"/>\r\n");
      out.write("        -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"  />\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Product.css\"  />\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("        <script src=\"js/lightbox.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/myScript.js\"/></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/product.js\"/></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    ");

        if (session.getAttribute("email") == null) {
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("<script type =\"text/javascript\" src=\"js/headerJoinScript.js\"></script>\n");
      out.write("<div id = \"topWrapper\">\n");
      out.write("    <div class=\"container_16\">\n");
      out.write("        <div class=\"grid_16\">\n");
      out.write("            <div id=\"logo\" class=\"grid_6\"> <a href=\"index.jsp\"><img src=\"images/logo/icon.png\" /></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"grid_6\" id=\"top\">\n");
      out.write("                <ul>\n");
      out.write("                    <a href=\"#\" id=\"join\"><li id=\"greenBtn\"  class =\"Btn showForm\">Join Now!!</li></a>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id = \"topLogin\">\n");
      out.write("    <div class=\"container_16\">\n");
      out.write("        <div id=\"LoginBox\" class=\"grid_16\">\n");
      out.write("\n");
      out.write("            <div class=\"grid_6\" id = \"loginForm\">\n");
      out.write("                <form autocomplete=\"false\" method=\"post\" action=\"loginServlet\"  name=\"login\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <strong><h1 style=\"font-wieght:bold; text-align:left; padding:20px 0px; color:#FFF;\">Login...</h1></strong>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Email</label>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <label><input type=\"email\" name=\"email\" placeholder=\"john_lee@xyz.com\" required/><br/></label>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Password</label>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"password\" name=\"pass\" placeholder=\"&bull;&bull;&bull;&bull;&bull;&bull;&bull;\" required/><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr><tr>\n");
      out.write("                            <td>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"submit\" value=\"Login!!\" id=\"greenBtn\" /><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"grid_6 push_2\" id = \"RegisterForm\">\n");
      out.write("                <form autocomplete=\"false\" method=\"POST\" action=\"register\" name=\"registerServlet\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <strong><h1 style=\"font-wieght:bold; text-align:right; padding:20px 0px; color:#FFF;\">Register Now!!</h1></strong>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Email</label>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <label><input type=\"email\" name=\"emailReg\" placeholder=\"john_lee@xyz.com\" required/><br/></label>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Password</label>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"password\" name=\"passReg\" placeholder=\"&bull;&bull;&bull;&bull;&bull;&bull;&bull;\" required/><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Password Again</label>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"password\" name=\"passAgainReg\" placeholder=\"&bull;&bull;&bull;&bull;&bull;&bull;&bull;\" required/><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <!--\t<tr>\n");
      out.write("                                        <td>\n");
      out.write("                                        <label>Gender</label>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                        <select>\n");
      out.write("                                                <option name=\"gender\" value=\"male\">Male</option>\n");
      out.write("                                                <option name=\"gender\" value=\"female\">Female</option>\n");
      out.write("                                        </select><br/>\n");
      out.write("                                        </td>\n");
      out.write("                                </tr>-->\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"submit\" value=\"Register\" id=\"greenBtn\" /><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("    ");
//@include file="includesPage/_topLogin.jsp" 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
    } else {
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container_16\">\r\n");
      out.write("        <div class=\"grid_16\" id=\"productStrip\">\r\n");
      out.write("            <div class=\"grid_16\">\r\n");
      out.write("                <h1 class=\"bold underlined center\" style=\"font-size:35px; margin:20px auto;\" >Add Product</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"grid_10 push_3\">\r\n");
      out.write("                <form method=\"GET\" action=\"addProduct\">\r\n");
      out.write("                    <div class=\"grid_10\">\r\n");
      out.write("                        <div class=\"grid_9\">\r\n");
      out.write("                            <p style=\"font-size:15px;\">Start entering the product information step by step... Into your database</p>\r\n");
      out.write("                            <table class=\"stepTable\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td colspan=\"2\"><h1>Step 1. Enter Product Company</h1></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                ");
//Retrieves The Data From product-company table
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td><h4>Select a Company</h4> <br/> <h3 class=\"center\">Or</h3><br/></td>\r\n");
      out.write("                                    <td><img src= \"images/icons/dropDown.png\" alt=\"dropDown\"/>\r\n");
      out.write("                                        <select name=\"company\">\r\n");
      out.write("\r\n");
      out.write("                                            ");

                                                ResultSet company = st.executeQuery(sql_getCompany);
                                                while (company.next()) {
                                                    String companyName = company.getString("company_name");
                                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <option name=\"");
      out.print( companyName);
      out.write('"');
      out.write('>');
      out.print( companyName);
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </select><img src= \"images/icons/dropDown.png\" alt=\"dropDown\"/>\r\n");
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td><h4>Add a Company</h4></td>\r\n");
      out.write("                                    <td><input id=\"companyName\" type=\"text\" name= \"companyName\" tabindex=\"1\" placeholder=\"eg. Ubisoft/Electronic Arts\"/></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td><input id=\"addProductNameBtn\" type=\"button\" value=\"I have done writing name\"/>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                            <h4 id=\"step1Feedback\" class=\"grid_8 center\">-------------------------------------------------------------<br/></h4>\r\n");
      out.write("\r\n");
      out.write("                            <h4 id=\"step2Feedback\" class=\"grid_8 center\">-------------------------------------------------------------<br/></h4>\r\n");
      out.write("\r\n");
      out.write("                            <table class=\"stepTable\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td colspan=\"2\"><h1>Step 2. Enter Category</h1></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                ");
//Retrieves The Data From category table
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td><h4>Select a Category</h4> <br/> \r\n");
      out.write("                                        <h3 class=\"center\">Or</h3><br/></td>\r\n");
      out.write("                                <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("                                <script type=\"text/javascript\">\r\n");
      out.write("                                    $(document).ready (function (){\r\n");
      out.write("                                        $('#selectMenuCategory').click(function (){\r\n");
      out.write("                                            var category = $(this).attr('value');\r\n");
      out.write("                                            //alert (\"Aargh \" +getCategory);\r\n");
      out.write("                                            $.get('getProductSubCategory', \r\n");
      out.write("                                            { category: category}, \r\n");
      out.write("                                            function (data){\r\n");
      out.write("                                                $('#selectMenuSubCategory').html(data);\r\n");
      out.write("                                            });\r\n");
      out.write("                                        });\r\n");
      out.write("                                    });\r\n");
      out.write("                                </script>\r\n");
      out.write("\r\n");
      out.write("                                <td><img src= \"images/icons/dropDown.png\" alt=\"dropDown\"/>\r\n");
      out.write("                                    <select id=\"selectMenuCategory\" name=\"category\">\r\n");
      out.write("                                        \r\n");
      out.write("                                        ");
 
                                            ResultSet rs = st.executeQuery(sql_getCategory);
                                            while (rs.next()) {
                                                String category = rs.getString("category_name");
                                        
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print( category);
      out.write('"');
      out.write('>');
      out.print( category);
      out.write("</option>\r\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\r\n");
      out.write("                                    </select><img src= \"images/icons/dropDown.png\" alt=\"dropDown\"/></td>\r\n");
      out.write("\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td><h4>Add Category</h4></td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <input id=\"categoryName\" type=\"text\" name= \"categoryName\" tabindex=\"1\" placeholder=\"eg. Games, Movies, Books\"/><br/></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr  class=\"needHRule\">\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td><input id=\"addCategoryNameBtn\" type=\"button\" value=\"Add Category\"/>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");
//Retrieves The Data From Sub-category table
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td><h4>Select a Sub-Category</h4> <br/> <h3 class=\"center\">Or</h3><br/></td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <img src= \"images/icons/dropDown.png\" alt=\"dropDown\"/>\r\n");
      out.write("                                        <select id=\"selectMenuSubCategory\" name=\"subCategory\">\r\n");
      out.write("\r\n");
      out.write("                                            ");


                                                ResultSet subCategory = st.executeQuery(sql_getSubCategory);

                                                while (subCategory.next()) {
                                                    String subCat = subCategory.getString("sub_category_name");
                                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print( subCat);
      out.write('"');
      out.write('>');
      out.print( subCat);
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                                            ");

                                                }
                                                st.close();

                                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </select><img src= \"images/icons/dropDown.png\" alt=\"dropDown\"/>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td><h4>Add Sub-Category</h4></td>\r\n");
      out.write("                                    <td><input id=\"SubCategoryName\" type=\"text\" name= \"SubCategoryName\" tabindex=\"1\" placeholder=\"Action, Adventure, Drama, etc\"/><br/></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td><input id=\"addSubCategoryBtn\" type=\"button\" value=\"Add Sub-Category\"/>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <!--\t<div id=\"productStockDetail\">\r\n");
      out.write("                                        <h4>Product In Stock</h4>\r\n");
      out.write("                                        <h5>Will be delivered in 5 days</h5>\r\n");
      out.write("                                </div>-->\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                        <h1>Step 3. Enter Pricing information</h1>\r\n");
      out.write("                        \r\n");
      out.write("                            \r\n");
      out.write("                         ");


                                                ResultSet price = st.executeQuery(sql_getprice);

                                                while (price.next()) {
                                                    String productprice = price.getString("price");
                                          
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <input type=\"text\" value=\"");
      out.print(productprice);
      out.write("\" name= \"price1\" tabindex=\"1\" placeholder=\"eg.Rs 7899/-\"/><br/>\r\n");
      out.write("\r\n");
      out.write("                                            ");

                                                }
                                                st.close();

                                            
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <h1>Step 4. Enter in Product Name &AMP; Quantity</h1>\r\n");
      out.write("                        <input id=\"productName\" type=\"text\" name= \"productName\"  placeholder=\"Product Name\"/><br/>\r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <input id=\"productQty\" type=\"text\" name= \"productQty\"  placeholder=\"Quantity\"/><br/>\r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <h1>Step 5. Enter in Tags and Description</h1>\r\n");
      out.write("                        <input id=\"tags\" type=\"text\" name= \"tags\" placeholder=\"Write in tags here without commas\"/><br/>\r\n");
      out.write("                        <br/>  \r\n");
      out.write("                        <h1>Summary / Description Of the Product</h1>\r\n");
      out.write("                        <textarea name=\"summary\" class=\"grid_9\" rows=\"17\"></textarea>\r\n");
      out.write("\r\n");
      out.write("                        <input id=\"greenBtn\" type=\"submit\" value =\"I have Done Adding the Product Info.\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("                <br/>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container_16\">\r\n");
      out.write("    <div class=\"grid_16\" id=\"productStrip\"> <a href=\"http:google.com\">\r\n");
      out.write("            <div class=\"ProductHeading\">\r\n");
      out.write("                <div class=\"grid_12\">\r\n");
      out.write("                    <h2 class=\"heading\">Top Most Viewed Products Currently</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"viewMore\" class=\"grid_3\">\r\n");
      out.write("                    <h6 class=\"blue\">View More</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"productList\" class=\"grid_3\"> \r\n");
      out.write("            <a href=\"http:www.google.com\"><img src=\"images/crap%20imgs/bg-linen.jpg\" /></a>\r\n");
      out.write("            <p id=\"info\">\r\n");
      out.write("                <a href=\"http:www.google.com\"><span class=\"blue\">Book blue Longest one to test that does it works??</span></a><br/>\r\n");
      out.write("                By Author Name<br/>\r\n");
      out.write("                <span class=\"red\">Rs. 1000</span>\r\n");
      out.write("            <p>            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"productList\" class=\"grid_3\"> <a href=\"http:www.google.com\"><img src=\"images/crap%20imgs/bg-linen.jpg\" /></a>\r\n");
      out.write("            <p id=\"info\"><a href=\"http:www.google.com\"><span class=\"blue\">Book blue Longest one to test that does it works??</span></a><br/>\r\n");
      out.write("                By Author Name<br/>\r\n");
      out.write("                <span class=\"red\">Rs. 1000</span>\r\n");
      out.write("            <p>            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"productList\" class=\"grid_3\"> <a href=\"http:www.google.com\"><img src=\"images/crap%20imgs/bg-linen.jpg\" /></a>\r\n");
      out.write("            <p id=\"info\"><a href=\"http:www.google.com\"><span class=\"blue\">Book blue Longest one to test that does it works??</span></a><br/>\r\n");
      out.write("                By Author Name<br/>\r\n");
      out.write("                <span class=\"red\">Rs. 1000</span>\r\n");
      out.write("            <p>            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"productList\" class=\"grid_3\"> <a href=\"http:www.google.com\"><img src=\"images/crap%20imgs/bg-linen.jpg\" /></a>\r\n");
      out.write("            <p id=\"info\"><a href=\"http:www.google.com\"><span class=\"blue\">Book blue Longest one to test that does it works??</span></a><br/>\r\n");
      out.write("                By Author Name<br/>\r\n");
      out.write("                <span class=\"red\">Rs. 1000</span>\r\n");
      out.write("            <p>            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"productList\" class=\"grid_3\"> <a href=\"http:www.google.com\"><img src=\"images/crap%20imgs/bg-linen.jpg\" /></a>\r\n");
      out.write("            <p id=\"info\"><a href=\"http:www.google.com\"><span class=\"blue\">Book blue Longest one to test that does it works??</span></a><br/>\r\n");
      out.write("                By Author Name<br/>\r\n");
      out.write("                <span class=\"red\">Rs. 1000</span>\r\n");
      out.write("            <p>            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id = \"footer\">\r\n");
      out.write("    <div class=\"container_16\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"grid_16\" >\r\n");
      out.write("            <div class=\"grid_3\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><strong>Help</strong></li>\r\n");
      out.write("                    <li><a href=\"faq.html\">Payments</a></li>\r\n");
      out.write("                    <li><a href=\"faq.html\">Shipping</a></li>\r\n");
      out.write("                    <li><a href=\"faq.html\">Cancellation &amp; Returns</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"grid_3\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><strong>Online</strong></li>\r\n");
      out.write("                    <li><a href=\"contact.html\">Contact Us</a></li>\r\n");
      out.write("                    <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("                    <li><a href=\"faq.html\">Careers</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"grid_3\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><strong>Misc</strong></li>\r\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"faq.html\">Affiliate</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.facebook.html\">Facebook</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"grid_5\">\r\n");
      out.write("                <br/><h2>Safe and Secure Shopping</h2><p>\r\n");
      out.write("                    All major credit and debit cards are accepted. We also accept payments by Internet Banking, Cash on Delivery and Equated Monthly Installments(EMI).</p>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"clear\"/>\r\n");
      out.write("        <div class=\"grid_16\">\t\r\n");
      out.write("            <p>Copyrights &copy; 2017 online BookStores - The online library</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
