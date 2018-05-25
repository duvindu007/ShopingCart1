<%-- 
    Document   : userinfo
    Created on : May 31, 2017, 12:23:54 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/logo/ico.ico"/>
        <!--link rel="stylesheet" type="text/css" href="css/reset.css"/-->
        <!--link rel="stylesheet" type="text/css" href="css/text.css"/-->
        <!--link rel="stylesheet" type="text/css" href="css/960_16.css"/-->
        <!--link rel="stylesheet" type="text/css" href="css/product.css"  /-->
        
<link rel="stylesheet" type="text/css" href="css_old/reset.css"/>
<link rel="stylesheet" type="text/css" href="css_old/text.css"/>
<link rel="stylesheet" type="text/css" href="css_old/960_16.css"/>
<link rel="stylesheet" type="text/css" href="css_old/Product.css" />
<link rel="stylesheet" type="text/css" href="css_old/Styles.css"/>

        <link rel="stylesheet" type="text/css" href="css_old/lightbox.css"  />

       

        <script src="js/jquery-1.7.2.min.js"></script>
        <script src="js/lightbox.js"></script>
        <script src="js/myScript.js"></script>
        <style type="text/css">
            .shippingAddress {
                background: #EEE; 
                padding: 10px; 
                border: 2px solid #CCC; 
                border-radius: 10px 0px 10px 0px;
                cursor: pointer;
            } 
        </style>
    </head>
    <body>
        <%
        if (session.getAttribute("user") == null ){// THen new user, show join now
            %>
            <jsp:include page="includesPage/_joinNow.jsp"></jsp:include>
        <%
        }else {
            %>
            <jsp:include page="includesPage/_logout.jsp"></jsp:include>
        <%
        }
        %>
     <%String user=request.getParameter("uname");%>
        <jsp:include page="includesPage/_search_navigationbar.jsp"></jsp:include>
        <jsp:include page="includesPage/_facebookJoin.jsp"></jsp:include>
          <sql:setDataSource var="dbsource" driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://localhost:1433;databaseName=ShopingCartDB"                           
                           user="sa"  password="123"/>
 
        <sql:query dataSource="${dbsource}" var="result">
            
            select * from user_details where username= '<%=user%>'
        </sql:query>
        
        
    <center>
       <div class="container">
           <div class="jumbotron" style="margin-top: 30px; border-color: #245580" >
            <table border="1" width="100%" style="margin-top: -30px;" >
                <caption><center><b class="b1">User info</b></center></caption>
              
                <tr>
                    <th>User details ID</th>
                    <th>Username</th>
                    <th>Mobile no</th>
                    <th>Address</th>
                    <th>Gender</th>
                    
                     
                   
                </tr>
                <c:forEach var="row" items="${result.rows}">
          
                    
                    <tr>                        
                        
                        <td><c:out value="${row.userDetail_Id}"/></td>
                        <td><c:out value="${row.username}"/></td>
                        <td><c:out value="${row.mobile_no}"/></td>
                        <td><c:out value="${row.address1}"/></td>
                        <td><c:out value="${row.gender}"/></td>
                      
                        
                    </tr>
                </c:forEach>
            </table>
       </div>
       </div>
        
        
    
    </body>
</html>
