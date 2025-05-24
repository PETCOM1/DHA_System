<%-- 
    Document   : get_total_ids_m
    Created on : 23 May 2025, 11:06:06 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Total IDs OF Specific Capturer Page</title>
    </head>
    <body>
        <h1>Total IDs OF Specific Capturer: </h1>
        <form action="TotalOfSpecific" method="POST">
            
            <table border="1">
                <thead>
                    <tr>
                        <th>Capturers Details: </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="text" name="capturersID" placeholder="Capturers ID" required=""></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Count"></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
