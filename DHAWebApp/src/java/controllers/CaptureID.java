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
import pojo.errors.InvalidID;
import pojo.helpers.CheckIDValidity;

/**
 *
 * @author Munzhedzi Munyadziwa Petrus
 */
public class CaptureID extends HttpServlet {

    
    @EJB
    private CapturerFacadeLocal capturerFacadeLocal;
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String requestID  = request.getParameter("requestID");
        CheckIDValidity cidv = new CheckIDValidity(requestID);
        
        String capturersName = (String) session.getAttribute("capturersName");
        Integer  capturersID = (Integer) session.getAttribute("capturersID");
        
        if(cidv.testID() == true){
            
            Capturer capturer = new Capturer(capturersID, capturersName, requestID);
            capturerFacadeLocal.create(capturer);
            
            
             RequestDispatcher rd;
             rd = request.getRequestDispatcher("single_capture_outcome_c.jsp");
             rd.forward(request, response);
        }
        
        else{
            
            
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("invalid_id_outcome_c.jsp");
            rd.forward(request, response);
            
        }
        
        
       
      
        
    }

}
