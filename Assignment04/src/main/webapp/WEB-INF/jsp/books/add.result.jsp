<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/6/2021
  Time: 4:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<body>

<h1><%= request.getParameter("book_count")%> Books Added Successfully</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Isbn</th>
        <th>Title</th>
        <th>Authors</th>
        <th>Price</th>
    </tr>
    <c:forEach items="${bookEntities}" var="books">
        <tr>
            <td><c:out value="${books.id}"/></td>
            <td><c:out value="${books.isbn}"/></td>
            <td><c:out value="${books.title}"/></td>
            <td><c:out value="${books.authors}"/></td>
            <td><c:out value="${books.price}"/></td>
        </tr>
    </c:forEach>
</table>

<h3><a href="books.do">Click here to go back to the Home paper</a></h3>

</body>
</html>
