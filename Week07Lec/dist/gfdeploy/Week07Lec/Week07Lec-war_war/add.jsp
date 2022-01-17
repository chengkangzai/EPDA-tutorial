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
        <title>Add Account Page</title>
    </head>
    <body>
        <jsp:include page="banner.jsp"/>
        <br><br>
        <form action="Add" method="POST">
            Initial balance: <input type="text" name="x" size="20">
            <p><input type="submit" value="Add Account"></p>
        </form>
    </body>
</html>
