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
import java.util.List;
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
public class ViewAllIDs extends HttpServlet {

     @EJB
    private CapturerFacadeLocal capturerFacadeLocal;
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            List<Capturer> capturers = capturerFacadeLocal.findAll();
            
            
            request.setAttribute("capturers", capturers);
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("view_all_ids_outcome_m.jsp");
            rd.forward(request, response);
       
    }
}
