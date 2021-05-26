package com.alethio.service.controller;

import com.alethio.service.entity.ContactInfo;
import com.alethio.service.entity.ParamItem;
import com.alethio.service.entity.items.CategoryName;
import com.alethio.service.exception.OrderException;
import com.alethio.service.service.OrderService;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ServiceController {

    private OrderService orderService;

    ServiceController(OrderService orderService){
        this.orderService = orderService;
    }

    @InitBinder("contactInfo")
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @PostMapping(value = "/order")
    public String orderRequestApi(@RequestBody Map param){
        String result=null;
        Gson gson = new Gson();
        ParamItem paramItem = gson.fromJson(gson.toJson(param.get("items")), ParamItem.class);
        ContactInfo contactInfo = gson.fromJson(gson.toJson(param.get("contactInfo")), ContactInfo.class);

        if(CategoryName.fineName(paramItem.getItemType())==null){
            throw new OrderException("아이템 없음");
        }

        orderService.orderItem(paramItem, contactInfo);


        return result;
    }
}
