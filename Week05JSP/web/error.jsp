<%-- 
    Document   : error
    Created on : Jan 10, 2022, 6:14:42 AM
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
        <h1>Sorry <%= request.getParameter("x") %>, Wrong password</h1>
    </body>
</html>
