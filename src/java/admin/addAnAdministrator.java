/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import database.DB_Conn;
import helpers.EmailValidator;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import admin.administrator;
import java.sql.SQLException;

/**
 *
 * @author chirag
 */
@WebServlet(name = "addAnAdministrator", urlPatterns = {"/addAnAdministrator"})

public class addAnAdministrator extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addAnAdministrator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addAnAdministrator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
   
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

       String message, messageDetail;
        message = null;
        messageDetail = null;
        String email, pass, passAgain;
        boolean isRegistered = false;

        String messageUrl = "/messageadmin.jsp";
        RequestDispatcher dispatchMessage =
                request.getServletContext().getRequestDispatcher(messageUrl);

        email = request.getParameter("emailReg");
        pass = request.getParameter("passReg");
        passAgain = request.getParameter("passAgainReg");
        EmailValidator validator = new EmailValidator();
        boolean isEmailValid = validator.validate(email);

      

        HttpSession adminSession = request.getSession();

        try {
            DB_Conn con = new DB_Conn();
            Connection c = con.getConnection();
            if ((request.getParameter("emailReg") != "") || (request.getParameter("emailReg") != null)){
                if (isEmailValid) {
                    if (pass.length() > 7) {
                        if (pass.equals(passAgain)) {
                            

                            String sql = "INSERT INTO administrators (email ,password1,passagain,registeredOn)VALUES ( ?, ? ,?, getdate()); ";

                            PreparedStatement psmt = c.prepareStatement(sql);

                            psmt.setString(1, email);
                            psmt.setString(2, pass);
                            psmt.setString(3, passAgain);
                           
                            int i = psmt.executeUpdate();

                            if (i == 1) {
                                isRegistered = true;
                                
                                administrator Admin = new administrator();
                                Admin.setAdmin_email(email);
                                adminSession.setAttribute("admin", Admin);
                                response.sendRedirect(request.getContextPath()+"/admin_addProduct.jsp");
                            } else {
                                isRegistered = false;
                               
                            }

                        } 
                        else {
                            isRegistered = false;
                            message = "Passwords do not match";
                            messageDetail = "Please provide a matching passwords";
                            

                        }
                    } 
                    else {
                        isRegistered = false;
                        message = "Password length is less than 7 characters";
                        messageDetail = "Please provide a passwords that has password length of minimum of seven alphanumeric characters";
                       
                    }
                } 
                else {
                    isRegistered = false;
                    message = "No email address typed";
                    messageDetail = "Please provide a valid email address";
                    
                }
            }
            else {
                isRegistered = false;
                message = "Please enter values";
                messageDetail = "Please provide an email address. Your account currently is not registered";
            }
            
            if (isRegistered == false) {
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

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        doPost(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
