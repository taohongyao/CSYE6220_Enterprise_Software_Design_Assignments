package com.declan.Assignment02;

import org.junit.Test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Test
    public void test(){
        B b=new B();
        System.out.println("Hello World");

    }
    public void destroy() {
    }
}

abstract class A{
    public int a;
    abstract public int getA();
}

class B extends A{
    @Override
    public int getA(){
        return a;
    }
}
