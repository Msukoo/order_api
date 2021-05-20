package com.alethio.service.domain;

import lombok.Getter;

@Getter
public class Customer {
    int id;
    String email;
    String name;
    String mobile;

    Customer(int id, String email, String name, String mobile){
        this.id = id;
        this.email = email;
        this.name = name;
        this.mobile = mobile;
    }
}
