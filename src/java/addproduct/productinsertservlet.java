/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addproduct;

import database.DB_Conn;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "productinsertservlet", urlPatterns = {"/productinsertservlet"})
public class productinsertservlet extends HttpServlet {

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
            out.println("<title>Servlet productinsertservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet productinsertservlet at " + request.getContextPath() + "</h1>");
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
        String productcom = request.getParameter("company");
      String catname = request.getParameter("category");
      String subcat = request.getParameter("subCategory");
      String price1 = request.getParameter("price2");
      String prodname = request.getParameter("productName");
      String prodqty = request.getParameter("productQty");
      String tags = request.getParameter("tags");
      String summary1 = request.getParameter("summary2");
      String hits1 = request.getParameter("hits2");
        boolean isinserted = false;

        PrintWriter out = response.getWriter();

        
        try {
            DB_Conn con = new DB_Conn();
            Connection c = con.getConnection();
            
                            

                            String sql = "INSERT INTO "
                                    + "products (product_name,sub_category_name,category_name,company_name,price,summary,tags,product_qty,lastUpdated,hits)VALUES (?,?,?,?,?,?,?,?,getdate(),?); ";

                            PreparedStatement psmt = c.prepareStatement(sql);

                            psmt.setString(1, prodname);
                            psmt.setString(2, subcat);
                            psmt.setString(3, catname);
                            psmt.setString(4, productcom);
                            psmt.setString(5, price1);
                            psmt.setString(6, summary1);
                            psmt.setString(7, tags);
                            psmt.setString(8, prodqty);
                            psmt.setString(9, hits1);
                           
                           
                            int i = psmt.executeUpdate();
                             if (i == 1) {
                                isinserted = true;
                                out.println("Inserted ");
                                                                
                                
                                response.sendRedirect(request.getContextPath()+"/productInsert.jsp");
                            } else {
                                isinserted = false;
                                out.println("Not inserted");
                            }

    }
           
                  catch (SQLException ex) {
            
        } 
                catch (ClassNotFoundException ex) {
            
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
