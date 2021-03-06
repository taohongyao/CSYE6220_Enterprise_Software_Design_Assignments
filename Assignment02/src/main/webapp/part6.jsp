<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 2/17/2021
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Part 6 Form Info</h1>
<table border="2" width="100%">
    <tr>
        <th>email</th>
        <th>password</th>
        <th>confirm_password</th>
        <th>filename</th>
        <th>gender</th>
        <th>country</th>
        <th>cricket</th>
        <th>football</th>
        <th>address</th>
    </tr>
    <tr>
        <td>${param.email}</td>
        <td>${param.password}</td>
        <td>${param.confirm_password}</td>
        <td>${param.filename}</td>
        <td>${param.gender}</td>
        <td>${param.country}</td>
        <td>${param.cricket}</td>
        <td>${param.football}</td>
        <td>${param.address}</td>
    </tr>
</table>

</body>
</html>
