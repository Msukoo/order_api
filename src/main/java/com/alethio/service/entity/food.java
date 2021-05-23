package com.alethio.service.entity;


import lombok.Getter;

@Getter
public class food extends Item{

    food(int id, int stock, String name){
        super(id, stock, name);
    }
}
