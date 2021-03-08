package com.csye6220.Assignment03.dao;

import com.csye6220.Assignment03.entity.MovieEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MovieDao {

    public int createMovie(MovieEntity movieEntity) throws SQLException {
        Connection connection = MovieDatabaseConnection.getConnection();
        Statement stmt = connection.createStatement();
        int count;
        try {


            String sql = "INSERT INTO movies " +
                    "VALUES ('" + movieEntity.getId() + "', '" + movieEntity.getTitle() + "', '" + movieEntity.getActor() + "', '" + movieEntity.getActress() +
                    "', '" + movieEntity.getGenre() + "', " + movieEntity.getYear() + ")";
            count = stmt.executeUpdate(sql);
        } finally {
            connection.close();
            stmt.close();
        }
        if (count == 0) throw new SQLException();
        return count;
    }

    public List<MovieEntity> searchByKeyword(String keyWord, String field) throws SQLException {
        Connection connection = MovieDatabaseConnection.getConnection();
        Statement stmt = connection.createStatement();
        List<MovieEntity> list = new ArrayList<>();
        try {
            ResultSet rs = stmt.executeQuery("select * from movies where " + field + " like '%" + keyWord + "%'");
            while (rs.next()) {
                MovieEntity movieEntity = new MovieEntity();
                movieEntity.setId(rs.getString(1));
                movieEntity.setTitle(rs.getString(2));
                movieEntity.setActor(rs.getString(3));
                movieEntity.setActress(rs.getString(4));
                movieEntity.setGenre(rs.getString(5));
                movieEntity.setYear(rs.getInt(6));
                list.add(movieEntity);
            }
        } finally {
            connection.close();
            stmt.close();
        }
        return list;
    }

    public List<MovieEntity> searchByTitle(String keyWord) throws SQLException {
        return searchByKeyword(keyWord, "title");
    }

    public List<MovieEntity> searchByActor(String keyWord) throws SQLException {
        return searchByKeyword(keyWord, "actor");
    }

    public List<MovieEntity> searchByActress(String keyWord) throws SQLException {
        return searchByKeyword(keyWord, "actress");
    }

    public List<MovieEntity> getAllMovies() throws SQLException {
        List<MovieEntity> list = new ArrayList<>();
        Connection connection = MovieDatabaseConnection.getConnection();
        Statement stmt = connection.createStatement();
        try {
            ResultSet rs = stmt.executeQuery("select * from movies");
            while (rs.next()) {
                MovieEntity movieEntity = new MovieEntity();
                movieEntity.setId(rs.getString(1));
                movieEntity.setTitle(rs.getString(2));
                ;
                movieEntity.setActor(rs.getString(3));
                movieEntity.setActress(rs.getString(4));
                movieEntity.setGenre(rs.getString(5));
                movieEntity.setYear(rs.getInt(6));
                list.add(movieEntity);
            }
        } finally {
            connection.close();
            stmt.close();
        }
        return list;
    }
}
