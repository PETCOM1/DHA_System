<%-- 
    Document   : count_for_specific_outcome_c
    Created on : 23 May 2025, 11:15:26 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Total IDs Captured By Specific Capturer Page</title>
    </head>
    <body>
        <h1>Total IDs Captured By Specific Capturer</h1>
        <%
            Integer capturersID = (Integer) request.getAttribute("total");
            
        %>
        
        <p>Total IDs : <%=capturersID%></p>
        
        <p>Click <a href="SessionEndingServlet">here</a> to end this session </p>

    </body>
</html>
