<%-- 
    Document   : view_all_ids_outcome_m
    Created on : 23 May 2025, 11:00:49 PM
    Author     : Munzhedzi Munyadziwa Petrus
--%>

<%@page import="java.util.List"%>
<%@page import="entiities.Capturer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All IDs In The System Page</title>
    </head>
    <body>
        <h1>All IDs In The System</h1>
        <%
            List<Capturer> capturers = (List<Capturer>)request.getAttribute("capturers");
            
            for(int i = 0;i<capturers.size();i++){
                capturers.get(i).getCapturedID();
            
        %>
        <p><b>.</b><%=capturers.get(i).getCapturedID()%></p>
        <%}%>
        
        <p>Click <a href="SessionEndingServlet">here</a> to end this session </p>
    </body>
</html>
