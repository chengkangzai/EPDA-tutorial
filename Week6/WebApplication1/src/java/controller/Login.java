/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.MyCustomer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author guan.kiat
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String a = request.getParameter("x");
        int b = Integer.parseInt(request.getParameter("y"));

        ServletContext sc = getServletContext();
        ArrayList<MyCustomer> data = (ArrayList<MyCustomer>) sc.getAttribute("data");

        MyCustomer login = null;
        for (MyCustomer c : data) {
            if (c.getName().equals(a)) {
                login = c;
                break;
            }
        }

        try (PrintWriter out = response.getWriter()) {
            if (login != null) {
                if (login.getPassword() == b) {
                    request.getRequestDispatcher("banner.jsp").include(request, response);
                    out.println("<br><br><br>Hello " + a + ", welcome to APU!");
                    HttpSession s = request.getSession();
                    s.setAttribute("login", login);
                } else {
                    request.getRequestDispatcher("login.jsp").include(request, response);
                    out.println("<br><br><br>Sorry " + a + ", wrong password!");
                }
            } else {
                request.getRequestDispatcher("login.jsp").include(request, response);
                out.println("<br><br><br>Sorry " + a + ", you have not registered!");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
