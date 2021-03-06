<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 2/17/2021
  Time: 10:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Part 8</title>
</head>
<body>



<%
    PrintWriter printWriter=response.getWriter();
    printWriter.println("<h1>Part 8 get info using request.getParameter()</h1>");
    Enumeration<String> names=request.getParameterNames();
    printWriter.println("<table border=\"2\" width=\"100%\" >");
    printWriter.println("<tr>");
    while (names.hasMoreElements()){
        String name=names.nextElement();
        printWriter.println("<th>"+name+"</th>");
    }
    printWriter.println("</tr>");

    printWriter.println("<tr>");
    names=request.getParameterNames();
    while (names.hasMoreElements()){
        String name=names.nextElement();
        String value=request.getParameter(name);
        printWriter.println( "<td>"+value+"</td>" );
    }
    printWriter.println("</tr>");
    printWriter.println("</table>");
%>

</body>
</html>
