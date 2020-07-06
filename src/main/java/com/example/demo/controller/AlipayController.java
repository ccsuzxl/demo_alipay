package com.example.demo.controller;

import com.example.demo.service.AliPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlipayController {
    @Autowired
    private AliPay aliPay;
    @RequestMapping("/pay")
    public String alipay(){
        String s = aliPay.prePay();
        return s;
    }
}
