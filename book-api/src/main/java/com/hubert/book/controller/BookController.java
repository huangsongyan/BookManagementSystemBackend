package com.hubert.book.controller;

import com.hubert.book.dto.BookDTO;
import com.hubert.book.entity.Book;
import com.hubert.book.service.BookService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {

    @Resource
    BookService bookService;

    @RequestMapping(value = "/getBookList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BookDTO> getBookList() {
        return bookService.getBookList();
    }

    @RequestMapping(value = "/getBook/{bookId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BookDTO getBookById(@PathVariable long bookId) {
        return bookService.getBookById(bookId);
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody BookDTO bookDTO) {
        Book book = Book.valueOf(bookDTO);
        bookService.addBook(book);
    }

    @RequestMapping(value = "/removeBook", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void removeBook(@RequestBody BookDTO bookDTO) {
        bookService.deleteBook(bookDTO.getBookId());
    }

}
