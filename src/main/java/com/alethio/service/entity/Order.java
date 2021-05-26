package com.alethio.service.entity;

import com.alethio.service.entity.items.Item;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "ORDERS") //order은 예약어라 오류남
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "orders_id")
    Long id;

    String email;

    String name;

    String mobile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    Item item;

}
