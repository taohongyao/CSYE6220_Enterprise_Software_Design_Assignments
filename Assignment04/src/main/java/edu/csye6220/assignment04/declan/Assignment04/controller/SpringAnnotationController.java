package edu.csye6220.assignment04.declan.Assignment04.controller;

import edu.csye6220.assignment04.declan.Assignment04.util.StringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class SpringAnnotationController {
    @Autowired
    private StringGenerator stringGenerator;

    @RequestMapping(method = RequestMethod.GET, path = "/part5")
    public void getUtilObject( HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out=resp.getWriter();
        out.println("<html><body>");
        out.println("<h3><a href="+req.getContextPath()+">Home</a></h3>");
        out.println("<h1>Part5</h1>");
        out.println("<strong>The same object shared by all user requests.</strong></br>");
        out.println("Object ID:"+stringGenerator+"</br>");
        out.println("Get Method:"+stringGenerator.getRandomString());
        out.println("</body></html>");
    }
}
