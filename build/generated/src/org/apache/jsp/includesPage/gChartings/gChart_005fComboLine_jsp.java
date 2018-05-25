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

public final class gChart_005fComboLine_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style type=\"text/css\">\n");
      out.write("            #buy {\n");
      out.write("                border-radius: 17px;\n");
      out.write("            }\n");
      out.write("            #buy:hover {\n");
      out.write("                border-radius: 17px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <div class=\"container_16\">\n");
      out.write("            <div class=\"grid_16\" style=\"padding: 10px;\" id=\"whiteBox\">\n");
      out.write("                <br/>\n");
      out.write("                <h1 class=\"grid_15\" style=\"text-align: center;\">Monthly Activity Graph - Expenses, Sales, Profits  </h1><hr/>\n");
      out.write("                <div class=\"grid_10 push_3\"><form>\n");
      out.write("                     Select Month\n");
      out.write("                     \n");
      out.write("                <select name=\"month\" class=\"graphLoad\" id=\"month\">\n");
      out.write("                    <option value=\"12\">December</option>\n");
      out.write("                    <option value=\"11\">November</option>\n");
      out.write("                    <option value=\"10\">October</option>\n");
      out.write("                    <option value=\"09\">September</option>\n");
      out.write("                    <option value=\"08\">August</option>\n");
      out.write("                    <option value=\"07\">July</option>\n");
      out.write("                    <option value=\"06\">June</option>\n");
      out.write("                    <option value=\"05\">May</option>\n");
      out.write("                    <option value=\"04\">April</option>\n");
      out.write("                    <option value=\"03\">March</option>\n");
      out.write("                    <option value=\"02\">February</option>\n");
      out.write("                    <option value=\"01\">January</option>\n");
      out.write("                </select>\n");
      out.write("                Select Year\n");
      out.write("                <select name=\"year\" class=\"graphLoad\" id=\"year\">\n");
      out.write("                    ");

                        for (int i =12 ;i<35;i++){
                            
      out.write("\n");
      out.write("                            <option value=\"20");
      out.print(i);
      out.write("\">20");
      out.print(i);
      out.write("</option>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </select><br/>\n");
      out.write("                <div class=\"grid_7\">\n");
      out.write("                    <input class=\"grid_4\" type=\"submit\" id=\"buy\" value=\"Refresh\">\n");
      out.write("                </div>\n");
      out.write("                </form></div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <div id=\"loadLineChart\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");

                Date date = new Date();
                date.getMonth();
                String status;
                int month, year;
                year = 2013;
                month = (date.getMonth()+1);
                String monthInWords = "";
                //out.print(""+month+" "+year);
                if (request.getParameter ("status")!= null || request.getParameter("month") != null ||request.getParameter("year") != null){
                    try{
                        status = request.getParameter("status");
                        month = Integer.parseInt(request.getParameter("month"));
                        year = Integer.parseInt(request.getParameter("year"));
                    } catch (NumberFormatException e){
                        //response.sendRedirect("/MyCartApplication/");
                        out.print(""+e);
                    }
                };
                
                /*
# ITEMS iSSUED BY DAY  ------------SQL1 
#---> SOLD BUT STATUS = PENDING
SELECT DAY(  `ordered_On` ) AS pendingOrderDate, SUM(  `total_order_price` ) AS pricePending
FROM  `order` 
WHERE (
 `ordered_On` LIKE  '2012-11%'
)
AND (
 `status` =  'pending'
)
GROUP BY DATE(  `ordered_On` ) 
#-------------------------------------------
# ITEMS approved BY DAY --------------SQL2
#---> SOLD BUT STATUS = approved
SELECT DAY(  `ordered_On` ) AS approvedOrderDate, SUM(  `total_order_price` ) AS priceApproved
FROM  `order` 
WHERE (
 `ordered_On` LIKE  '2012-11%'
)
AND (
 `status` =  'approved'
)
GROUP BY DATE(  `ordered_On` ) 
#------------------------------------
 # ITEMS sold BY DAY 
#---> SOLD BUT STATUS = delivered
SELECT DAY(  `ordered_On` ) AS deliveredOrderDate, SUM(  `total_order_price` ) AS priceDelivered
FROM  `order` 
WHERE (
 `ordered_On` LIKE  '2012-11%'
)
AND (
 `status` =  'delivered'
)
GROUP BY DATE(  `ordered_On` ) 
#---------------------------------------
#EXPENSES 
SELECT DAY(  `purchase_date` ) AS purchaseDate, SUM(  `price` ) AS expense
FROM  `expenses` 
WHERE  `purchase_date` LIKE  '2012-1%'
 
 
 
 * 
 *   */
                
                String sqlPendingOrders = "SELECT DAY(  ordered_On ) AS OrderDate, SUM(  total_order_price ) AS price "
                                     +" FROM  orders "
                                    +" WHERE ("
                                    +" ordered_On LIKE  '"+year+"%'"
                                    +" ) "
                                    +" AND "
                                    + "("
                                    +" MONTH(ordered_On) ='"+month+"'"
                                    +" ) "
                                    +" AND ("
                                    +" status1 =  'pending'"
                                    +" )"
                                   +" GROUP BY DAY(  ordered_On )";
                    
                String sqlApprovedOrders= "SELECT DAY(  ordered_On ) AS OrderDate, SUM(  total_order_price ) AS price "
                                     +" FROM  orders "
                                    +" WHERE ("
                                    +" ordered_On LIKE  '"+year+"%'"
                                    +" ) "
                                    +" AND "
                                    + "("
                                    +" MONTH(ordered_On) = '"+month+"'"
                                    +" ) "
                                    +" AND ("
                                    +" status1 =  'approved'"
                                    +" )"
                                   +" GROUP BY DAY(  ordered_On )";
                
                String sqlDelivredOrders= "SELECT DAY(  ordered_On ) AS OrderDate, SUM(  total_order_price ) AS price "
                                     +" FROM  orders "
                                    +" WHERE ("
                                    +" ordered_On LIKE  '"+year+"%'"
                                    +" ) "
                                    +" AND "
                                    + "("
                                    +" MONTH(ordered_On) ='"+month+"'"
                                    +" ) "
                                    +" AND ("
                                    +" status1 =  'delivered'"
                                    +" )"
                                   +" GROUP BY DAY(  ordered_On )";
                
                String sqlExpenses = "SELECT "
                            + " DAY(  purchase_date ) AS purchaseDate, SUM(  price ) AS expense "
                           +" FROM  expenses "
                           +" WHERE  (purchase_date LIKE  '"+year+"%') "
                            + " AND ( MONTH(purchase_date) = '"+month+"') "
                            + " GROUP BY  DAY(purchase_date) ";

                    Connection c = new DB_Conn().getConnection();
                    Statement st = c.createStatement();
                    
                    ArrayList<Integer> soldOnPendingTemp = new ArrayList<Integer> ();
                    ArrayList<Integer> pricePendingTemp = new ArrayList<Integer> ();
                    soldOnPendingTemp.clear();
                    pricePendingTemp.clear();
                    
                    ArrayList<Integer> soldOnApprovedTemp = new ArrayList<Integer> ();
                    ArrayList<Integer> priceApprTemp = new ArrayList<Integer> ();
                    soldOnApprovedTemp.clear();
                    priceApprTemp.clear();
                    
                    ArrayList<Integer> soldOnDelTemp = new ArrayList<Integer> ();
                    ArrayList<Integer> priceDeliTemp = new ArrayList<Integer> ();
                    soldOnDelTemp.clear();
                    priceDeliTemp.clear();
                    
                    ArrayList<Integer> BoughtOn = new ArrayList<Integer> ();
                    ArrayList<Integer> expenseTemp = new ArrayList<Integer> ();
                    BoughtOn.clear();
                    expenseTemp.clear();
                    
                    
                    
                    ArrayList<Integer> soldOn = new ArrayList<Integer> ();
                    ArrayList<Integer> pricePending = new ArrayList<Integer> ();
                    ArrayList<Integer> priceApproved = new ArrayList<Integer> ();
                    ArrayList<Integer> priceDelivered = new ArrayList<Integer> ();
                    ArrayList<Integer> priceExpense = new ArrayList<Integer> ();
                    
                    soldOn.clear();
                    pricePending.clear();
                    priceApproved.clear();
                    priceDelivered.clear();
                    priceExpense.clear();
                    
                    
                    ResultSet rs = st.executeQuery(sqlPendingOrders);
                    while (rs.next()){
                        soldOnPendingTemp.add(rs.getInt("OrderDate"));
                        pricePendingTemp.add(rs.getInt("price"));
                    }
                    
                    ResultSet rs1 = st.executeQuery(sqlApprovedOrders);
                    while (rs1.next()){
                        soldOnApprovedTemp.add(rs1.getInt("OrderDate"));
                        priceApprTemp.add(rs1.getInt("price"));
                    }
                    
                    ResultSet rs2 = st.executeQuery(sqlDelivredOrders);
                    
                    while (rs2.next()){
                        soldOnDelTemp.add(rs2.getInt("OrderDate"));
                        priceDeliTemp.add(rs2.getInt("price"));
                    }
                    
                    ResultSet rs3 = st.executeQuery(sqlExpenses);
                    
                    while (rs3.next()){
                        BoughtOn.add(rs3.getInt("purchaseDate"));
                        expenseTemp.add(rs3.getInt("expense"));
                    }
                     
                    for (int i= 0; i<= 31; i++){
                       soldOn.add(i);
                       pricePending.add(0);
                       priceApproved.add(0);
                       priceDelivered.add(0);
                       priceExpense.add(0);
                       for (int j=0; j<soldOnPendingTemp.size() ; j++){
                        if (soldOnPendingTemp.get(j) == i){
                                soldOn.set(i, soldOnPendingTemp.get(j));
                                pricePending.set(i, pricePendingTemp.get(j));
                        } 
                       }
                       for (int j=0; j<soldOnApprovedTemp.size() ; j++){
                        if (soldOnApprovedTemp.get(j) == i){
                                soldOn.set(i, soldOnApprovedTemp.get(j));
                                priceApproved.set(i, priceApprTemp.get(j));
                        } 
                       }
                       for (int j=0; j<soldOnDelTemp.size() ; j++){
                        if (soldOnDelTemp.get(j) == i){
                                soldOn.set(i, soldOnDelTemp.get(j));
                                priceDelivered.set(i, priceDeliTemp.get(j));
                        } 
                       }
                       for (int j=0; j<BoughtOn.size() ; j++){
                        if (BoughtOn.get(j) == i){
                                soldOn.set(i, BoughtOn.get(j));
                                priceExpense.set(i, expenseTemp.get(j));
                        } 
                       }
                    }
                    
                    /*
                    for (int i= 0; i< soldOn.size(); i++){
                        out.println("<br/>Sold On :"+soldOn.get(i));
                        out.println("Pending:           "+pricePending.get(i));
                        out.println("Approoved          "+priceApproved.get(i));
                        out.println("Delivered:         "+priceDelivered.get(i));
                        out.println("Expense :          "+priceExpense.get(i));
                    }
                    out.println("<br/><br/><br/>");
                        
                    for (int i= 0; i< soldOnPendingTemp.size(); i++){
                        out.println("<br/>Sold On :"+soldOnPendingTemp.get(i));
                        out.println("Priced On :"+soldOnPendingTemp.get(i));
                    }*/
                
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


                        if (month == 1){
                            monthInWords = "January";
                        }
                        if (month == 2){
                            monthInWords = "February";
                        }
                        if (month == 3){
                            monthInWords = "March";
                        }
                        if (month == 4){
                            monthInWords = "April";
                        }
                        if (month == 5){
                            monthInWords = "May";
                        }
                        if (month == 6){
                            monthInWords = "Jume";
                        }
                        if (month == 7){
                            monthInWords = "July";
                        }
                        if (month == 8){
                            monthInWords = "August";
                        }
                        if (month == 9){
                            monthInWords = "September";
                        }
                        if (month == 10){
                            monthInWords = "October";
                        }
                        if (month == 11){
                            monthInWords = "November";
                        }
                        if (month == 12){
                            monthInWords = "December";
                        }
                                out.print("([ "
                                          + "['Day', 'Pending', 'Approved', 'Delivered', 'Expense' ], ");
                                int i = 0 ;
                                 while (i<= soldOn.size()-1){
                                      if (i< soldOn.size()-1){
                                         out.println(
                                                 "['Day "+soldOn.get(i) +"',  "
                                                 +pricePending.get(i) +", "
                                                 +priceApproved.get(i)+ ", "
                                                 +priceDelivered.get(i)+", "
                                                 +priceExpense.get(i)+"  ],");
                                      }
                                      else {
                                         out.println(
                                                 "['Day "+soldOn.get(i) +"',  "
                                                 +pricePending.get(i) +", "
                                                 +priceApproved.get(i)+ ", "
                                                 +priceDelivered.get(i)+", "
                                                 +priceExpense.get(i)+" ] ");
                                      }
                                      i++;
                                  }
                                out.print("]);");
                      
      out.write("\n");
      out.write("                      var options = {\n");
      out.write("                                title: 'Report in the Month of ");
      out.print( monthInWords +" "+year );
      out.write("',\n");
      out.write("                                  vAxis: {title: \"Items Sold in Rs.\"},\n");
      out.write("                                  hAxis: {title: \"Days of ");
      out.print( monthInWords );
      out.write("\"}\n");
      out.write("                              };\n");
      out.write("\n");
      out.write("                              var chart = new google.visualization.LineChart(document.getElementById('chart_div_lineCombo'));\n");
      out.write("                              chart.draw(data, options);\n");
      out.write("                            }\n");
      out.write("              \n");
      out.write("                </script>\n");
      out.write("                <div id=\"chart_div_lineCombo\" style=\"width: 900px; height: 300px;\"></div>\n");
      out.write("            </div> \n");
      out.write("      \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
