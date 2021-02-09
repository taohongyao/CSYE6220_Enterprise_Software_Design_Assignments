package com.csye6220.assignment01;

import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.http.*;

public class GetHeaderServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Part 2 get httpheaders";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        HttpServletRequestWrapper httpServletRequestWrapper=new HttpServletRequestWrapper(request);
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        Enumeration<String> names=httpServletRequestWrapper.getHeaderNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            String value=httpServletRequestWrapper.getHeader(name);
            out.println("<p>"+name+": "+value+"</p>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}