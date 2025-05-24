<%-- 
    Document   : start_capturing_c
    Created on : 23 May 2025, 10:03:29 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Capturing Page Page</title>
    </head>
    <body>
        <h1>Start Capturing</h1>
        <form action="CaptureID" method="POST">
            
            <table border="1">
                <thead>
                    <tr>
                        <th>Capture ID </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="text" name="requestID" placeholder="ID" required=""></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Capture"></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
