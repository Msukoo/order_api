package com.alethio.service.domain;

import lombok.Getter;

@Getter
public class Clothes extends Item{

    Clothes(int id, int stock, String name){
        super(id, stock, name);
    }
}
