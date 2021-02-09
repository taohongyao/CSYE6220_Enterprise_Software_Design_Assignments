package com.csye6220.assignment01;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class GetFormServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Part3 do get </h1>");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Part 3 get post input </h1>");
        out.println("<p> Email: "+request.getParameter("email")+"</p>");
        out.println("<p> Password: "+request.getParameter("password")+"</p>");
        out.println("<p> Confirm Password: "+request.getParameter("confirm_password")+"</p>");
        out.println("<p> FileName: "+request.getParameter("filename")+"</p>");
        out.println("<p> Gender: "+request.getParameter("gender")+"</p>");
        out.println("<p> Country: "+request.getParameter("country")+"</p>");
        out.println("<p> Hobby.cricket: "+request.getParameter("cricket")+"</p>");
        out.println("<p> Hobby.football: "+request.getParameter("football")+"</p>");
        out.println("<p> Address: "+request.getParameter("address")+"</p>");

        out.println("</body></html>");
    }

}
