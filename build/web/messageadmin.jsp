<%-- 
    Document   : messageadmin
    Created on : May 30, 2017, 6:42:38 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
               

         <link rel="shortcut icon" href="images/logo/ico.ico"/>
<link rel="stylesheet" type="text/css" href="css_old/reset.css"/>
<link rel="stylesheet" type="text/css" href="css_old/text.css"/>
<link rel="stylesheet" type="text/css" href="css_old/960_16.css"/>
<link rel="stylesheet" type="text/css" href="css_old/Product.css" />
<link rel="stylesheet" type="text/css" href="css_old/Styles.css"/>
        <title>JSP Page</title>
         <script src="js/jquery-1.7.2.min.js"></script>
        <script src="js/lightbox.js"></script>
    </head>
    <body>
         <%
        if (session.getAttribute("admin") == null ){// THen new user, show join now
            %>
            <jsp:include page="includesPage/_joinNow1.jsp"></jsp:include>
        <%
        }else {
            %>
            <%@include file="includesPage/_logout1.jsp"%>
        <%
        }
        %>


        <%@include file="includesPage/_search_navigationbar.jsp" %>

    <%@include file="includesPage/_facebookJoin.jsp" %>

<%

        if ((request.getAttribute("message") == null) || (request.getAttribute("messageDetails") == null)){
        //if email session is set, Dont show the message redirect to index
           // response.sendRedirect("index.jsp");
        }
%>

        <div class="container_16">
            <div id="whiteBox" class="grid_16">

                <div style="padding: 10px;" class="grid_7 push_5 BigRed" >
                    <h1>
                        <% out.print(request.getAttribute("message"));%></h1>

                    
                    <h5 style="padding: 10px;">
                        <%                                                                
                            out.print(request.getAttribute("messageDetail"));
                        %>
                    </h5>
                        
                    

                </div>
            </div>
        </div>


    </body>
</html>
