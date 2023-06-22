package com.example.spring6.tx.service;

public interface CheckoutService {
    // Buy multiple books
    void checkout(Integer[] bookIds, Integer userId);
}
