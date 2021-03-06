<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 2/17/2021
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    try (PrintWriter printWriter = response.getWriter()) {
        printWriter.println("<h1>Part 9 get info using getParameterMap()</h1>");
        Map<String,String[]> names = request.getParameterMap();
        printWriter.println("<table border=\"2\" width=\"100%\" >");
        printWriter.println("<tr>");
        for (String name:names.keySet()) {
            printWriter.println("<th>" + name + "</th>");
        }
        printWriter.println("</tr>");

        printWriter.println("<tr>");
        for (String name:names.keySet()) {
            printWriter.println("<td>" + names.get(name)[0] + "</td>");
        }
        printWriter.println("</tr>");
        printWriter.println("</table>");
    }
%>
</body>
</html>
