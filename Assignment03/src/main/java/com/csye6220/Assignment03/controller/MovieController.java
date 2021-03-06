package com.csye6220.Assignment03.controller;

import com.csye6220.Assignment03.dao.MovieDao;
import com.csye6220.Assignment03.entity.MovieEntity;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class MovieController extends HttpServlet {

    MovieDao movieDao;

    @Override
    public void init() throws ServletException {
        super.init();
        movieDao = new MovieDao();
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("page");
        if (page != null && page.equals("create")) {
            String action = req.getParameter("action");
            if (action != null && action.equals("create")) {
                System.out.println("create");
                MovieEntity movieEntity = new MovieEntity();
                movieEntity.setTitle(req.getParameter("title"));
                movieEntity.setActor(req.getParameter("actor"));
                movieEntity.setActress(req.getParameter("actress"));
                movieEntity.setGenre(req.getParameter("genre"));
                movieEntity.setYear(Integer.parseInt(req.getParameter("year")));
                try {
                    int size = movieDao.createMovie(movieEntity);
                    if (size == 0) {
                        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/movie/create.jsp");
                        requestDispatcher.forward(req, resp);
                    }
                    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/movie/create.back.jsp");
                    requestDispatcher.forward(req, resp);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/movie/create.jsp");
                    requestDispatcher.forward(req, resp);
                }
            } else {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/movie/create.jsp");
                requestDispatcher.forward(req, resp);
            }

        } else if (page != null && page.equals("search")) {
            String action = req.getParameter("action");
            try {
                if (action != null && action.equals("search")) {
                    String field = req.getParameter("search_field");
                    String keyWord = req.getParameter("key_word");
                    if (field != null && keyWord != null) {
                        if (field.equals("title")) {
                            List<MovieEntity> list = movieDao.searchByTitle(keyWord);
                            req.setAttribute("resultList",list);
                        } else if (field.equals("actor")) {
                            List<MovieEntity> list = movieDao.searchByActor(keyWord);
                            req.setAttribute("resultList",list);
                        } else if (field.equals("actress")) {
                            List<MovieEntity> list = movieDao.searchByActress(keyWord);
                            req.setAttribute("resultList",list);
                        }
                        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/movie/search.show.jsp");
                        requestDispatcher.forward(req, resp);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/movie/search.jsp");
                requestDispatcher.forward(req, resp);
            }
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/movie/search.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/movie/start.jsp");
            requestDispatcher.forward(req, resp);
        }
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
