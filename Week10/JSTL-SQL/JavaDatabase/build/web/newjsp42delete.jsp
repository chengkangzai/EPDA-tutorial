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
    WHERE id = '${param.name}'
</sql:query>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${result.rowCount == 0}">
                Sorry, no students were found.
            </c:when>
            <c:otherwise>
                <sql:update 
                    dataSource="${data}" 
                    var="new">
                    DELETE FROM student WHERE id = '${param.name}'
                </sql:update>
                <sql:query 
                    dataSource="${data}" 
                    var="result">
                    SELECT * from student
                </sql:query>                    
                The following students were found:<br><br>
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
            </c:otherwise>
        </c:choose>
    </body>
</html>
