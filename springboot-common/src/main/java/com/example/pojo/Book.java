package com.example.pojo;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
    private int bookId;
    private String bookname;
    private String author;
    private String type;
    private String press;
    private Date publicationTime;
    private String ISBN;
    private int stock;

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Book(int bookId, String bookname, String author, String type, String press, Date publicationTime, String ISBN, int stock) {
        this.bookId = bookId;
        this.bookname = bookname;
        this.author = author;
        this.type = type;
        this.press = press;
        this.publicationTime = publicationTime;
        this.ISBN = ISBN;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", press='" + press + '\'' +
                ", publicationTime=" + publicationTime +
                ", ISBN='" + ISBN + '\'' +
                ", stock=" + stock +
                '}';
    }
}
