package com.alethio.service.entity;

import com.alethio.service.entity.items.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ORDERS") //order은 예약어라 오류남
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "orders_id")
    private Long id;

    private String email;

    private String name;

    private String mobile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    public static Order createOrder(ContactInfo contactInfo, Item item){
        Order order = new Order();
        order.setEmail(contactInfo.getContactEmail());
        order.setName(contactInfo.getContactName());
        order.setMobile(contactInfo.getMobile());
        order.setItem(item);
        item.removeStock();
        return order;
    }

}
