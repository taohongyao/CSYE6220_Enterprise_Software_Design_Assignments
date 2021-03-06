<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 2/17/2021
  Time: 7:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>CSV</title>
</head>
<body>

<h1>Part 4 read xml</h1>
<form action="part4" method="post">
    <a>File Name:<input type="text" name="file_name"></a>
    <input type="submit" value="submit">
</form>

<table border="2" width="100%">
    <tr>
        <th>Facility_Type</th>
        <th>License_Number</th>
        <th>Entity_Name</th>
        <th>Camis_Trade_Name</th>
        <th>Address_Bldg</th>
        <th>Address_Street_Name</th>
        <th>Address_Location</th>
        <th>Address_City</th>
        <th>Address_State</th>
        <th>Address_Zip_Code</th>
        <th>Telephone_Number</th>
        <th>Number_of_Spaces</th>
    </tr>
    <c:forEach var="table" items="${data}">
        <tr>
            <td><c:out value="${table.getFacility_Type()}"/></td>
            <td><c:out value="${table.getLicense_Number()}"/></td>
            <td><c:out value="${table.getEntity_Name()}"/></td>
            <td><c:out value="${table.getCamis_Trade_Name()}"/></td>
            <td><c:out value="${table.getAddress_Bldg()}"/></td>
            <td><c:out value="${table.getAddress_Street_Name()}"/></td>
            <td><c:out value="${table.getAddress_Location()}"/></td>
            <td><c:out value="${table.getAddress_City()}"/></td>
            <td><c:out value="${table.getAddress_State()}"/></td>
            <td><c:out value="${table.getAddress_Zip_Code()}"/></td>
            <td><c:out value="${table.getTelephone_Number()}"/></td>
            <td><c:out value="${table.getNumber_of_Spaces()}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
