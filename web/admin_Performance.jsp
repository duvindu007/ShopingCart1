<%-- 
    Document   : admin_Performance
    Created on : May 24, 2017, 2:19:02 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        
        <jsp:useBean id="product" class="product.product"/> 

        <%@page import="java.sql.*, database.*" %>
        <link rel="shortcut icon" href="images/logo/ico.ico"/>
        <link rel="stylesheet" type="text/css" href="css/reset.css"/>
        <link rel="stylesheet" type="text/css" href="css/text.css"/>
        <link rel="stylesheet" type="text/css" href="css/960_16.css"/>
        <link rel="stylesheet" type="text/css" href="css/product.css"  />

        <link rel="stylesheet" type="text/css" href="css/lightbox.css"  />

        <link rel="stylesheet" type="text/css" href="css/styles.css"/>

<link rel="stylesheet" type="text/css" href="css_old/reset.css"/>
<link rel="stylesheet" type="text/css" href="css_old/text.css"/>
<link rel="stylesheet" type="text/css" href="css_old/960_16.css"/>
<link rel="stylesheet" type="text/css" href="css_old/Product.css" />
<link rel="stylesheet" type="text/css" href="css_old/Styles.css"/>
        <script src="js/jquery-1.7.2.min.js"></script>
        <script src="js/lightbox.js"></script>
        <script src="js/myScript.js"></script>
        
        
        <style type="text/css">
            .adminMenu {
                margin-top: 10px;
                margin-bottom: 10px;
                margin-right: 0px;
                background: #FFF;
                box-shadow: 0px 0px 10px #333;
            }
            .adminMain {
                margin-top: 10px;
                margin-bottom: 10px;
                background: #FFF;
                box-shadow: 0px -1px 10px #333;
            }
            #leftside {
                cursor: pointer;
            }
        </style>
    </head>
    <body>
         <%
        if (session.getAttribute("admin") == null ){
            %>
            <jsp:include page="includesPage/_joinNow1.jsp"></jsp:include>
        <%
        }else {
            %>
            <jsp:include page="includesPage/_logout1.jsp"></jsp:include>
        <%
        }
        
        if (session.getAttribute("admin")== null){
            response.sendRedirect("admin_.jsp");
        }
        %>
        <jsp:include page="includesPage/_search_navigationbar.jsp"></jsp:include>
        <jsp:include page="includesPage/_facebookJoin.jsp"></jsp:include>

        <div class="container_16">

            <div class="grid_16" style="padding: 10px;" id="whiteBox">
                    <br/>
                    
                    <%
                    
                        String sqlPending = "SELECT COUNT(status1) as pending  FROM  orders";
                        
                        String sqlApproved = "SELECT COUNT(status1) as approved  FROM  orders";
                        
                        String sqlQuantity = "SELECT COUNT(product_name) as qty FROM  products WHERE  product_qty <5";
                        
                       sqlQuantity = "SELECT COUNT(product_name) AS qty FROM  products WHERE  product_qty <5";
                        
                        Connection c = new DB_Conn().getConnection();
                        Statement st = c.createStatement();
                        
                        ResultSet rs = null;
                        String  qty = "0", 
                                pendingOrders= "0",
                                approvedOrders= "0";
                        
                        rs = st.executeQuery(sqlQuantity);
                        while (rs.next()){
                                qty = rs.getString("qty");
                        }
                        if (qty.equals("0")){
                            qty = "No";
                        }
                        
                        rs = st.executeQuery(sqlPending);
                        while (rs.next()){
                                pendingOrders = rs.getString("pending");
                        }
                        if (pendingOrders.equals("0")){
                            pendingOrders = "No";
                        }
                        
                        rs = st.executeQuery(sqlApproved);
                        while (rs.next()){
                                approvedOrders = rs.getString("approved");
                        }
                        if (approvedOrders.equals("0")){
                            approvedOrders = "No";
                        }
                    %>
                <h1 class="grid_15">Dashboard Home</h1><hr/>
                <a href="admin_Performance.jsp" id="buy"  class="grid_3"><%= qty %> Items below Quantity</a>     
                <a href="admin_Performance.jsp" id="buy"  class="grid_3"><%= approvedOrders %> Items to be Delivered</a>    
                <a href="admin_Performance.jsp" id="buy" class="grid_3"><%= pendingOrders %> Items to be Approved</a>    
           </div>
                <div class="clear"></div>
            <!--Loading the AJAX API-->
                <script type="text/javascript" src="js/gclibrary/jsapi.js"></script>
                <script type="text/javascript" src="js/gclibrary/core.js"></script>
                <script type="text/javascript" src="js/gclibrary/core1.js"></script>
                
                <jsp:include page="includesPage/gChartings/gChart_ComboLine.jsp"></jsp:include>
                
                <jsp:include page="includesPage/hesders_sidebars/admin_menuSideBar.jsp"></jsp:include>
                <div class="grid_13">
                <jsp:include page="includesPage/gChartings/gCharts_pieChartItemsSoldByCategory.jsp"></jsp:include>
                <jsp:include page="includesPage/gChartings/gCharts_pieChartItemsViewedByCategory.jsp"></jsp:include>
                </div>
                <jsp:include page="includesPage/gChartings/gCharts_top10ProductsSold.jsp"></jsp:include>
                <jsp:include page="includesPage/gChartings/gCharts_top10Products_viewed.jsp"></jsp:include>
                 </div>
                <jsp:include page="includesPage/_footer.jsp"></jsp:include>
       
    </body>
</html>
