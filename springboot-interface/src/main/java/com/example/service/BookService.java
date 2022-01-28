package com.example.service;

import com.example.pojo.Book;

import java.util.List;

public interface BookService {
    //通过书籍的唯一标识查询书籍
    public Book findBookByBookId(Integer bookId);

    //查询所有书籍
    public List<Book> selectAllBook();

    //增加书籍
    public String addBook(Book book);

    //通过bookId查询并删除书籍
    public String deleteBook(Integer bookId);

    //通过书籍的唯一标识修改书籍的库存
    public String updateStock(Integer bookId,Integer stock);

}
