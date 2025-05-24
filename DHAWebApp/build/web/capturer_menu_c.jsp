<%-- 
    Document   : capturer_menu_c
    Created on : 23 May 2025, 9:54:52 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Capturer Menu Page</title>
    </head>
    <body>
        <h1>Capturer Menu</h1>
        
        <form action="CapturerDetailsServlet" method="POST">
            
            <table border="1">
                <thead>
                    <tr>
                        <th>Capturers Details: </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="text" name="capturersName" placeholder="Capturers Name" required=""></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="capturersID" placeholder="Capturers ID" required=""></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Continue"></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
