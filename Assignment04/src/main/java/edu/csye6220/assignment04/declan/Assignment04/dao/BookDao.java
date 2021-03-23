package edu.csye6220.assignment04.declan.Assignment04.dao;


import edu.csye6220.assignment04.declan.Assignment04.entity.BookEntity;
import edu.csye6220.assignment04.declan.Assignment04.entity.MovieEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BookDao {

    public int createAllBooks(List<BookEntity> bookEntities) throws SQLException {
        int count;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("INSERT INTO books ");
        stringBuffer.append("VALUES ");
        for (int i = 0; i < bookEntities.size() - 1; i++) {
            BookEntity bookEntity = bookEntities.get(i);
            stringBuffer.append("('");
            stringBuffer.append(bookEntity.getId()).append("', '");
            stringBuffer.append(bookEntity.getIsbn()).append("', '");
            stringBuffer.append(bookEntity.getTitle()).append("', '");
            stringBuffer.append(bookEntity.getAuthors()).append("', ");
            stringBuffer.append(bookEntity.getPrice()).append("),");
        }
        BookEntity bookEntity = bookEntities.get(bookEntities.size() - 1);
        stringBuffer.append("('");
        stringBuffer.append(bookEntity.getId()).append("', '");
        stringBuffer.append(bookEntity.getIsbn()).append("', '");
        stringBuffer.append(bookEntity.getTitle()).append("', '");
        stringBuffer.append(bookEntity.getAuthors()).append("', ");
        stringBuffer.append(bookEntity.getPrice()).append(")");
        count = BookDatabaseConnection.update(stringBuffer.toString());
        if (count == 0) throw new SQLException();
        return count;
    }

    public int createAllBooksByPreStatement(List<BookEntity> bookEntities) throws SQLException {
        int count = 0;
        for (BookEntity bookEntity : bookEntities) {
            count += createBookPreStatement(bookEntity);
        }
        if (count == 0) throw new SQLException();
        return count;
    }

    public int createBookPreStatement(BookEntity bookEntity) throws SQLException {
        int count;
        String sql="INSERT INTO books VALUES (?,?,?,?,?)";
        Consumer<PreparedStatement> function= stmt ->{
            try {
                stmt.setString(1,bookEntity.getId());
                stmt.setString(2,bookEntity.getIsbn());
                stmt.setString(3,bookEntity.getTitle());
                stmt.setString(4,bookEntity.getAuthors());
                stmt.setFloat(5,bookEntity.getPrice());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        };
        count = BookDatabaseConnection.update(sql,function);
        if (count == 0) throw new SQLException();
        return count;
    }
    public List<BookEntity> getAllBooks() throws SQLException {
        List<BookEntity> list = new ArrayList<>();
        String sql = "select * from books";
        BookDatabaseConnection.search(sql,rs -> {
            try {
                while (rs.next()) {
                    BookEntity bookEntity = new BookEntity();
                    bookEntity.setId(rs.getString(1));
                    bookEntity.setIsbn(rs.getString(2));
                    bookEntity.setTitle(rs.getString(3));
                    bookEntity.setAuthors(rs.getString(4));
                    bookEntity.setPrice(rs.getFloat(5));
                    list.add(bookEntity);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
        return list;
    }


    public int createBookStatement(BookEntity bookEntity) throws SQLException {
        int count;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("INSERT INTO books ");
        stringBuffer.append("VALUES ( ");
        stringBuffer.append(bookEntity.getId()).append("', '");
        stringBuffer.append(bookEntity.getIsbn()).append("', '");
        stringBuffer.append(bookEntity.getTitle()).append("', '");
        stringBuffer.append(bookEntity.getAuthors()).append("', ");
        stringBuffer.append(bookEntity.getPrice()).append(")");
        count = BookDatabaseConnection.update(stringBuffer.toString());
        if (count == 0) throw new SQLException();
        return count;
    }
}
