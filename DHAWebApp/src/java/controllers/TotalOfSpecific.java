/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entiities.Capturer;
import entiities.CapturerFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.helpers.CheckIDValidity;

/**
 *
 * @author Student
 */
public class TotalOfSpecific extends HttpServlet {

    @EJB
    private CapturerFacadeLocal capturerFacadeLocal;
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        
            Integer capturersID = Integer.parseInt(request.getParameter("capturersID"));
            Integer total = capturerFacadeLocal.countTotalOfSpecific(capturersID);
            
            
            request.setAttribute("total", total);
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("count_for_specific_outcome_c.jsp");
            rd.forward(request, response);
        
    }
}
