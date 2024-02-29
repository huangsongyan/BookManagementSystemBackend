package com.hubert.book.service;

import com.hubert.book.entity.Book;
import com.hubert.book.repository.BookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BookServiceTest {

    @Resource
    BookRepository bookRepository;

    @Before
    public void setUp() {
    }

    @Test
    public void testGetBookList() {
        List<Book> books = bookRepository.findAll();
        Assert.assertEquals(5, books.size());
    }

    @Test
    public void getBookById() {
        long id = 1;
        Book book = bookRepository.findById(id).get();
        Assert.assertEquals("红楼梦", book.getBookTitle());
    }

    @Test
    public void addBook() {
        Book book = new Book();
        book.setBookTitle("Book");
        book.setAuthor("hsy");
        bookRepository.saveAndFlush(book);
        List<Book> books = bookRepository.findAll();
        Assert.assertEquals(5, books.size());
    }

    @Test
    public void updateBook() {
        Book book = new Book();
        book.setBookId(2);
        bookRepository.saveAndFlush(book);
        List<Book> books = bookRepository.findAll();
        Assert.assertEquals(5, books.size());
    }

    @Test
    public void deleteBook() {
        long id = 2;
        bookRepository.deleteById(id);
        List<Book> books = bookRepository.findAll();
        Assert.assertEquals(5, books.size());
    }


}
