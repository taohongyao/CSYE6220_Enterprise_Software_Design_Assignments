<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/7/2021
  Time: 2:56 AM
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
<h1>Store Cart</h1>
</br>
<c:forEach items="${checkedItems}" var="item">
    <label>- ${item.describe}[$${item.price}]</label></br>
</c:forEach>

<a href="?page=books" class="hove">[Go to Books Page]</a>
<a href="?page=music" class="hove">[Go to Music Page]</a>
<a href="?page=computers" class="hove">[Go to Computers Page]</a>
</body>
</html>
