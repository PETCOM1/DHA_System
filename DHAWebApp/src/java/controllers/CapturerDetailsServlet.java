/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
public class CapturerDetailsServlet extends HttpServlet {

   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String capturersName = request.getParameter("capturersName");
        Integer capturersID = Integer.parseInt(request.getParameter("capturersID"));
      
        
        
        session.setAttribute("capturersName", capturersName);
        session.setAttribute("capturersID", capturersID);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("start_capturing_c.jsp");
        rd.forward(request, response);
      
        
    }

   

}
