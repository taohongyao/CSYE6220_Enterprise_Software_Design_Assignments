package com.csye6220.Assignment03.controller;

import com.csye6220.Assignment03.dao.BookDao;
import com.csye6220.Assignment03.dao.MovieDao;
import com.csye6220.Assignment03.entity.BookEntity;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookController extends HttpServlet {
    BookDao bookDao;

    @Override
    public void init() throws ServletException {
        super.init();
        bookDao = new BookDao();
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("book_count");
        if(page!=null&&Integer.parseInt(page)>0){
            String action=req.getParameter("action");
            if(action!=null&&action.equals("input")){
                List<BookEntity> list=new ArrayList<>();
                String[] isbn=req.getParameterValues("isbn");
                String[] titles=req.getParameterValues("book_title");
                String[] authors=req.getParameterValues("book_author");
                String[] prices=req.getParameterValues("book_price");
                for (int i=0;i<Integer.parseInt(page);i++){
                    BookEntity bookEntity=new BookEntity();
                    bookEntity.setIsbn(isbn[i]);
                    bookEntity.setTitle(titles[i]);
                    bookEntity.setAuthors(authors[i]);
                    bookEntity.setPrice(Float.parseFloat(prices[i].replace(" ","")));
                    list.add(bookEntity);
                }
                try {
                    bookDao.createBooks(list);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                    System.out.println("Throw");
                    RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/books/add.input.jsp");
                    requestDispatcher.forward(req,resp);
                }


                RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/books/add.result.jsp");
                requestDispatcher.forward(req,resp);

            }
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/books/add.input.jsp");
            requestDispatcher.forward(req,resp);
        }
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/books/add.count.jsp");
        requestDispatcher.forward(req,resp);
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
