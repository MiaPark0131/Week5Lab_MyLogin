<%-- 
    Document   : login
    Created on : 4-Oct-2022, 11:47:47 AM
    Author     : meeye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log in</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username: <input type="text" name="username"><br>
            Password: <input type="text" name="pasword"><br>
            <input type="submit" value="Log in">
        </form>
    </body>
</html>
