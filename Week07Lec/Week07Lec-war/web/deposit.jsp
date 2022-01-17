<%-- 
    Document   : deposit
    Created on : Jan 11, 2022, 5:37:22 PM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit Page</title>
    </head>
    <body>
        <jsp:include page="banner.jsp"/>
        <br><br>
        <form action="Deposit" method="POST">
            Deposit amount: <input type="text" name="x" size="20">
            <p><input type="submit" value="Deposit"></p>
        </form>
    </body>
</html>
