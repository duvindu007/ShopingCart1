<%-- 
    Document   : _joinNow1
    Created on : May 25, 2017, 10:58:33 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type ="text/javascript" src="js/headerJoinScript.js"></script>
    </head>
    <body>
        <div id = "topWrapper">
    <div class="container_16">
        <div class="grid_16">
            <div id="logo" class="grid_6"> <a href="admin_.jsp"><img src="images/banner/dragons.jpg" /></a>
            </div>
            <div class="grid_6" id="top">
                <ul>
                    <a href="#" id="join"><li id="greenBtn"  class ="Btn showForm">Join Now!!</li></a>
                </ul>
            </div>
        </div>
    </div>
</div>
        <div id = "topLogin">
    <div class="container_16">
        <div id="LoginBox" class="grid_16">
         <div class="grid_6 push_2" id = "RegisterForm">
                <!--form autocomplete="false" method="POST" action="register" name="registerServlet"-->
                <form autocomplete="false" method="POST" action="addAnAdministrator" name="addAnAdministrator">    
                    <table>
                        <tr>
                            <td colspan="2">
                                <strong><h1 style="font-wieght:bold; text-align:right; padding:20px 0px; color:#FFF;">Register Now!!</h1></strong>
                            </td>
                            <td>

                            </td>
                        </tr>
                        
                        <tr>
                            <td>
                                <label>Email</label>
                            </td>
                            <td>
                                <label><input type="email" name="emailReg"  placeholder="johnUUUU_lee@xyz.com" required/><br/></label>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Password</label>
                            </td>
                            <td>
                                <input type="password" name="passReg" placeholder="&bull;&bull;&bull;&bull;&bull;&bull;&bull;" required/><br/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Password Again</label>
                            </td>
                            <td>
                                <input type="password" name="passAgainReg" placeholder="&bull;&bull;&bull;&bull;&bull;&bull;&bull;" required/><br/>
                            </td>
                        </tr>
                        <!--	<tr>
                                        <td>
                                        <label>Gender</label>
                                        </td>
                                        <td>
                                        <select>
                                                <option name="gender" value="male">Male</option>
                                                <option name="gender" value="female">Female</option>
                                        </select><br/>
                                        </td>
                                </tr>-->

                        <tr>
                            <td>
                            </td>
                            <td>
                                <input type="submit" value="Register" id="greenBtn" /><br/>
                            </td>
                        </tr>
                    </table>

                </form>
            </div>
        </div>
    </div>
        </div>
    </body>
</html>
