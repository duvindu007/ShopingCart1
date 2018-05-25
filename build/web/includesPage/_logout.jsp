
<%@page import="user.users"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>

<%@page import="admin.administrator"%>

<style type="text/css">
    .backRed {
        background: #CC0000;
        padding: 3px 7px;
        margin-right: 3px;
    }
</style>
<jsp:useBean id="cart"  scope="session" class="cart.cart"  ></jsp:useBean>
<%
    ArrayList<Integer> Qty = new ArrayList();
    Qty = cart.getQty();
    int totalQty = 0;
    for (int i=0; i<Qty.size(); i++){
        totalQty += Qty.get(i);
    }
    
        
    
   users User = (users) session.getAttribute("user");
   administrator Admin=(administrator) session.getAttribute("admin");
   
    String email = User.getUserEmail();
    String userName = User.getUsername();
   // int uid = User.getUserId();
    
    String printName;
    if (userName == null){
        printName = email;
    }
    else {
        printName = userName;
    }
   
%>
   <div id = "topWrapper">
        <div class="container_16">
                <div class="grid_16">
                        <div id="logo" class="grid_6"> <a href="index.jsp"><img src="images/banner/dragons.jpg" /></a>
                        </div>
                        <div class="grid_9" id="top">
                            <ul>
                                <a href="_logoutuserservlet"><li id="greenBtn" class ="Btn showForm">Logout</li></a>
                               <li class ="Btn showForm"><%= printName %></li></a>
                                <%
                                   if (session.getAttribute("admin") != null){
                                %>
                                <a href="admin_Performance.jsp"><li class ="Btn showForm">Administrator: </li></a>
                                <%
                                    }
                                %>
                                <a href="addToCart_view.jsp"><li class ="Btn showForm"><span class="backRed"><%= totalQty %></span> in My Cart </li></a>
                            </ul>
                        </div>
                </div>
            </div>
    </div>
