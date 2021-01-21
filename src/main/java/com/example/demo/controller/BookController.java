package com.example.demo.controller;

import com.example.demo.bean.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/book")
    public Book book() {
        Book book = new Book();
        book.setName("sanguo");
        book.setAuthor("luo");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }

    @GetMapping("/bookList")
    public List<Book> books() {
        List<Book> books = new ArrayList<>();
        books.add(book());
        books.add(book());
        return books;
    }
}
