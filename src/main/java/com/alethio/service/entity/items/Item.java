package com.alethio.service.entity.items;

import com.alethio.service.entity.Order;
import com.alethio.service.exception.OrderException;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
public class Item {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    Long id;

    String name;

    int stock;

    @OneToMany(mappedBy = "item")
    private List<Order> orders = new ArrayList<>();

    public void addStock(int quantity) {
        this.stock += quantity;
    }
    public void removeStock(int quantity) {
        int restStock = this.stock - quantity;
        if (restStock < 0) {
            throw new OrderException("재고없음");
        }
        this.stock = restStock;
    }


}
