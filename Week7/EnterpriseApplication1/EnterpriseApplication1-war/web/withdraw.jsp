<%-- 
    Document   : withdraw
    Created on : Jan 17, 2022, 8:09:44 PM
    Author     : CCK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Withdraw Page</title>
    </head>
    <body>
         <jsp:include page="banner.jsp"/>
        <br><br>
        <form action="Withdraw" method="POST">
            Deposit amount: <input type="text" name="x" size="20">
            <p><input type="submit" value="Deposit"></p>
        </form>
    </body>
</html>
