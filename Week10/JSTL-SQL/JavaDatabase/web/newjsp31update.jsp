<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 

<sql:setDataSource 
    var="data" 
    driver="org.apache.derby.jdbc.ClientDriver"     
    url="jdbc:derby://localhost:1527/sample"
    user="app"  
    password="app"/> 
    
<sql:query             
    dataSource="${data}" 
    var="result">
    SELECT * from student
</sql:query>
 
<html>
    <head>
        <title>JSP</title>
    </head>
    <body>
        <table border="1" width="100%">
            <tr>
                <th>Student Name</th>
                <th>Gender</th>
                <th>Password</th>
                <th>Balance</th>
            </tr>
            <c:forEach items="${result.rows}" var="row">
                <tr>
                    <td><c:out value="${row.id}"/></td>
                    <td><c:out value="${row.gender}"/></td>
                    <td><c:out value="${row.password}"/></td>
                    <td><c:out value="${row.balance}"/></td>
                </tr>
            </c:forEach>
        </table> 
        <br><br><br>
        Please enter the student name and the new balance.
        <br><br>
        <form action="newjsp32update.jsp">
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
                        New balance:
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
