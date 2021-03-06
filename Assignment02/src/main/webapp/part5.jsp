<%@ page import="java.io.File" %>
<%@ page import="java.util.Scanner" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.FileInputStream" %>
<%@ page import="org.apache.poi.ss.usermodel.Workbook" %>
<%@ page import="org.apache.poi.hssf.usermodel.HSSFWorkbook" %>
<%@ page import="org.apache.poi.ss.usermodel.Sheet" %>
<%@ page import="org.apache.poi.ss.usermodel.Row" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="org.apache.poi.ss.usermodel.Cell" %><%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 2/18/2021
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    ServletContext servletContext = request.getServletContext();
    String contextPath = servletContext.getRealPath("/");
    String excelFilePath=contextPath+"WEB-INF\\file\\store.xls";
    FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
    Workbook workbook = new HSSFWorkbook(inputStream);
    Sheet firstSheet = workbook.getSheetAt(0);
    Iterator<Row> iterator = firstSheet.iterator();
    out.println("<h1>Part5 XML read</h1>");
    out.println("<table border=\"2\" width=\"100%\">\n");

    while (iterator.hasNext()) {
        Row nextRow = iterator.next();
        Iterator<Cell> cellIterator = nextRow.cellIterator();
        out.println("<tr>");
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            out.println("<td>");
            out.println(cell.toString());
            out.println("</td>");
        }
        out.println("</tr>");
    }
    out.println("</table>");

    workbook.close();
    inputStream.close();


%>
</body>
</html>
