package com.example.springbootconsumer.controller;

import com.example.pojo.Book;
import com.example.service.BookService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/book")
public class UserController {
    @DubboReference
    private BookService bookService;

    @RequestMapping("/findByBookId")
    public String findBookByBookId(int bookId){
        Book book = bookService.findBookByBookId(bookId);
        if (book!=null) return book.toString();
        else return "查无有关书籍";
    }
    
    @RequestMapping("selectAllBook")
    public String selectAllBook(){
        List<Book> bookList = bookService.selectAllBook();
        String books = "";
        if(bookList!=null){
            for(Book book:bookList){
                books+=book.toString()+"<br>";
            }
            return books;
        } else {
           return "查询全部书籍失败";
        }
    }

    @RequestMapping("addBook")
    public String addBook(){
        Book book = new Book();
        book.setBookname("活着");
        book.setAuthor("余华");
        book.setPress("作家出版社");
        book.setType("小说");
        Date date = new Date(1999,9,9);
        book.setPublicationTime(date);
        book.setISBN("12345678910111213");
        book.setStock(100);

        return bookService.addBook(book);
    }

    @RequestMapping("delete")
    public String deleteBook(int bookId){
        return bookService.deleteBook(bookId);
    }

    @RequestMapping("updateStock")
    public String updateStock(){
        int bookId = 1,stock=99;
        return bookService.updateStock(bookId,stock);
    }
}
