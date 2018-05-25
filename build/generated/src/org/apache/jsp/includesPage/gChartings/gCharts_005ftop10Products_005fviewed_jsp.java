package org.apache.jsp.includesPage.gChartings;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import database.DB_Conn;
import java.sql.Connection;

public final class gCharts_005ftop10Products_005fviewed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
/*SELECT COUNT(  `product_name` *  `product_quantity` ) AS solds,  `product_name` 
FROM  `sales` 
GROUP BY  `product_name` 
ORDER BY solds DESC */
                String top10products = "SELECT  product_name ,  hits "
                                +" FROM  products "
                                +" ORDER BY  hits DESC ";
                                /*+" LIMIT 0 , 10 ;";*/

                    Connection c = new DB_Conn().getConnection();
                    Statement st = c.createStatement();
                    
                    ArrayList<String> product = new ArrayList<String> ();
                    ArrayList<Integer> hits = new ArrayList<Integer> ();
                    product.clear();
                    hits.clear();
                    
                    ResultSet rs = st.executeQuery(top10products);
                    while (rs.next()){
                        product.add(rs.getString("product_name"));
                        hits.add(rs.getInt("hits"));
                    }
                
      out.write("\n");
      out.write("                \n");
      out.write("            <!--Loading the AJAX API-->\n");
      out.write("                <script type=\"text/javascript\" src=\"js/gclibrary/jsapi.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"js/gclibrary/core.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"js/gclibrary/core1.js\"></script>\n");
      out.write("                    \n");
      out.write("            <div class=\"grid_16\"  style=\"padding: 10px 0px 10px 0px;\" id=\"whiteBox\">\n");
      out.write("                <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                            google.setOnLoadCallback(drawChart);\n");
      out.write("                    ");
      out.write("\n");
      out.write("                                    \n");
      out.write("                            function drawChart() {\n");
      out.write("                              var data = google.visualization.arrayToDataTable\n");
      out.write("                              ");
      out.write("\n");
      out.write("                  ");
 out.print("([ "
                                          + "['Product Name', 'Number of Hits' ], ");
                                int i = 0 ;
                                 while (i<= hits.size()-1){
                                      if (i< hits.size()-1){
                                         out.println(
                                                 "['"+product.get(i)+" ',  "
                                                 +hits.get(i)+"  ],");
                                      }
                                      else {
                                         out.println(
                                                 "['"+product.get(i)+"',  "
                                                 +hits.get(i)+"  ] ");
                                      }
                                      i++;
                                  }
                                out.print("]);");
                      
      out.write("\n");
      out.write("                      var options = {\n");
      out.write("                                title: 'Top 10 products viewed currently',\n");
      out.write("                                  vAxis: {title: \"No of hits in counts\"},\n");
      out.write("                                  hAxis: {title: \"Product Names\"}\n");
      out.write("                              };\n");
      out.write("\n");
      out.write("                              var chart = new google.visualization.LineChart(document.getElementById('chart_div_lineTop10'));\n");
      out.write("                              chart.draw(data, options);\n");
      out.write("                            }\n");
      out.write("              \n");
      out.write("                </script>\n");
      out.write("                <div id=\"chart_div_lineTop10\" style=\"width: 900px; height: 300px;\"></div>\n");
      out.write("                \n");
      out.write("            </div> \n");
      out.write("      \n");
      out.write("                 \n");
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
