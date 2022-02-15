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
        Please enter the student name.
        <br><br>
        <form action="newjsp42delete.jsp">
            Student Name:
            <input type="text" name="name" size="20">
            <p>
                <input type="submit" value="Submit">
            </p>
        </form>        
    </body>
</html>
