<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/6/2021
  Time: 1:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Please enter the details belows</h1>

<form action="movie.do" method="post">
    <input type="hidden" name="action" value="create">
    <input type="hidden" name="page" value="create">
    <label> Movie Title</label>
    <input type="text" name="title">
    <label> Movie Actor</label>
    <input type="text" name="actor">
    <label> Movie Actress</label>
    <input type="text" name="actress">
    <label> Genre</label>
    <input type="text" name="genre">
    <label> Year</label>
    <input type="text" name="year">
    <input type="submit" value="Add Movie">
</form>

</body>
</html>
