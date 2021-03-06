<%@ page import="java.util.Enumeration" %>
<%@ page import="java.io.PrintWriter" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    PrintWriter printWriter=response.getWriter();
    printWriter.println("<h1>Part 7</h1>");
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
