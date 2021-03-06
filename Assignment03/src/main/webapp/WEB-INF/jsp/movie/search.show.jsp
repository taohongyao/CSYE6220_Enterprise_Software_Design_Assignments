<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/6/2021
  Time: 1:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

You searched for <%=request.getParameter("key_word")%>

<h4>Here are the search results</h4>



<table>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Movie Actor</th>
        <th>Movie Actress</th>
        <th>Genre</th>
        <th>Year</th>
    </tr>
<c:forEach items="${resultList}" var="movie">

    <tr>
        <td><c:out value="${movie.id}"/></td>
        <td><c:out value="${movie.title}"/></td>
        <td><c:out value="${movie.actor}"/></td>
        <td><c:out value="${movie.actress}"/></td>
        <td><c:out value="${movie.genre}"/></td>
        <td><c:out value="${movie.year}"/></td>

    </tr>

</c:forEach>
</table>

<a href="movie.do">Click here to go back to the main paper</a>


</body>
</html>
