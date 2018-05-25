<%@page import="database.DB_Conn"%>
<!DOCTYPE HTML>

<%@page import="java.sql.*, database.*" %>
<%  String productname=request.getParameter("prodname");
    String productprice=request.getParameter("price3");
    String qty=request.getParameter("productQty");
    String summary=request.getParameter("summary");
    String hits=request.getParameter("hits");
    String tags=request.getParameter("tags3");
    DB_Conn conn = new DB_Conn();
    Connection con = conn.getConnection();
    Statement st = con.createStatement();
    String sql_getCategory = "SELECT  category_name FROM  category;";
    String sql_getSubCategory = "SELECT  sub_category_name FROM  sub_category;";
    String sql_getCompany = "SELECT  company_name FROM  product_company;";
    String sql_getprice = "select price from products";
    String sql_getsummary= "select summary from products";
  
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Online</title>
        <link rel="shortcut icon" href="images/logo/ico.ico"/>

<link rel="stylesheet" type="text/css" href="css_old/reset.css"/>
<link rel="stylesheet" type="text/css" href="css_old/text.css"/>
<link rel="stylesheet" type="text/css" href="css_old/960_16.css"/>
<link rel="stylesheet" type="text/css" href="css_old/Product.css" />
<link rel="stylesheet" type="text/css" href="css_old/Styles.css"/>
        <%@include file="includesPage/_stylesheets.jsp" %>
        <!--
                <link rel="stylesheet" type="text/css" href="css/forms/button.css"/>
        -->
        <link rel="stylesheet" type="text/css" href="css_old/Styles.css"  />

        <link rel="stylesheet" type="text/css" href="css_old/Product.css"  />

        <script src="js/jquery-1.7.2.min.js"></script>
        <script src="js/lightbox.js"></script>
        <script type="text/javascript" src="js/myScript.js"/></script>
    <script type="text/javascript" src="js/product.js"/></script>

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

    <%@include file="includesPage/_search_navigationbar.jsp" %>

    <%@include file="includesPage/_facebookJoin.jsp" %>

    <div class="container_16">
        <div class="grid_16" id="productStrip">
            <div class="grid_16">
                <h1 class="bold underlined center" style="font-size:35px; margin:20px auto;" >Add Product</h1>
            </div>
            <div class="grid_10 push_3">
                <form method="post" action="productinsertservlet">
                    <div class="grid_10">
                        <div class="grid_9">
                            <p style="font-size:15px;">Start entering the product information step by step... Into your database</p>
                            <table class="stepTable">
                                <tr>
                                    <td colspan="2"><h1>Step 1.Product Company entered</h1></td>
                                </tr>
                                <%//Retrieves The Data From product-company table%>
                                <tr>
                                    <td><h4>Company selected</h4></td>
                                    <td><img src= "images/icons/dropDown.png" alt="dropDown"/>
                                        <select name="company">

                                            <%
                                                ResultSet company = st.executeQuery(sql_getCompany);
                                                while (company.next()) {
                                                    String companyName = company.getString("company_name");
                                            %>

                                            <option name="<%= companyName%>"><%= companyName%></option>

                                            <%
                                                }
                                            %>


                                        </select>

                                    </td>
                                </tr>
                                
                                   
                            
                            <h4 id="step1Feedback" class="grid_8 center">-------------------------------------------------------------<br/></h4>

                            <h4 id="step2Feedback" class="grid_8 center">-------------------------------------------------------------<br/></h4>

                          
                                <tr>
                                    <td colspan="2"><h1>Step 2. Category entered</h1></td>
                                </tr>
                                <%//Retrieves The Data From category table%>
                                <tr>
                                    <td><h4>Category</h4>
                                        </td>
                                <script type="text/javascript" src="js/jquery.js"></script>
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

                                <td><img src= "images/icons/dropDown.png" alt="dropDown"/>
                                    <select id="selectMenuCategory" name="category">
                                        
                                        <% 
                                            ResultSet rs = st.executeQuery(sql_getCategory);
                                            while (rs.next()) {
                                                String category = rs.getString("category_name");
                                        %>
                                        <option value="<%= category%>"><%= category%></option>
                                        <%
                                            }
                                        %>
                                    </select></td>

                                </tr>

                                


                                <%//Retrieves The Data From Sub-category table%>
                                <tr>
                                    <td><h1>Step 3. Sub-Category entered</h1> </td></tr>
                                <tr>
                                    <td>Sub category</td>
                                    <td>
                                        <img src= "images/icons/dropDown.png" alt="dropDown"/>
                                        <select id="selectMenuSubCategory" name="subCategory">

                                            <%

                                                ResultSet subCategory = st.executeQuery(sql_getSubCategory);

                                                while (subCategory.next()) {
                                                    String subCat = subCategory.getString("sub_category_name");
                                            %>

                                            <option value="<%= subCat%>"><%= subCat%></option>

                                            <%
                                                }
                                                

                                            %>

                                        </select>
                                    </td>
                                </tr>

                                
                            </table>
                        </div>


                        <!--	<div id="productStockDetail">
                                        <h4>Product In Stock</h4>
                                        <h5>Will be delivered in 5 days</h5>
                                </div>-->
                        <div class="clear"></div>
                        <h1>Step 4. Price entered</h1>
                        
                            
   

                        <input id="price" type="number"  value="<%=productprice%>" name= "price2" tabindex="1" placeholder="eg.Rs 7899/-"/><br/>

                                            <%
                                                
                                                

                                            %>
                                            
                        <br/>
                        <h1>Step 5. Product Name entered &AMP; Quantity</h1>
                        <input id="productName" type="text" value="<%=productname%>" name= "productName"  placeholder="Product Name"/><br/>
                        <br/>
                        <input id="productQty" value="<%=qty%>" type="text" name= "productQty"  placeholder="Quantity"/><br/>
                        <br/>
                        <h1>Step 6. Tags entered</h1>
                        <input id="tags" value="<%=tags%>" type="text" name= "tags" placeholder="Write in tags here without commas"/><br/>
                        <br/>  
                        <h1>Step 7. Summary / Description Of the Product</h1>
                        <input id="summary" type="text" value="<%=summary%>" name="summary2"   />                       
                        <br/>
                        <h1>Step 8. Hits</h1>
                        <input id="mobile" type="text" value="<%=hits%>" name="hits2"   />
                        <input id="greenBtn" type="submit" value ="Insert products" />
                    </div>
                </form>
                        <h1 style="margin-left: 300px; color: #CC0000"> Now click <a href="admin_manageProduct.jsp">here </a>to update &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;products</h1>
                <div class="clear"></div>
                <br/>

            </div>
            <%--This separates out the Image and the main Content --%>

            <div class="clear"></div>
        </div>
    

<div id="middle"class="grid_13">
<jsp:include page="includesPage/mainHeaders/topMostViewedProducts_4.jsp"></jsp:include>

    </div>
    </div>
<jsp:include page="includesPage/_footer.jsp"></jsp:include>


</body>
</html>
