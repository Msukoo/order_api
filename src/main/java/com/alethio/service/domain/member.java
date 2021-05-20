package com.alethio.service.domain;

import lombok.Data;


@Data
public class member {
    int id;
    String username;
    String password;
    String name;
    String phone;
    int trophy;
}
