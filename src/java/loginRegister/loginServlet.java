package loginRegister;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import database.DB_Conn;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import helpers.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import user.users;

/**
 *
 * @author user
 */


@WebServlet(urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

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
            out.println("<title>Servlet loginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServlet at " + request.getContextPath() + "</h1>");
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
//     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       // doPost(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
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
        String email, pass;
        String db_email, db_pass;
        boolean isLoggedIn = false;
        HttpSession userSession = request.getSession();
        PrintWriter out = response.getWriter();
        email = request.getParameter("email");
        pass = request.getParameter("pass");
        String message, messageDetail;
        message = "";
        messageDetail = "";
        
        String messageUrl = "/message.jsp";
        RequestDispatcher dispatchMessage =
                 request.getServletContext().getRequestDispatcher(messageUrl);
        
        try {
             
            DB_Conn con = new DB_Conn();
            Connection c = con.getConnection();
            String sqlGetUsers = "SELECT email,pass FROM user1; ";

            PreparedStatement st = c.prepareStatement(sqlGetUsers);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                db_email = rs.getString("email");
                db_pass = rs.getString("pass");

                if (email.equals(db_email)) {
                    
                    
                    if (pass.equals(db_pass)) {
                        isLoggedIn = true;
                        
                        
                        users User = new users();
                        User.setUserEmail(email);
                        
                        userSession.setAttribute("user", User);
                        response.sendRedirect(request.getContextPath()+"/index.jsp");
                        return;
                      }
                    else {
                        isLoggedIn = false;
                     
                        message = "Wrong Password...!";
                        messageDetail = "Password does not match with the password during registeration... Please re-login with correct password";
                       
                        break;
                    }
                }
                else {
                  
                    
                    message = "Email does not exists";
                    messageDetail = "Please register with us right now to buy items on the go!";
                    isLoggedIn = false;
                }
            }
            
            if (isLoggedIn == false){
                request.setAttribute("message", message);
                request.setAttribute("messageDetail", messageDetail);
                dispatchMessage.forward(request, response);
            }
            
        } catch (SQLException e) {
            
          
            message = "An Error occoured during the process of login";
            messageDetail = "We are extremely sorry to have this but we had an error during your process of login please do try after some time,";
                   
            request.setAttribute("message", message);
            request.setAttribute("messageDetail", messageDetail);
            dispatchMessage.forward(request, response);
            
        } 

        catch (Exception e) {
             messageDetail = e.getMessage();
            message = "There was a problem in loging in to your account please do retry again later...";
            
            
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
