package com.hubert.book.dto;

import com.hubert.book.entity.Book;
import lombok.Data;

@Data
public class BookDTO {

    long bookId;
    String bookTitle;
    String author;
    int publicationYear;
    String isbn;
    String cover;
    String briefInfo;

    // Converts Entity into DTO

    /***
     *  long bookId;
     *     String bookTitle;
     *     String author;
     *     int publicationYear;
     *     String isbn;
     *     String cover;
     *     String briefInfo;
     * @param book
     * @return
     */
    public static BookDTO valueOf(Book book) {
        BookDTO bookDTO = new BookDTO();
        if (book != null) {
            bookDTO.setBookId(book.getBookId());
            bookDTO.setBookTitle(book.getBookTitle());
            bookDTO.setAuthor(book.getAuthor());
            bookDTO.setPublicationYear(book.getPublicationYear());
            bookDTO.setIsbn(book.getIsbn());
            bookDTO.setCover(book.getCover());
            bookDTO.setBriefInfo(book.getBriefInfo());
        }
        return bookDTO;
    }
}
