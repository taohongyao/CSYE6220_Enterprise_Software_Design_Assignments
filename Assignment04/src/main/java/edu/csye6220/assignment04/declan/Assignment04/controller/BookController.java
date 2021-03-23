package edu.csye6220.assignment04.declan.Assignment04.controller;


import edu.csye6220.assignment04.declan.Assignment04.dao.BookDao;
import edu.csye6220.assignment04.declan.Assignment04.entity.BookEntity;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookController extends AbstractController {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
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
                    bookDao.createAllBooksByPreStatement(list);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                    return new ModelAndView("books/add.input");
                }
                ModelAndView modelAndView=new ModelAndView("books/add.result");

                modelAndView.addObject("bookEntities",bookDao.getAllBooks());
                return modelAndView;
            }
            return new ModelAndView("books/add.input");
        }
        return new ModelAndView("books/add.count");
    }
}
