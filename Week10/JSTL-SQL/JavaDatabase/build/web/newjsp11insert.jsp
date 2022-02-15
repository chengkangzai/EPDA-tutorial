<%-- 
    Document   : newjsp31insert
    Created on : Apr 17, 2017, 6:33:25 PM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="newjsp12insert.jsp">
            <table>
                <tr>
                    <td>
                        Student Name:
                    </td> 
                    <td>
                        <input type="text" name="name" size="20">
                    </td>
                </tr>
                <tr>
                    <td>
                        Gender:
                    </td> 
                    <td>
                        <input type="text" name="gender" size="20">
                    </td>
                </tr>
                <tr>
                    <td>
                        Password:
                    </td> 
                    <td>
                        <input type="text" name="password" size="20">
                    </td>
                </tr>
                <tr>
                    <td>
                        Balance:
                    </td> 
                    <td>
                        <input type="text" name="balance" size="20">
                    </td>
                </tr>
            </table>
            <p>
                <input type="submit" value="Submit">
            </p>
        </form>
    </body>
</html>
