package com.alethio.service.controller;

import com.alethio.service.entity.Order;
import com.alethio.service.service.OrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    private OrderService orderService;

    ServiceController(OrderService orderService){
        this.orderService = orderService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/order")
    public String orderRequestApi(@RequestBody Order order){
        String result=null;
        orderService.orderItem(order);
        return result;
    }
}
