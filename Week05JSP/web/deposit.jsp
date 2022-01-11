<%-- 
    Document   : deposit
    Created on : Jan 10, 2022, 7:03:22 AM
    Author     : CCK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="banner.jsp" />
        <br><br>
        <form action="Deposit" method="POST">
            Deposit Amount: <input type="text" name="x" size="10" maxlength="10" />
            <p>
                <input type="submit" value="Deposit">
            </p>
        </form>
    </body>
</html>
