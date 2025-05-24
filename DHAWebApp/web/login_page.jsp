<%-- 
    Document   : login_page
    Created on : 24 May 2025, 2:17:17 AM
    Author     : Munzhedzi Munyadziwa Petrus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="j_security_check" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th>Login Credentials: </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="text" name="j_username" placeholder="Username" required=""></td>
                    </tr>
                    <tr>
                        <td><input type="password" name="j_password" placeholder="Password" required=""></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login"></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
