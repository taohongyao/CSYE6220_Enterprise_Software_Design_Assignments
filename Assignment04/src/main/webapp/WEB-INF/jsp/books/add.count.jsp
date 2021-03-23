<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/6/2021
  Time: 4:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><a href="<%=request.getContextPath()%>">Home</a></h3>
<h1>How many books do you want to add?</h1>
<form action="books.do" method="post">
    <input type="number" name="book_count">
    <input type="submit" value="Submit">
</form>
</body>
</html>
