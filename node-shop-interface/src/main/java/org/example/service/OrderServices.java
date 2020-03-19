package org.example.service;

import org.example.domain.Order;

public interface OrderServices {
    public Order createOrder(Integer userId, String goodName, float price, Integer amount);
}
