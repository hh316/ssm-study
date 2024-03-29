package com.hh.mapper;

import com.hh.pojo.Customer;

public interface CustomerMapper {
    //1.一对多
    Customer selectCustomer(int customerId);
}
