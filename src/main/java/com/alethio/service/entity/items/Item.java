package com.alethio.service.entity.items;

import com.alethio.service.entity.Order;
import com.alethio.service.exception.OrderException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @OneToMany(mappedBy = "item")
    private List<Order> orders = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    private String name;

    private int stock;

    public void addStock() {
        this.stock += 1;
    }

    public void removeStock() {
        int restStock = this.stock - 1;
        if (restStock < 0) {
            throw new OrderException("재고없음");
        }
        this.stock = restStock;
    }



}
