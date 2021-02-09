package com.csye6220.assignment01;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class DisplayRequestInfoServlet extends HttpServlet {

    private String title="Part 6 display all request getX() information";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        out.println("<html><body>");
        out.println("<h1> "+title+"</h1>");
        out.println("<h3> HttpRequest: </h3>");

        out.println("<p> request.getAuthType(): "+request.getAuthType()+"</p>");
        out.println("<p> request.getContextPath(): "+request.getContextPath()+"</p>");
        out.println("<p> request.getCookies(): "+request.getCookies()+"</p>");


        Enumeration<String> names=request.getHeaderNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            out.println("<p> request.getHeader(name): "+name+" <-> "+request.getHeader(name)+"</p>");
        }


        out.println("<p> request.getHttpServletMapping(): "+request.getHttpServletMapping()+"</p>");
        out.println("<p> request.getMethod(): "+request.getMethod()+"</p>");
//        try {
//            out.println("<p> request.getParts(): "+request.getParts()+"</p>");
//        } catch (ServletException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Collection<Part> parts=request.getParts();
//            Iterator<Part> iterator=parts.iterator();
//            while (iterator.hasNext()){
//                Part part=iterator.next();
//                out.println("<p> request.getParts(): "+part+"</p> ");
//            }
//        } catch (ServletException e) {
//            e.printStackTrace();
//        }


        out.println("<p> request.getPathInfo(): "+request.getPathInfo()+"</p>");
        out.println("<p> request.getPathTranslated(): "+request.getPathTranslated()+"</p>");
        out.println("<p> request.getQueryString(): "+request.getQueryString()+"</p>");
        out.println("<p> request.getRemoteUser(): "+request.getRemoteUser()+"</p>");
        out.println("<p> request.getRequestedSessionId(): "+request.getRequestedSessionId()+"</p>");
        out.println("<p> request.getRequestURI(): "+request.getRequestURI()+"</p>");
        out.println("<p> request.getRequestURL(): "+request.getRequestURL()+"</p>");
        out.println("<p> request.getServletPath(): "+request.getServletPath()+"</p>");
        out.println("<p> request.getSession(): "+request.getSession()+"</p>");
        out.println("<p> request.getTrailerFields(): "+request.getTrailerFields()+"</p>");
        out.println("<p> request.getUserPrincipal(): "+request.getUserPrincipal()+"</p>");


        out.println("<h3> ServletRequest: </h3>");
//        out.println("<p> request.getAsyncContext(): "+request.getAsyncContext()+"</p>");
        out.println("<p> request: "+request.getAttributeNames()+"</p>");
        names=request.getAttributeNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            out.println("<p> request.getAttribute: "+name+" <-> "+request.getAttribute(name)+"</p>");
        }

        out.println("<p> request.getCharacterEncoding(): "+request.getCharacterEncoding()+"</p>");
        out.println("<p> request.getContentLength(): "+request.getContentLength()+"</p>");
        out.println("<p> request.getContentLengthLong(): "+request.getContentLengthLong()+"</p>");
        out.println("<p> request.getContentType(): "+request.getContentType()+"</p>");
        out.println("<p> request.getInputStream(): "+request.getInputStream()+"</p>");
        out.println("<p> request.getLocalAddr(): "+request.getLocalAddr()+"</p>");
        out.println("<p> request.getLocale(): "+request.getLocale()+"</p>");
        out.println("<p> request.getLocalName(): "+request.getLocalName()+"</p>");
        out.println("<p> request.getLocalPort(): "+request.getLocalPort()+"</p>");
        out.println("<p> request: "+request.getParameterMap()+"</p>");
        Map<String,String[]> map=request.getParameterMap();
        Set<String> set=map.keySet();
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            out.println("<p> request.getParameterMap(): key <--> "+map.get(key)+"</p>");
        }
        out.println("<p> request.getParameterNames(): "+request.getParameterNames()+"</p>");
        out.println("<p> request.getProtocol(): "+request.getProtocol()+"</p>");
//        out.println("<p> request.getReader(): "+request.getReader()+"</p>");
        out.println("<p> request.getRemoteAddr(): "+request.getRemoteAddr()+"</p>");
        out.println("<p> request.getRemoteHost(): "+request.getRemoteHost()+"</p>");
        out.println("<p> request.getRemotePort(): "+request.getRemotePort()+"</p>");
        out.println("<p> request.getScheme(): "+request.getScheme()+"</p>");
        out.println("<p> request.getServerName(): "+request.getServerName()+"</p>");
        out.println("<p> request.getServerPort(): "+request.getServerPort()+"</p>");
        out.println("<p> request.getServletContext(): "+request.getServletContext()+"</p>");



        out.println("</body></html>");



    }
}
