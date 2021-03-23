package edu.csye6220.assignment04.declan.Assignment04.controller;


import edu.csye6220.assignment04.declan.Assignment04.dao.MovieDao;
import edu.csye6220.assignment04.declan.Assignment04.entity.MovieEntity;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class MovieController extends AbstractController {

    private MovieDao movieDao;

    public void setMovieDao(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String page = req.getParameter("page");
        ModelAndView model=null;
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
                        model=new ModelAndView("movie/create");
                        return model;
                    }
                    model=new ModelAndView("movie/create.back");
                    return model;
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                    model=new ModelAndView("movie/create");
                    return model;
                }
            } else {
                model=new ModelAndView("movie/create");
                return model;
            }
        } else if (page != null && page.equals("search")) {
            String action = req.getParameter("action");
            try {
                if (action != null && action.equals("search")) {
                    String field = req.getParameter("search_field");
                    String keyWord = req.getParameter("key_word");
                    if (field != null && keyWord != null) {
                        model=new ModelAndView("movie/search.show");
                        List<MovieEntity> list=null;
                        if (field.equals("title")) {
                            list = movieDao.searchByTitle(keyWord);
                        } else if (field.equals("actor")) {
                            list = movieDao.searchByActor(keyWord);
                        } else if (field.equals("actress")) {
                            list = movieDao.searchByActress(keyWord);
                        }
                        model.addObject("resultList",list);
                        return model;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                model=new ModelAndView("movie/search");
                return model;
            }
            model=new ModelAndView("movie/search");
            return model;
        } else {
            model=new ModelAndView("movie/start");
            return model;
        }
    }
}
