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

<form action="movie.do" method="post">
    <input type="hidden" name="action" value="search">
    <input type="hidden" name="page" value="search">

    <label> Keyword </label>
    <input type="text" name="key_word">

    <label><input value="title" type="radio" name="search_field" checked="checked" />Search By Movie Title</label>
    <label><input value="actor" type="radio" name="search_field"/>Search By Movie Actor</label>
    <label><input value="actress" type="radio" name="search_field"/>Search By Movie Actress</label>

    <input type="submit" value="Search">
</form>

</body>
</html>
