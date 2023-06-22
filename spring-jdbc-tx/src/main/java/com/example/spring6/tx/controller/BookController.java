package com.example.spring6.tx.controller;

import com.example.spring6.tx.service.BookService;
import com.example.spring6.tx.service.CheckoutService;
import com.example.spring6.tx.service.CheckoutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

//    @Autowired
//    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    // buyBook(): book id and user id
//    public void buyBook(Integer bookId, Integer userId) {
//        // Call service method
//        bookService.buyBook(bookId, userId);
//    }

    public void checkout(Integer[] bookIds, Integer userId) {
        checkoutService.checkout(bookIds, userId);
    }

}
