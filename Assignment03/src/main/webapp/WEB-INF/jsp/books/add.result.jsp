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

<h1><%= request.getParameter("book_count")%> Books Added Successfully</h1>

<a href="books.do">Click here to go back to the Home paper</a>

</body>
</html>
