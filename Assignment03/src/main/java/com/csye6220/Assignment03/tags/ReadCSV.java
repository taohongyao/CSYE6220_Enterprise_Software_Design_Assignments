package com.csye6220.Assignment03.tags;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV extends SimpleTagSupport {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if(fileName==null) return;
        PageContext pageContext = (PageContext) getJspContext();
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
        String contextPath =request.getServletContext().getRealPath("/");

        final JspWriter out = getJspContext().getOut();
        String directory=contextPath+"WEB-INF\\file";
        try {
            Class.forName("org.relique.jdbc.csv.CsvDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:relique:csv:" + directory;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM "+ fileName);
            int columnCount=results.getMetaData().getColumnCount();
            List<List<String>> list=new ArrayList<>();
            List<String> columnNames=new ArrayList<>();
            for (int i=1;i<=columnCount;i++){
                columnNames.add(results.getMetaData().getColumnName(i));
            }
            while(results.next()){
                List<String> lineList=new ArrayList<>();
                for(int i=1;i<=columnCount;i++){
                    lineList.add(results.getString(i));
                }
                list.add(lineList);
            }
            conn.close();
            // output data;
            out.println("<table>");
            out.println("<tr>");
            for (String column:columnNames){
                out.println("<th>"+column+"</th>");
            }
            out.println("</tr>");
            for (List<String> line:list){
                out.println("<tr>");
                for(String data:line){
                    out.println("<td>"+data+"</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
