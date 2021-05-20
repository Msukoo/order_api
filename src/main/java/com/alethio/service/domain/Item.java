package com.alethio.service.domain;

import lombok.Getter;

@Getter
public class Item {
    int id;
    int stock;
    String name;

    Item(int id, int stock, String name){
        this.id =  id;
        this.stock = stock;
        this.name = name;
    }
}
