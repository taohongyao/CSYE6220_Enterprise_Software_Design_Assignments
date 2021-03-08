<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/7/2021
  Time: 2:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:include page="categories.jsp"></jsp:include>

<h1>Shop for books</h1>
<a href="?page=cart" class="hove">[View Cart]</a>
</br>
<form action="." method="post">
    <input type="hidden" name="action" value="input">
    <input type="hidden" name="page" value="books">
    <c:forEach items="${items}" var="books">
        <input type="checkbox" id="${books.id}" name="${books.id}" <c:if test="${books.choose}"> checked </c:if>><label for="${books.id}">${books.describe}[$${books.price}]</label></br>
    </c:forEach>
<%--    <input type="checkbox" id="book1" name="book1" <c:if test="${book1}!=null"> checked </c:if>><label for="book1">Java Servlet Programming[$29.95]</label>--%>
<%--    <input type="checkbox" id="book2" name="book2" <c:if test="${book2}!=null"> checked </c:if>><label for="book2">Oracle Database Programming[$48.95]</label>--%>
<%--    <input type="checkbox" id="book3" name="book3" <c:if test="${book3}!=null"> checked </c:if>><label for="book3">System Analysis and Design[$14.95]</label>--%>
<%--    <input type="checkbox" id="book4" name="book4" <c:if test="${book4}!=null"> checked </c:if>><label for="book4">Object Oriented Software Engineering[$35.99]</label>--%>
<%--    <input type="checkbox" id="book5" name="book5" <c:if test="${book5}!=null"> checked </c:if>><label for="book5">Java Web Services[$27.99]</label>--%>
    <input type="submit" value="Add to Cart">
</form>
</body>
</html>
