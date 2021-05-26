package com.alethio.service.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    Long id;

    String email;

    String name;

    String mobile;


}
