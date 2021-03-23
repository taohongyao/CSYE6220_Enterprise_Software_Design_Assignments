package edu.csye6220.assignment04.declan.Assignment04.dao;

import java.sql.*;
import java.util.function.Consumer;

public class BookDatabaseConnection {

    private static String url="jdbc:mysql://csye6220.cescutkteuwz.us-east-1.rds.amazonaws.com/booksdb";
    private static String user="declan";
    private static String password="123456cs";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static int update(String sql,Consumer<PreparedStatement> setingFunction) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        setingFunction.accept(stmt);
        int count;
        try {
            count = stmt.executeUpdate();
        } finally {
            connection.close();
            stmt.close();
        }
        if (count == 0) throw new SQLException();
        return count;
    }

    public static int update(String sql) throws SQLException {
        Connection connection = getConnection();
        Statement stmt = connection.createStatement();
        int count;
        try {
            count = stmt.executeUpdate(sql);
        } finally {
            connection.close();
            stmt.close();
        }
        if (count == 0) throw new SQLException();
        return count;
    }

    public static ResultSet search(String sql, Consumer<ResultSet> function) throws SQLException {
        Connection connection = getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs =null;
        try {
            rs = stmt.executeQuery(sql);
            function.accept(rs);
        } finally {
            connection.close();
            stmt.close();
        }
        return rs;
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url+"?" +
                "user="+user+"&password="+password);
    }

    public static Statement createStatement() throws SQLException {
        return getConnection().createStatement();
    }
}
