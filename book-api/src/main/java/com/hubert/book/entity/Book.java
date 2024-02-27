package com.hubert.book.entity;

import com.hubert.book.dto.BookDTO;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue
    long bookId;
    @Column(nullable = false)
    String bookTitle;
    @Column(nullable = false)
    String author;
    @Column(nullable = false)
    int publicationYear;
    @Column(nullable = false)
    String isbn;
    @Column(nullable = false)
    String cover;
    @Column(nullable = false)
    String briefInfo;


    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getBriefInfo() {
        return briefInfo;
    }

    public void setBriefInfo(String briefInfo) {
        this.briefInfo = briefInfo;
    }

    public static Book valueOf(BookDTO bookDTO) {
        Book book = new Book();
        if(bookDTO != null){
            book.setBookId(bookDTO.getBookId());
            book.setBookTitle(bookDTO.getBookTitle());
            book.setAuthor(bookDTO.getAuthor());
            book.setPublicationYear(bookDTO.getPublicationYear());
            book.setIsbn(bookDTO.getIsbn());
            book.setCover(bookDTO.getCover());
            book.setBriefInfo(bookDTO.getBriefInfo());
        }
        return book;
    }
}
