<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/7/2021
  Time: 9:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="mytag" uri="/WEB-INF/tag/custom.tld"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=request.getContextPath()%>">Home</a>
<h1>Part 4 read xml</h1>

<form action="." method="post">
    <a>File Name:<input type="text" name="file_name" value="parking_facilities"></a>
    <input type="submit" value="submit">
</form>
<mytag:csv fileName="${file_name}"/>

</body>
</html>
