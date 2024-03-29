package com.hh.mapper;

import com.hh.pojo.Order;

public interface OrderMapper {
    //1.一对一
    Order selectOrder(int orderId);
}
