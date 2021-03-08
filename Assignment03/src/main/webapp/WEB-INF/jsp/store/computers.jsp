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
<h1>Shop for laptops</h1>
<a href="?page=cart" class="hove">[View Cart]</a>
</br>
<form action="." method="post">

    <input type="hidden" name="action" value="input">
    <input type="hidden" name="page" value="computers">
    <c:forEach items="${items}" var="computers">
        <input type="checkbox" id="${computers.id}" name="${computers.id}" <c:if test="${computers.choose}"> checked </c:if>><label for="${computers.id}">${computers.describe}[$${computers.price}]</label></br>
    </c:forEach>

<%--    <input type="checkbox" id="compt1" name="compt1" <c:if test="${compt1}!=null"> checked </c:if>><label for="compt1">Apple MacBook Pro with 13.3" Display[$1299.99]</label>--%>
<%--    <input type="checkbox" id="compt2" name="compt2" <c:if test="${compt2}!=null"> checked </c:if>><label for="compt2">Asus Laptop[$949.95]</label>--%>
<%--    <input type="checkbox" id="compt3" name="compt3" <c:if test="${compt3}!=null"> checked </c:if>><label for="compt3">HP Pavhon Laptop with Centrino 2 DV7[$1199.95]</label>--%>
<%--    <input type="checkbox" id="compt4" name="compt4" <c:if test="${compt4}!=null"> checked </c:if>><label for="compt4">Tochba Satelite Laptop with Centriono 2 - Copper [$899.99]</label>--%>
<%--    <input type="checkbox" id="compt5" name="compt5" <c:if test="${compt5}!=null"> checked </c:if>><label for="compt5">Sony VAIO Laptop with Core 2 Duo Comopotan Pink[$779.99]</label>--%>
    <input type="submit" value="Add to Cart">
</form>
</body>
</html>
