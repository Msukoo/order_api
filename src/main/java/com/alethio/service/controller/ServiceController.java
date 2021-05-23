package com.alethio.service.controller;

import com.alethio.service.entity.Order;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class ServiceController {
    Order order;

    ServiceController(Order order){
        this.order = order;
    }
    @RequestMapping(method = RequestMethod.POST, path = "/order")
    public String orderRequestApi(@RequestBody Order order){
        String result=null;

        return result;
    }
}
