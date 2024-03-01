package com.hubert.book.entity;

import com.hubert.book.dto.BookDTO;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
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
