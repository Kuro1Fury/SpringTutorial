package com.example.spring6.tx.service;

import com.example.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Transactional
    @Override
    public void buyBook(Integer bookId, Integer userId) {
        // Check book price
        int price = bookDao.getBookPrice(bookId);

        // Update book stock
        bookDao.updateBookStock(bookId);

        // Update user balance
        bookDao.updateUserBalance(userId, price);

    }
}
