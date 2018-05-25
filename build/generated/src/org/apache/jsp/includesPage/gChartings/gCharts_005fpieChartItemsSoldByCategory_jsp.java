package org.apache.jsp.includesPage.gChartings;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import database.DB_Conn;
import java.sql.Connection;

public final class gCharts_005fpieChartItemsSoldByCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("        \n");
      out.write("            <!--Loading the AJAX API-->\n");
      out.write("                <script type=\"text/javascript\" src=\"js/gclibrary/jsapi.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"js/gclibrary/core.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"js/gclibrary/core1.js\"></script>\n");
      out.write("                \n");
      out.write("                <div class=\"grid_13\"  style=\"padding: 10px 0px 10px 0px;\" id=\"whiteBox\">\n");
      out.write("\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        \n");
      out.write("                      // Load the Visualization API and the piechart package.\n");
      out.write("                      google.load('visualization', '1.0', {'packages':['corechart']});\n");
      out.write("\n");
      out.write("                      // Set a callback to run when the Google Visualization API is loaded.\n");
      out.write("                      google.setOnLoadCallback(drawChart);\n");
      out.write("\n");
      out.write("                      // Callback that creates and populates a data table,\n");
      out.write("                      // instantiates the pie chart, passes in the data and\n");
      out.write("                      // draws it.\n");
      out.write("                      function drawChart() {\n");
      out.write("                          //// Create the data table.\n");
      out.write("                        var data = new google.visualization.DataTable();\n");
      out.write("                        data.addColumn('string', 'Category');\n");
      out.write("                        data.addColumn('number', 'Sales');\n");
      out.write("                        \n");
                      
    /*String getPie = "SELECT COUNT(  category_name ) AS sales,  category_name "
+"FROM  sales p "
+"INNER JOIN  products i "
+"USING (  product_id ) "
+"GROUP BY  category_name ";
    Connection c = new DB_Conn().getConnection();
    Statement st = c.createStatement();
    ResultSet rs = st.executeQuery(getPie);
    
    ArrayList<Integer> salesArr = new  ArrayList<Integer>();
    salesArr.clear();
    ArrayList<String> categoryArr = new  ArrayList<String>();
    categoryArr.clear();
    //out.print("data.addRows([");
    while (rs.next()){
        String category = rs.getString ("category_name");
        int sales = rs.getInt ("sales");
        categoryArr.add(category);
        salesArr.add(sales);
    }
    //out.print("]);");
    
    int i = 0;
    out.print("data.addRows([");
    while (i <= (categoryArr.size()-1) ){
        if (i <= categoryArr.size()-1){
                   out.println("['"+categoryArr.get(i) +"',  "+salesArr.get(i)+"],");
        }
        else {
                  out.println("['"+categoryArr.get(i) +"',  "+salesArr.get(i)+"]");
       }
       i++;
    }
    out.print("]);");*/

      out.write("\n");
      out.write("                       \n");
      out.write("                        /*\n");
      out.write("                         data.addRows([\n");
      out.write("                          ['Books', 3],\n");
      out.write("                          ['Electronics', 1],\n");
      out.write("                          ['Games', 1],\n");
      out.write("                          ['Computers', 1],\n");
      out.write("                          ['Apprale', 2]\n");
      out.write("                        ]);\n");
      out.write("                         */\n");
      out.write("\n");
      out.write("                        // Set chart options\n");
      out.write("                        var options = {'title':'Items sold by Category',\n");
      out.write("                                       'width':720,\n");
      out.write("                                       'height':320};\n");
      out.write("\n");
      out.write("                        // Instantiate and draw our chart, passing in some options.\n");
      out.write("                        var chart = new google.visualization.PieChart(document.getElementById('chart_div_pie'));\n");
      out.write("                        chart.draw(data, options);\n");
      out.write("                      }\n");
      out.write("                        \n");
      out.write("                    </script>\n");
      out.write("                    <div id=\"chart_div_pie\"></div>                  \n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                   ");
      out.write("  \n");
      out.write("        \n");
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
