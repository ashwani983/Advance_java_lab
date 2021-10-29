/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mca
 */
@WebServlet(urlPatterns = {"/user_login"})
public class P1_user_login extends HttpServlet {

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
        try (PrintWriter pw = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name=request.getParameter("uname");
            String pass=request.getParameter("pass");
            
            
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<title>Servlet user_login</title>");            
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<h1>Method : processRequest</h1>");
            pw.println("<h1>Servlet user_login at path: </b>" + request.getContextPath() + "</b></h1>");
            pw.println("<h1>Servlet user_login at <b>" + name + "</b></h1>");
            pw.println("<h1>Servlet Password at <b>" + pass + "</b></h1>");
            
            pw.println("</body>");
            pw.println("</html>");
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
        //processRequest(request, response);
        
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        String name=request.getParameter("uname");
        String pass=request.getParameter("pass");
        pw.println("<html><head><title>Login Page</title></head></body>");
        pw.println("<h1>Method : Get</h1>");
        pw.println("<p>Username:<b>"+name+"</b></p>");
        pw.println("<p>Password:<b>"+pass+"</b></p>");
        pw.println("</body></html>");
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
        //processRequest(request, response);
        
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        String name=request.getParameter("uname");
        String pass=request.getParameter("pass");
        pw.println("<html><head><title>Login Page</title></head></body>");
        pw.println("<h1>Method : Post</h1>");
        pw.println("<p>Username:<b>"+name+"</b></p>");
        pw.println("<p>Password:<b>"+pass+"</b></p>");
        pw.println("</body></html>");
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
