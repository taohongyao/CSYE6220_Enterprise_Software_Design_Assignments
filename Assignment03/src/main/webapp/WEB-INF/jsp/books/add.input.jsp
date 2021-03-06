<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/6/2021
  Time: 4:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="books.do" method="post">
    <input type="hidden" name="book_count" value="<%= request.getParameter("book_count")%>">
    <input type="hidden" name="action" value="input">

    <table>
        <tr>
            <th>ISBN</th>
            <th>Book Title</th>
            <th>Authors</th>
            <th>Price</th>
        </tr>
        <c:forEach var="i" begin="0" end="${param.book_count}">
            <tr>
                <td><input type="text" name="isbn"></td>
                <td><input type="text" name="book_title"></td>
                <td><input type="text" name="book_author"></td>
                <td><input type="number" step="0.01" name="book_price"></td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Add Books">
</form>
</body>
</html>
