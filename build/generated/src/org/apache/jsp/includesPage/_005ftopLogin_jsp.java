package org.apache.jsp.includesPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _005ftopLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    \n");
      out.write("<div id = \"topLogin\">\n");
      out.write("    <div class=\"container_16\">\n");
      out.write("        <div id=\"LoginBox\" class=\"grid_16\">\n");
      out.write("\n");
      out.write("            <div class=\"grid_6\" id = \"loginForm\">\n");
      out.write("                <form method=\"POST\" action=\"login\"  name=\"loginForm\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <strong><h1 style=\"font-wieght:bold; text-align:left; padding:20px 0px; color:#FFF;\">Login...</h1></strong>\n");
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
      out.write("                                <label><input type=\"text\" name=\"email\" placeholder=\"sivakanth@gmail.com\" /><br/></label>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Password</label>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"password\" name=\"pass\" placeholder=\"&bull;&bull;&bull;&bull;&bull;&bull;&bull;\" /><br/>\n");
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
      out.write("            <div class=\"grid_6 push_3\" id = \"RegisterForm\">\n");
      out.write("                <form method=\"POST\" action=\"register\" name=\"registerForm\">\n");
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
      out.write("                                <label><input type=\"text\" name=\"email\" placeholder=\"ADMIN_lee@xyz.com\" /><br/></label>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Password</label>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"password\" name=\"pass\" placeholder=\"&bull;&bull;&bull;&bull;&bull;&bull;&bull;\" /><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Password Again</label>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"password\" name=\"passAgain\" placeholder=\"&bull;&bull;&bull;&bull;&bull;&bull;&bull;\" /><br/>\n");
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
      out.write("\n");
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
