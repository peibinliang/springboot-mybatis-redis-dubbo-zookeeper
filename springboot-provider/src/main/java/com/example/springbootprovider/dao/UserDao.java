package com.example.springbootprovider.dao;

import com.example.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    public Book findBookByBookId(@Param("bookId") int bookId);

    public List<Book> selectAllBook();

    public int addBook(@Param("book") Book book);

    public int deleteBook(@Param("bookId")int bookId);

    public int updateStock(@Param("bookId") int bookId,@Param("stock") int stock);
}
