package com.csye6220.Assignment03.dao;

import com.csye6220.Assignment03.entity.BookEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class BookDao {

    public int createBooks(List<BookEntity> bookEntities) throws SQLException {
        Connection connection = BookDatabaseConnection.getConnection();
        Statement stmt = connection.createStatement();
        int count;
        try {
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


            count = stmt.executeUpdate(stringBuffer.toString());
        } finally {
            stmt.close();
            connection.close();
        }
        if (count == 0) throw new SQLException();
        return count;
    }

    public int createBooks2(List<BookEntity> bookEntities) throws SQLException {
        int count = 0;
        for (BookEntity bookEntity : bookEntities) {
            count += createBook(bookEntity);
        }
        if (count == 0) throw new SQLException();
        return count;
    }

    public int createBook(BookEntity bookEntity) throws SQLException {
        Connection connection = BookDatabaseConnection.getConnection();
        Statement stmt = connection.createStatement();
        int count;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("INSERT INTO books ");
            stringBuffer.append("VALUES ( ");
            stringBuffer.append(bookEntity.getId()).append("', '");
            stringBuffer.append(bookEntity.getIsbn()).append("', '");
            stringBuffer.append(bookEntity.getTitle()).append("', '");
            stringBuffer.append(bookEntity.getAuthors()).append("', ");
            stringBuffer.append(bookEntity.getPrice()).append(")");
            count= stmt.executeUpdate(stringBuffer.toString());
        }finally {
            connection.close();
            stmt.close();
        }
        if (count == 0) throw new SQLException();
        return count;
    }
}
