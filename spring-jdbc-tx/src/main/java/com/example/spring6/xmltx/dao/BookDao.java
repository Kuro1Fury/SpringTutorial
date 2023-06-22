package com.example.spring6.xmltx.dao;

public interface BookDao {
    // Get book price
    Integer getBookPrice(Integer bookId);

    // Update book stock
    void updateBookStock(Integer bookId);

    // Update user balance
    void updateUserBalance(Integer userId, int price);
}
