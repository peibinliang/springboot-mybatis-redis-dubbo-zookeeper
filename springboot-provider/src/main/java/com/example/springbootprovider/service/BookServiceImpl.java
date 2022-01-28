package com.example.springbootprovider.service;

import com.example.pojo.Book;
import com.example.service.BookService;
import com.example.springbootprovider.dao.UserDao;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@DubboService
public class BookServiceImpl implements BookService {
    @Resource
    private UserDao userDao;

    @Override
    @Cacheable(key = "#bookId", value = "Book")
    public Book findBookByBookId(Integer bookId) {
        if(bookId<0){
            return null;
        }else {
            Book book = userDao.findBookByBookId(bookId);
            return book;
        }
    }

    @Override
    @Cacheable
    public List<Book> selectAllBook() {
        List<Book> bookList = userDao.selectAllBook();
        return bookList;
    }

    @Override
    @CacheEvict(key = "#book", value = "Book")
    public String addBook(Book book) {
        int count = userDao.addBook(book);
        if(count>0){
            return "添加书籍成功";
        }else {
            return "添加书籍失败";
        }
    }

    @Override
    @CacheEvict(key = "#bookId", value = "Book")
    public String deleteBook(Integer bookId) {
        int count = userDao.deleteBook(bookId);
        if (count>0){
            return "删除书籍成功";
        }else{
            return "删除书籍失败";
        }
    }

    @Override
    @CacheEvict(key = "#bookId", value = "Book")
    public String updateStock(Integer bookId, Integer stock) {
        int count = userDao.updateStock(bookId,stock);
        if (count>0){
            return "更新书籍成功";
        }else{
            return "更新书籍失败";
        }
    }
}
