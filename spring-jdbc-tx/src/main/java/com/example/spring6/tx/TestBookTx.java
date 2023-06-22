package com.example.spring6.tx;

import com.example.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations="classpath:beans.xml")
public class TestBookTx {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
//        bookController.buybook(1, 1);
        Integer[] bookIds = {1, 2};
        bookController.checkout(bookIds, 2);
    }
}
