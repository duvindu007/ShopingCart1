<%-- 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Online Shop</title>
        <!--jsp:useBean class="product.product" id="product" scope="session"><!--/jsp:useBean-->
          <jsp:useBean id="product" class="product.product"/> 
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
        <script type="text/javascript">
            $(document).ready (function (){
                $('#selectMenuCategory').click(function (){
                    var category = $(this).attr('value');
                    //alert ("Aargh " +getCategory);
                    $.get('getProductSubCategory', 
                    { category: category}, 
                    function (data){
                        $('#selectMenuSubCategory').html(data);
                    });
                });
            });
        </script>
    </head>
    <body>

        <%
            if (session.getAttribute("admin") == null) {// THen new user, show join now

         response.sendRedirect("admin_.jsp");
               } else {
        %>
        <jsp:include page="includesPage/_logout1.jsp"></jsp:include>
        <%}
             %>
        <jsp:include page="includesPage/_search_navigationbar.jsp"></jsp:include>
        <jsp:include page="includesPage/_facebookJoin.jsp"></jsp:include>

        <div class="container_16">
            <div class="grid_16" style="padding: 10px;" id="whiteBox">
                <div class="grid_3">
                    <br/><h1>Add Product</h1><hr/>
                </div>
                <div>

                    <div class="grid_3">
                        <br/><h1>Step 1. Enter Product Company</h1><hr/>
                    </div>
                    <div class="grid_3 highlight">
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
                  


            <!--Loading the AJAX API-->
            <script type="text/javascript" src="js/gclibrary/jsapi.js"></script>
            <script type="text/javascript" src="js/gclibrary/core.js"></script>
            <script type="text/javascript" src="js/gclibrary/core1.js"></script>

         <!--jsp:useBean class="product.productBean" scope="session" id="productBean"--><!--/jsp:useBean-->
         
                <jsp:useBean id="productBean" class="product.productBean"></jsp:useBean> 
         
<%
    DB_Conn conn = new DB_Conn();
    Connection con = conn.getConnection();
    Statement st = con.createStatement();
    String sql_getCategory = "SELECT  category_name FROM  category; ";
    String sql_getSubCategory = "SELECT  sub_category_name FROM  sub_category;";
    String sql_getcatfromsub = "select category_name from sub_category";
  //  String sql_getCompany = "SELECT  company-name FROM  product_company;";
    
    if (productBean.getCompany() != null || productBean.getCompany()  == ""){
        response.sendRedirect("admin_addProduct_1.jsp");
        
    }
%>
            

            <div class="grid_13"  style="padding: 10px 0px;" id="whiteBox">
                <div class="grid_13">
                    <br/><h1>Step 2. Enter Category</h1><hr/>
                </div>
                <div class="clear"></div>
                <form method="post" action="admin_addProduct_controller.jsp">
                    <input type="hidden" name="company" value="<%= productBean.getCompany() %>">
                    <input type="hidden" name="page" value="admin_addProduct_3.jsp" action="admin_addProduct_3.jsp">
                    <input id="buy" type="submit" value="Next >"/>
                    </form>
                    <div class="grid_2">
                        <h3>Select Category</h3>
                    </div>
                    <div class="grid_5">
                        <select id="selectMenuCategory" name="category">
                            <option value="" selected="">Select Category</option>
                                        <% 
                                            ResultSet rs = st.executeQuery(sql_getCategory);
                                            while (rs.next()) {
                                                String category = rs.getString("category_name");
                                        %>
                                        <option value="<%= category%>"><%= category%></option>
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
                        <h4 id="step2Feedback" class="grid_8 center">-------------------------------------------------------------<br/></h4>

                    </div>
                    <div class="clear"></div><br/>
                    <div class="grid_2">
                        <h3>Add Category</h3>
                    </div>
                    <form action="addcategoryservlet" method="POST">
                   
                    <div class="grid_5">
                        
                        <input id="categoryName" type="text" name= "categoryName" tabindex="1" placeholder="eg. Games, Movies, Books" required />
                    </div>
                    <div class="grid_2">

                    </div>
                    <div class="clear"></div><br/>
                    <div class="grid_7">
                        <input id="addCategoryNameBtn" class="buy" type="submit" value="Add Category"/>
                    
                    </div>
                        </form>        

                    <div class="clear"></div>
                    <div class="grid_2">
                        <h3>Select Category and Sub Category</h3>
                    </div>
                    <div class="grid_5">
                        <select id="selectMenuCategory" name="categoryfromsub">
                            <option value="" selected="">Select Category</option>
                                        <% 
                                            ResultSet rs1 = st.executeQuery(sql_getcatfromsub);
                                            while (rs1.next()) {
                                                String getcategory = rs1.getString("category_name");
                                        %>
                                        <option value="<%= getcategory%>"><%= getcategory%></option>
                                        <%
                                            }
                                        %>
                        </select>
                        <select id="selectMenuSubCategory" name="subCategory">
                            <option value="" selected="">Select Sub-Category</option>
                                            <%

                                                ResultSet subCategory = st.executeQuery(sql_getSubCategory);

                                                while (subCategory.next()) {
                                                    String subCat = subCategory.getString("sub_category_name");
                                                  //  System.out.println(subCat);
                                                    
                                            %>

                                            <option value="<%= subCat%>"><%= subCat%></option>

                                            <%
                                                }
                                                st.close();
                                            %>
                        </select>
                    </div>
                    <div class="clear"></div><br/>
                    <div class="grid_2">
                        Or
                    </div>
                    <div class="grid_5">
                        <h4 id="step2Feedback1" class="grid_8 center">-------------------------------------------------------------<br/></h4>
                    </div>
                    <div class="clear"></div><br/>
                    <form action="addcatandsubservlet" method="POST">
                    
                    <table>
                        <tr>
                        <th>Add Category </th>
                        
                    
                    
                        <td><input id="CategoryName"  type="text" name= "catfromsub" tabindex="1" placeholder="please add category name here" required /></td>
                        </tr>
                        <tr>
                            <th>and sub category </th>
                            <td><input id="SubCategoryName"  type="text" name= "SubCategoryName" tabindex="1" placeholder="please add sub category name here" required /></td></tr>
                    </table>
                        
                    <br> <input style="margin-right: 350px" id="addCategoryNameBtn" class="buy" type="submit" value="Add category and Sub-Category"/>
                    </form>
                    
                        <div class="grid_7">
                        
                    </div>
                    <div class="grid_5">
                        
                    </div>
                    <div class="grid_2">

                    </div>
                    <div class="clear"></div><br/>
                    <div class="grid_7">
                      
                    </div>
                    <div class="grid_5">
                        
                    </div>
                
            </div>

        </div>
    </body>
</html>
