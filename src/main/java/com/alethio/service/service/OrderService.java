package com.alethio.service.service;

import com.alethio.service.entity.ContactInfo;
import com.alethio.service.entity.Order;
import com.alethio.service.entity.ParamItem;
import com.alethio.service.entity.items.Category;
import com.alethio.service.entity.items.CategoryName;
import com.alethio.service.entity.items.Item;
import com.alethio.service.repository.CategoryRepository;
import com.alethio.service.repository.ItemRepository;
import com.alethio.service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;
    private final CategoryRepository categoryRepository;

    public Long orderItem(ParamItem paramItem, ContactInfo contactInfo) {
        Category category = categoryRepository.findName(CategoryName.fineName(paramItem.getItemType()));
        Item item = itemRepository.findItem(paramItem.getId(), category);
        Order order = Order.createOrder(contactInfo, item);
        orderRepository.save(order);
        return order.getId();
    }
}
