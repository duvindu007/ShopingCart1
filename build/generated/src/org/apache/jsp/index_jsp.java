package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import database.DB_Conn;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>online electronics shopping</title>\n");
      out.write("        <!-- Default Stylesheets -->\n");
      out.write("        <!--%@include file=\"includesPage/_stylesheets.jsp\" %-->\n");
      out.write("       <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/reset.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/text.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/960_16.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Product.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--link rel=\"stylesheet\" href=\"css/slider.css\"  /-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css_old/slider.css\">\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/slider.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" >\n");
      out.write("\n");
      out.write("    // This is the script for the banner slider\n");
      out.write("\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        $('#slider').s3Slider({\n");
      out.write("            timeOut: 7000\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/myScript.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("          \n");
      out.write("        ");

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
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<div id = \"topSearch\">\n");
      out.write("    <div class=\"container_16\">\n");
      out.write("        <div class=\"grid_16\">\n");
      out.write("            <div class=\"grid_9\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input  type=\"text\" id=\"search\" class=\"searchBox\" placeholder=\"Quick search an item ...\" autofocus=\"true\"/>\n");
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
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <div id = \"banner\">\n");
      out.write("        <div class=\"container_16\">\n");
      out.write("            <div class=\"grid_16\" style=\"padding-left: 20px; \" id=\"slider\">\t\n");
      out.write("                <ul id=\"sliderContent\">\t\t\n");
      out.write("                    <!-- Duplicate this code for each image -->\t\t\t\t\n");
      out.write("\n");
      out.write("                    <li class=\"sliderImage\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                        <img src=\"images/banner/b1.png\" width=\"900\" height=\"300\" /> \n");
      out.write("\n");
      out.write("                        <span class=\"top\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                            <strong>Fountain....</strong>\t\n");
      out.write("\n");
      out.write("                            <br>From the International and Indian markets, we have the variety of the High Class fountain \n");
      out.write("\n");
      out.write("                            pens. Available now for you to get your hands on.\n");
      out.write("\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                    </li>  \n");
      out.write("                    <li class=\"sliderImage\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                        <img src=\"images/banner/b2.png\" width=\"900\" height=\"300\" /> \n");
      out.write("\n");
      out.write("                        <span class=\"top\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                            <strong>Books, Diaries...</strong>\t\t\t\t\n");
      out.write("\n");
      out.write("                            <br>Text Books, Single Lines, Double Lines, Red 'n Blue Lines, Fullscape Books\n");
      out.write("\n");
      out.write("                            Drawing Books, and all the paper you want to write all throughout to learn \n");
      out.write("\n");
      out.write("                            Available now at your doorsteps* \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                    </li>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"sliderImage\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                        <img src=\"images/banner/watchimage.jpg\" width=\"900\" height=\"300\" /> \n");
      out.write("\n");
      out.write("                        <span class=\"top\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                            <strong>Watches......</strong>\t\t\t\t\n");
      out.write("\n");
      out.write("                            <br>High qaulity watches now available at our store. Login and add to cart to get it delivered to\n");
      out.write("                            your doorstep!\n");
      out.write("\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                    </li>  \n");
      out.write("\n");
      out.write("                    <li class=\"sliderImage\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                        <img src=\"images/banner/b7.jpg\" width=\"900\" height=\"300\" /> \n");
      out.write("\n");
      out.write("                        <span class=\"top\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                            <strong>Graphic Novels...</strong>\t\t\t\t\n");
      out.write("\n");
      out.write("                            <br>The most amazing titles that you always wanted to get your hands onn.. \n");
      out.write("\n");
      out.write("                            Now you have the opportunity to have them all in your personal library.\n");
      out.write("\n");
      out.write("                            International as well as Indian titles of many authors available\n");
      out.write("\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                    </li>   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"sliderImage\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                        <img src=\"images/banner/b6.png\" width=\"900\" height=\"300\" /> \n");
      out.write("\n");
      out.write("                        <span class=\"top\" style=\"display: none; \">\n");
      out.write("\n");
      out.write("                            <strong>Color World...</strong>\t\t\t\t\n");
      out.write("\n");
      out.write("                            <br>A vast variety of different sets of colors including Oil-Pastels,\n");
      out.write("\n");
      out.write("                            Pencil Colors, Poster Colors, Acrylic Colors and many more...\n");
      out.write("\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                    </li>   \n");
      out.write("\n");
      out.write("                    <div class=\"clear sliderImage\"></div>  \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container_16\">\n");
      out.write("        <div id = \"contents\">\n");
      out.write("            <!-- LeftSide -->\n");
      out.write("\n");
      out.write("\n");

    Connection c = new DB_Conn().getConnection();
    Statement st = c.createStatement();
    String getCategory = "SELECT * FROM  category  ";
    
    ResultSet rs = st.executeQuery(getCategory);
    

      out.write("\n");
      out.write("            <div id=\"leftside\" class=\"grid_3\">\n");
      out.write("                <div>\n");
      out.write("                    <ul id=\"leftsideNav\">\n");
      out.write("                        <li><a href=\"#\"><strong>Categories</strong></a></li>\n");
      out.write("                        \n");
      out.write("                        ");

                        while (rs.next()){
                            String category = rs.getString ("category_name");
                            
      out.write("\n");
      out.write("                            <li><a href=\"viewProducts_.jsp\">");
      out.print( category );
      out.write("</a></li>\n");
      out.write("                        ");

                        }
                        
      out.write("\n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"adv\">\n");
      out.write("                    <h2><br/>This is The Header of an Advertisement</h2>\n");
      out.write("                    <p>We offer Advertisement display here </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Middle -->\n");
      out.write("        <div id=\"middle\"class=\"grid_13\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/mainHeaders/topMostViewedProducts_4.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--The Middle Content Div Closing -->\n");
      out.write("    </div>\n");
      out.write("    <!--The Center Content Div Closing -->\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/_footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
