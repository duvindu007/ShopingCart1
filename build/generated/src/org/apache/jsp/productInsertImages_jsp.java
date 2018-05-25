package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javazoom.upload.*;
import java.util.*;

public final class productInsertImages_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Online</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo/ico.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/reset.css\"/>\n");
      out.write("        <!--link rel=\"stylesheet\" type=\"text/css\" href=\"css/text.css\"/-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/960_16.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Product.css\"  />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/lightbox.css\"  />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css_old/Styles.css\"/>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script src=\"js/lightbox.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("            #targetPrev {\n");
      out.write("                padding:5px;\n");
      out.write("                border:1px solid #CCC;\n");
      out.write("                background:#EEE;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script type = \"text/javascript\">\n");
      out.write("            \n");
      out.write("            function readURL(input) {\n");
      out.write("                if (input.files && input.files[0]) {\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("                    $('#targetPrev').hide();\n");
      out.write("                    reader.onload = function (e) {\n");
      out.write("                        $('#targetPrev')\n");
      out.write("                        .attr('src', e.target.result)\n");
      out.write("                        .width(150);\n");
      out.write("                        $('#targetPrev').fadeIn(3000);\n");
      out.write("                    };\n");
      out.write("                    reader.readAsDataURL(input.files[0]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        ");

            String path = application.getRealPath("uploads");
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      javazoom.upload.UploadBean upBean = null;
      synchronized (_jspx_page_context) {
        upBean = (javazoom.upload.UploadBean) _jspx_page_context.getAttribute("upBean", PageContext.PAGE_SCOPE);
        if (upBean == null){
          upBean = new javazoom.upload.UploadBean();
          _jspx_page_context.setAttribute("upBean", upBean, PageContext.PAGE_SCOPE);
          out.write("\n");
          out.write("            ");
          org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("upBean"), "folderstore",
 path);
          out.write("\n");
          out.write("        ");
        }
      }
      out.write("\n");
      out.write("\n");
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
      out.write("    ");
      out.write("\n");
      out.write("    <div class=\"container_16\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includesPage/hesders_sidebars/admin_menuSideBar.jsp", out, false);
      out.write("\n");
      out.write("          \n");
      out.write("            <div id=\"whiteBox\" class=\"grid_13\">\n");
      out.write("                <div style=\"padding: 10px;\" class=\"grid_13\">\n");
      out.write("                    <h3  align=\"center\">\n");
      out.write("                        ");

                            if ((session.getAttribute("productName") == null)) {
                                // if email session is set, Dont show the message redirect to index
                                //response.sendRedirect("/saikiranBookstoreApp/index.jsp");
                                out.println("There is no product detected to insert an image for it...");
                            }else {
                        
      out.write("\n");
      out.write("                    </h3>        \n");
      out.write("                    <h1>");
 out.print("Start adding Images right now!!<br/>" + session.getAttribute("productName"));
      out.write("</h1>\n");
      out.write("                    <p>\n");
      out.write("                        ");

                            out.print("Product :" + session.getAttribute("productName"));
                        
      out.write("\n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("                    <form method=\"post\" action=\"uploadImage.jsp\" name=\"upform\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                        <img class=\"push_1\" id=\"targetPrev\" alt=\"your image\" />\n");
      out.write("                        <table width=\"60%\" border=\"0\" cellspacing=\"1\" cellpadding=\"1\" align=\"center\" class=\"style1\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"left\"><b>Select a file to upload :</b></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"left\">\n");
      out.write("                                    <input type=\"file\" onchange=\"readURL(this);\"  name=\"uploadfile\" size=\"50\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"left\">\n");
      out.write("                                    <input type=\"hidden\" name=\"todo\" value=\"upload\">\n");
      out.write("                                    <input id=\"greenBtn\" type=\"submit\" name=\"Submit\" value=\"Upload\">\n");
      out.write("                                    <br/>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        ");

                            if (request.getAttribute("fileName") != null) {
                        
      out.write("\n");
      out.write("                        <a href=\"admin_manageProduct.jsp?pid=");
      out.print( (String)session.getAttribute("productId") );
      out.write("\" style=\"float: left;\" id=\"buy\" >Edit Product</a>\n");
      out.write("                        <div class=\"clear\"></div><br/>\n");
      out.write("                        <h1>Result : ");
      out.print( request.getAttribute("result"));
      out.write("<br/></h1>\n");
      out.write("                        File Name : ");
      out.print( request.getAttribute("fileName"));
      out.write("<br/>\n");
      out.write("                        File Type : ");
      out.print( request.getAttribute("fileType"));
      out.write("<br/>\n");
      out.write("                        File Size : ");
      out.print( request.getAttribute("fileSize"));
      out.write("<br/>\n");
      out.write("                        \n");
      out.write("                        ");

                            String result = (String) request.getAttribute("result");
                            if (result.equals("File Uploaded with no errors...")) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        File ");
      out.print( request.getAttribute("fileName"));
      out.write(" was uploaded to ");
      out.print( path);
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                                }
                            }
                          }
                        
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
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
