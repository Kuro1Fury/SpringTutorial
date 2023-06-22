package com.example.spring6.xmltx.controller;

import com.example.spring6.xmltx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    // buyBook(): book id and user id
    public void buyBook(Integer bookId, Integer userId) {
        // Call service method
        bookService.buyBook(bookId, userId);
    }

}
