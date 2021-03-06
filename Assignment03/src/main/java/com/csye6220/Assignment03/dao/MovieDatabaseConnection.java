package com.csye6220.Assignment03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieDatabaseConnection {

    private static String url="jdbc:mysql://csye6220.cescutkteuwz.us-east-1.rds.amazonaws.com/moviedb";
    private static String user="declan";
    private static String password="123456cs";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url+"?" +
                    "user="+user+"&password="+password);
    }

    public static Statement createStatement() throws SQLException {
        return getConnection().createStatement();
    }
}
