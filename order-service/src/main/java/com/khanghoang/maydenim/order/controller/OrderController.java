package com.khanghoang.maydenim.order.controller;

import com.khanghoang.maydenim.order.dto.CreateOrderReq;
import com.khanghoang.maydenim.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(CreateOrderReq req){
        orderService.placeOrder(req);
        return "Order Place Successfully";
    }
}
