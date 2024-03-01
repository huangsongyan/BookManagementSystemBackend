package com.hubert.book.service;

import com.hubert.book.dto.BookDTO;
import com.hubert.book.entity.Book;
import com.hubert.book.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Resource
    BookRepository bookRepository;

    public List<BookDTO> getBookList() {
        List<Book> books = bookRepository.findAll();
        List<BookDTO> bookDTOList = new ArrayList<>();
        for (Book book : books) {
            bookDTOList.add(BookDTO.valueOf(book));
        }
        return bookDTOList;
    }

    public BookDTO getBookById(long id) {
        Book book = bookRepository.findById(id).get();
        BookDTO bookDTO = BookDTO.valueOf(book);
        return bookDTO;
    }

    public Book addBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    public Book updateBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }


}
