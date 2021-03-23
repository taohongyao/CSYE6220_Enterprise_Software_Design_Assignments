package edu.csye6220.assignment04.declan.Assignment04.controller;

import edu.csye6220.assignment04.declan.Assignment04.util.StringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class Inject2methodController {


    @RequestMapping(method = RequestMethod.GET, path = "/part6")
    public void getUtilObject( HttpServletRequest req, HttpServletResponse resp,@Autowired StringGenerator stringGenerator) throws IOException {
        PrintWriter out=resp.getWriter();
        out.println("<html><body>");
        out.println("<h3><a href="+req.getContextPath()+">Home</a></h3>");
        out.println("<h1>Part6</h1>");
        out.println("<strong>A new object is created for each request.</strong></br>");
        out.println("Object ID:"+stringGenerator+"</br>");
        out.println("Get Method:"+stringGenerator.getRandomString());
        out.println("</body></html>");

    }
}
