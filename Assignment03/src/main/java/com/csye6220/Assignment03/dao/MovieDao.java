package com.csye6220.Assignment03.dao;

import com.csye6220.Assignment03.entity.MovieEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MovieDao {

    public int createMovie(MovieEntity movieEntity) throws SQLException {
        Statement stmt =MovieDatabaseConnection.createStatement();
        String sql = "INSERT INTO movies " +
                "VALUES ('"+movieEntity.getId()+"', '"+movieEntity.getTitle()+"', '"+movieEntity.getActor()+"', '"+movieEntity.getActress()+
        "', '"+movieEntity.getGenre()+"', "+movieEntity.getYear()+")";
        int count=stmt.executeUpdate(sql);
        if (count==0) throw new SQLException();
        return count;
    }

    public List<MovieEntity> searchByKeyword(String keyWord,String field) throws SQLException {
        Statement stmt = MovieDatabaseConnection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from movies where "+field+" like '%"+keyWord+"%'");
        List<MovieEntity> list=new ArrayList<>();
        while (rs.next()){
            MovieEntity movieEntity=new MovieEntity();
            movieEntity.setId(rs.getString(1));
            movieEntity.setTitle(rs.getString(2));;
            movieEntity.setActor(rs.getString(3));
            movieEntity.setActress(rs.getString(4));
            movieEntity.setGenre(rs.getString(5));
            movieEntity.setYear(rs.getInt(6));
            list.add(movieEntity);
        }
        return list;
    }

    public List<MovieEntity> searchByTitle(String keyWord) throws SQLException {
        return searchByKeyword(keyWord,"title");
    }
    public List<MovieEntity> searchByActor(String keyWord) throws SQLException {
        return searchByKeyword(keyWord,"actor");
    }
    public List<MovieEntity> searchByActress(String keyWord) throws SQLException {
        return searchByKeyword(keyWord,"actress");
    }

    public List<MovieEntity> getAllMovies() throws SQLException {
        List<MovieEntity> list=new ArrayList<>();
        Statement stmt = MovieDatabaseConnection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from movies");
        while (rs.next()){
            MovieEntity movieEntity=new MovieEntity();
            movieEntity.setId(rs.getString(1));
            movieEntity.setTitle(rs.getString(2));;
            movieEntity.setActor(rs.getString(3));
            movieEntity.setActress(rs.getString(4));
            movieEntity.setGenre(rs.getString(5));
            movieEntity.setYear(rs.getInt(6));
            list.add(movieEntity);
        }
        return list;
    }
}
