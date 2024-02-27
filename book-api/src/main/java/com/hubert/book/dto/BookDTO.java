package com.hubert.book.dto;

import com.hubert.book.entity.Book;

public class BookDTO {

    long bookId;
    String bookTitle;
    String author;
    int publicationYear;
    String isbn;
    String cover;
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
        if(book != null){
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
