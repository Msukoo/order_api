package com.alethio.service.domain;

import lombok.Getter;

@Getter
public class Order {

    int id;
    String email;
    String name;
    String mobile;
    Item item;
    int itemId;

    Order(Item item, Customer customer){
        this.email = customer.email;
        this.name = customer.name;
        this.mobile = customer.mobile;
        this.item = item;
    }
}
