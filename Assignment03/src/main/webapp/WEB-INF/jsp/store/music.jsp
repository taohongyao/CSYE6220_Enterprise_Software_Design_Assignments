<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/7/2021
  Time: 2:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="categories.jsp"></jsp:include>
<h1>Shop for music</h1>
<a href="?page=cart" class="hove">[View Cart]</a>
</br>
<form action="." method="post">
    <input type="hidden" name="action" value="input">
    <input type="hidden" name="page" value="music">
    <c:forEach items="${items}" var="music">
        <input type="checkbox" id="${music.id}" name="${music.id}" <c:if test="${music.choose}"> checked </c:if>><label for="${music.id}">${music.describe}[$${music.price}]</label></br>
    </c:forEach>
<%--    <input type="checkbox" id="music1" name="music1" <c:if test="${music1}!=null"> checked </c:if>><label for="music1">I'm Going to Tell You a Secret by Madonna[$26.99]</label>--%>
<%--    <input type="checkbox" id="music2" name="music2" <c:if test="${music2}!=null"> checked </c:if>><label for="music2">Baby One More Time by Bntney Spears[$10.95]</label>--%>
<%--    <input type="checkbox" id="music3" name="music3" <c:if test="${music3}!=null"> checked </c:if>><label for="music3">justified by justin timberlake[$9.97]</label>--%>
<%--    <input type="checkbox" id="music4" name="music4" <c:if test="${music4}!=null"> checked </c:if>><label for="music4">Loose by Nelly Furtado[$13.98]</label>--%>
<%--    <input type="checkbox" id="music5" name="music5" <c:if test="${music5}!=null"> checked </c:if>><label for="music5">Gold Digger by Kanye West[$27.99]</label>--%>
    <input type="submit" value="Add to Cart">
</form>
</body>
</html>
