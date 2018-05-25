<%-- 
    Document   : _logout1
    Created on : May 30, 2017, 4:04:49 PM
    Author     : user
--%>

<%@page import="admin.administrator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% administrator Admin=(administrator) session.getAttribute("admin");%>
      <div id = "topWrapper">
        <div class="container_16">
                <div class="grid_16">
                    <div id="logo" class="grid_6"> <a href="admin_.jsp"><img src="images/banner/dragons.jpg" /></a>
                        </div>
                        <div class="grid_9" id="top">
                            <ul>
                                <a href="_logoutServlet"><li id="greenBtn" class ="Btn showForm">Logout</li></a>
                                
                                <%
                                    if (session.getAttribute("admin") != null){
                                %>
                                <a href="admin_Performance.jsp"><li class ="Btn showForm">Administrator Performance: </li></a>
                                <%
                                    }
                                %>
                                
                            </ul>
                        </div>
                </div>
            </div>
    </div>

    </body>
</html>
