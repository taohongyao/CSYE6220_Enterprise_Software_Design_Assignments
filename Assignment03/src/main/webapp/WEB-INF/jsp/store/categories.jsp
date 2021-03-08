<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 3/7/2021
  Time: 2:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="category">

    <a href="<%=request.getContextPath()%>">Home</a>
    <a href="?page=books">Books</a>
    <a href="?page=music">Music</a>
    <a href="?page=computers">Computers</a>
</div>
<style type="text/css">

    #category>a:hover{
        border-radius: 5px;
        color: #ff0000;
    }
    .hove:hover{
        border-radius: 5px;
        color: red;
    }
</style>

