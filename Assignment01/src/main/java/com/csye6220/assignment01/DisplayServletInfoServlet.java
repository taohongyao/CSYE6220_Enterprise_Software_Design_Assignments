package com.csye6220.assignment01;

import jakarta.servlet.FilterRegistration;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DisplayServletInfoServlet extends HttpServlet {

    private String title="Part 5 display all getX() information";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        out.println("<html><body>");
        out.println("<h1> "+title+"</h1>");
        out.println("<h3> HttpServlet Info: </h3>");
        out.println("<p> this.getLastModified(request): "+this.getLastModified(request)+"</p>");
        out.println("<h3> GenericServlet Info: </h3>");
        Enumeration<String> names=this.getInitParameterNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            out.println("<p> InitialName."+name+" <-> "+this.getInitParameter(name)+"</p>");
        }
        out.println("<p> this.getServletConfig(): "+this.getServletConfig()+"</p>");
        out.println("<p> this.getServletConfig().getServletName(): "+this.getServletConfig().getServletName()+"</p>");
        out.println("<p> this.getServletContext(): "+this.getServletContext()+"</p>");
        out.println("<p> this.getServletContext().getContextPath(): "+this.getServletContext().getContextPath()+"</p>");
        out.println("<p> this.getServletContext().getServletContextName(): "+this.getServletContext().getServletContextName()+"</p>");
        out.println("<p> this.getServletContext().getRequestCharacterEncoding(): "+this.getServletContext().getRequestCharacterEncoding()+"</p>");
        out.println("<p> this.getServletContext().getResponseCharacterEncoding(): "+this.getServletContext().getResponseCharacterEncoding()+"</p>");
        out.println("<p> this.getServletContext().getServerInfo(): "+this.getServletContext().getServerInfo()+"</p>");
        out.println("<p> this.getServletContext().getVirtualServerName(): "+this.getServletContext().getVirtualServerName()+"</p>");
        out.println("<p> this.getServletContext().getClassLoader(): "+this.getServletContext().getClassLoader()+"</p>");
        out.println("<p> this.getServletContext().getClass(): "+this.getServletContext().getClass()+"</p>");
        out.println("<p> this.getServletContext().getEffectiveMajorVersion(): "+this.getServletContext().getEffectiveMajorVersion()+"</p>");
        out.println("<p> this.getServletContext().getEffectiveMinorVersion(): "+this.getServletContext().getEffectiveMinorVersion()+"</p>");
        out.println("<p> this.getServletContext().getSessionCookieConfig(): "+this.getServletContext().getSessionCookieConfig()+"</p>");
        out.println("<p> this.getServletContext().getJspConfigDescriptor(): "+this.getServletContext().getJspConfigDescriptor()+"</p>");
        out.println("<p> this.getServletContext().getAttributeNames(): "+this.getServletContext().getAttributeNames()+"</p>");
        names=this.getServletContext().getAttributeNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            out.println("<p> this.getServletContext().getAttributeNames(): "+name+" <-> "+this.getServletContext().getAttribute(name)+"</p>");
        }
        out.println("<p> this.getServletContext(): "+this.getServletContext().getFilterRegistrations()+"</p>");
        Map map=this.getServletContext().getFilterRegistrations();
        Set<String> keys= map.keySet();
        Iterator<String> iterator=keys.iterator();
        while (iterator.hasNext()){
            String object=iterator.next();
            out.println("<p> this.getServletContext(): "+object+".getUrlPatternMappings() <-> "+this.getServletContext().getFilterRegistration(object).getUrlPatternMappings()+"</p>");
            out.println("<p> this.getServletContext(): "+object+".getServletNameMappings() <-> "+this.getServletContext().getFilterRegistration(object).getServletNameMappings()+"</p>");
        }
        out.println("<p> this.getServletContext(): "+this.getServletContext()+"</p>");
        out.println("<p> this.getServletInfo(): "+this.getServletInfo()+"</p>");
        out.println("</body></html>");

    }
}
