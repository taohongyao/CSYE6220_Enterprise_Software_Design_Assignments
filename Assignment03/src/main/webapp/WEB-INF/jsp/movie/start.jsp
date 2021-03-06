<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/6/2021
  Time: 1:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to our Movie Store</title>


</head>
<body>
<h1>Welcome to our Movie Store</h1>
<form action="movie.do" method="post">
    <select name="page">
        <option value="create">Add New Movie to Database</option>
        <option value="search">Browse Movies</option>
    </select>
    <input type="submit" value="send">
</form>
</body>
</html>
