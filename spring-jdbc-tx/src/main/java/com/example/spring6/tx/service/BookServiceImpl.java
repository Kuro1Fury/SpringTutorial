package com.example.spring6.tx.service;

import com.example.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

//@Transactional(readOnly = true)
//@Transactional(timeout = 3)
//@Transactional(noRollbackFor = {ArithmeticException.class})
@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Override
    public void buyBook(Integer bookId, Integer userId) {
        // Simulate timeout
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // Check book price
        int price = bookDao.getBookPrice(bookId);

        // Update book stock
        bookDao.updateBookStock(bookId);

        // Update user balance
        bookDao.updateUserBalance(userId, price);

//        System.out.println(1 / 0);

    }
}
