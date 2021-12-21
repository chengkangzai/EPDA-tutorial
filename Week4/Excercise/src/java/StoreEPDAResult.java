/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CCK
 */
public class StoreEPDAResult extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                Integer result = Integer.parseInt(request.getParameter("result"));
                if (result <= -1 || result >= 101) {
                    request.getRequestDispatcher("index.html").include(request, response);
                    out.println("Invalid result nunmber");
                }
                String grade = null;
                if (result <= 19) {
                    grade = "F-";
                } else if (result <= 29) {
                    grade = "F";
                } else if (result <= 39) {
                    grade = "F+";
                } else if (result <= 49) {
                    grade = "D";
                } else if (result <= 54) {
                    grade = "C-";
                } else if (result <= 59) {
                    grade = "C";
                } else if (result <= 64) {
                    grade = "C+";
                } else if (result <= 69) {
                    grade = "B";
                } else if (result <= 74) {
                    grade = "B+";
                } else if (result <= 79) {
                    grade = "A";
                } else {
                    grade = "A+";
                }

                request.getRequestDispatcher("index.html").include(request, response);
                out.println("Hi, the grade of : " + name + " is " + grade);
            } catch (NumberFormatException e) {
                request.getRequestDispatcher("index.html").include(request, response);
                out.println("Please only input number");
            }
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
