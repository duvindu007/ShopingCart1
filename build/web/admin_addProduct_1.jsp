<%-- 
  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Online Products</title>
         <jsp:useBean class="product.product" id="product" ></jsp:useBean>

        <%@page import="java.sql.*, database.*" %>
        <link rel="shortcut icon" href="images/logo/ico.ico"/>
        <link rel="stylesheet" type="text/css" href="css_old/reset.css"/>
        <link rel="stylesheet" type="text/css" href="css_old/text.css"/>
        <link rel="stylesheet" type="text/css" href="css_old/960_16.css"/>
        <link rel="stylesheet" type="text/css" href="css_old/Product.css"  />

        <link rel="stylesheet" type="text/css" href="css_old/lightbox.css"  />

        <link rel="stylesheet" type="text/css" href="css_old/Styles.css"/>

        <script src="js/jquery-1.7.2.min.js"></script>
        <script src="js/lightbox.js"></script>
        <script src="js/myScript.js"></script>


        <style type="text/css">


            .buy {
                margin-top:7px;
                margin-bottom:15px;
                float:right;
                padding:5px;
                color:#000;
                text-shadow: 0 1px 0 white;
                padding:10px;
                border-radius:5px;
                background: -webkit-linear-gradient(top, #aee800, #8fbe00);
                background: -moz-linear-gradient(top, #aee800, #8fbe00);
                text-align:center;
                box-shadow: 0 1px 4px rgba(0, 0, 0, 0.27);
                -webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.27);
                -moz-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.27);

            }
            .buy:hover {
                float:right;
                color:#000;
                border-radius:7px;
                text-shadow: 0 -1px 0 white;
                text-align:center;
                padding:10px;
                background: -webkit-linear-gradient(top, #8fbe00,#aee800);
                background: -moz-linear-gradient(top, #8fbe00,#aee800);
                box-shadow: 0 1px 4px rgba(0, 0, 0, 0.4);
            }


            .highlight {
                box-shadow: inset -10px 0px 10px #666;
                background: #E0E0E0;
                border-radius: 0px 27px 27px 0px;
            }
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
            if (session.getAttribute("admin") == null) {// THen new user, show join now
        %>
        <jsp:include page="includesPage/_joinNow1.jsp"></jsp:include>
        <%        } else {
        %>
        <jsp:include page="includesPage/_logout1.jsp"></jsp:include>
       
        <%            }
        
    //    if (session.getAttribute("admin")== null){
     //       response.sendRedirect("admin_.jsp");
      //  }
      //  %>

        <jsp:include page="includesPage/_search_navigationbar.jsp"></jsp:include>
        <jsp:include page="includesPage/_facebookJoin.jsp"></jsp:include>

            <div class="container_16">
                <div class="grid_16" style="padding: 10px;" id="whiteBox">
                    <div class="grid_3">
                        <br/><h1>Add Product</h1><hr/>
                    </div>
                    <div>

                        <div class="grid_3 highlight">
                            <br/><h1>Step 1. Enter Product Company</h1><hr/>
                        </div>
                        <div class="grid_3">
                            <br/><h1>Step 2. Enter Category</h1><hr/>
                        </div>
                        <div class="grid_3">
                            <br/><h1>Step 3. Enter in Product Name, Tags</h1><hr/>
                        </div>
                        <div class="grid_3">
                            <br/><h1>Step 4. Enter in Pricing & Quantity and Description</h1><hr/>
                        </div>

                    </div>
                </div>
                <div class="clear"></div>
                
                <jsp:include page="includesPage/hesders_sidebars/admin_menuSideBar.jsp"></jsp:include>
                  
            <%
                DB_Conn conn = new DB_Conn();
                Connection con = conn.getConnection();
                Statement st = con.createStatement();
                //String sql_getCategory = "SELECT  `category_name` FROM  `category`; ";
                //String sql_getSubCategory = "SELECT  `sub-category_name` FROM  `sub-category`;";
                String sql_getCompany = "SELECT  company_name FROM  product_company;";
            %>
            
            
                <!--jsp:useBean class="product.productBean" scope="session" id="productBean"--><!--/jsp:useBean-->
                
            <div class="grid_13"  style="padding: 10px 0px;" id="whiteBox">
                <div class="grid_13">
                    <br/><h1>Step 1. Start selecting Product Company Or, Enter a one...</h1><hr/>
                </div>
                <div class="clear"></div>
                <form method="post" action="admin_addProduct_controller.jsp">
                    <input type="hidden" id="buy" name="page" value="admin_addProduct_2.jsp" action="admin_addProduct_2.jsp"/>
                    <div class="grid_2">
                        <h3>Select Company</h3>
                    </div>
                    <div class="grid_5">
                        <select name="company" id="company">

                            <option value="" selected>Select a Company</option>

                            <%
                                ResultSet company = st.executeQuery(sql_getCompany);
                                while (company.next()) {
                                    String companyName = company.getString("company_name");
                            %>

                            <option value="<%= companyName%>"><%= companyName%></option>

                            <%
                                }
                            %>


                        </select>
                    </div>
                    <div class="clear"></div><br/>
                    <div class="grid_2">
                        Or
                    </div>
                    <div class="grid_5">
                        <h4 id="step1Feedback" class="grid_8 center">-------------------------------------------------------------<br/></h4>

                    </div>
                    <div class="clear"></div><br/>
                    <div class="grid_2">
                        <h3>Add A Company</h3>
                    </div>
                    <div class="grid_5">
                        
                    </div>
                    <div class="grid_2">

                    </div>
                    <div class="clear"></div><br/>
                    
                    <div class="grid_5">
                        <input id="buy" type="submit" value="Next >"/>
                    </div>
                </form>
               <div class="grid_7">
                   <form action="addproduct1servlet" method="POST">
                       <input style="width: 50%" id="companyName" type="text" name="companyName" placeholder="Company Name here" required/>
                        <input style="margin-top: -10px;width: 40%" id="addProductNameBtn" class="buy" type="submit" value="Add Company"/>
                       </form> 
                    </div>
                         
            </div>

        </div>

    </body>
    </body>
</html>
