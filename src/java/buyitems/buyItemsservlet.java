/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyitems;

import database.DB_Conn;
import helpers.EmailValidator;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import user.users;

/**
 *
 * @author user
 */
@WebServlet(name = "buyItemsservlet", urlPatterns = {"/buyItemsservlet"})
public class buyItemsservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Frameset//EN\" \"http://www.w3.org/TR/REC-html40/frameset.dtd\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet buyItemsservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet buyItemsservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        String message, messageDetail;
        message = null;
        messageDetail = null;
        
        String userid,name,mobile,address,gender;
        int usid;
        boolean isRegistered1 = false;

        String messageUrl = "/message.jsp";
        RequestDispatcher dispatchMessage =
                request.getServletContext().getRequestDispatcher(messageUrl);

        
        name = request.getParameter("name");
        mobile = request.getParameter("mobile");
         address = request.getParameter("address");
          gender = request.getParameter("gender");
           
       
       
        PrintWriter out = response.getWriter();

        HttpSession usernameSession = request.getSession();
 usernameSession.setAttribute("name", name);
        try {
            DB_Conn con = new DB_Conn();
            Connection c = con.getConnection();
            if ((request.getParameter("name") != "") || (request.getParameter("name") != null)){
               
                    
                        
                          

                            String sql = "INSERT INTO user_details VALUES (  ? ,?,?,?); ";

                            PreparedStatement psmt = c.prepareStatement(sql);

                            
                            psmt.setString(1, name);
                             psmt.setString(2, mobile);
                             psmt.setString(3, address);
                             psmt.setString(4, gender);
                           
                            int i = psmt.executeUpdate();

                            if (i == 1) {
                                isRegistered1 = true;
                              
                               
                               
                                response.sendRedirect(request.getContextPath()+"/buyItems.jsp");
                            } else {
                                isRegistered1 = false;
                               
                            }

                      
                   
                
               
                
            }
            else {
                isRegistered1 = false;
                message = "Please enter values";
                messageDetail = "Please provide a valid username.";
            }
            
            if (isRegistered1 == false) {
                request.setAttribute("message", message);
                request.setAttribute("messageDetail", messageDetail);
                dispatchMessage.forward(request, response);
            }

            
        } catch (SQLException e) {
            
          
            message = "An Error occoured during the process of registering";
            messageDetail = "We are extremely sorry to have this but we had an error during your process of registering please do try after some time,";
                   
            request.setAttribute("message", message);
            request.setAttribute("messageDetail", messageDetail);
            dispatchMessage.forward(request, response);
        } catch (Exception ex) {
            messageDetail = ex.getMessage();
            message = "There was a problem in registering your account please do retry again later...";
          
            request.setAttribute("message", message);
            request.setAttribute("messageDetail", messageDetail);
            dispatchMessage.forward(request, response);
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
