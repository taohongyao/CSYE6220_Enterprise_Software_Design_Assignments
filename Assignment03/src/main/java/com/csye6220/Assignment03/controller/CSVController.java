package com.csye6220.Assignment03.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CSVController extends HttpServlet {
    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName=req.getParameter("file_name");
        req.setAttribute("file_name",fileName);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/csv/readCSV.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }
}
