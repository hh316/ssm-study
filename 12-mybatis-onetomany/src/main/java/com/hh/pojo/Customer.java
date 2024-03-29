package com.hh.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Customer {
    private int customerId;
    private String customerName;
    private List<Order> orders;
}
