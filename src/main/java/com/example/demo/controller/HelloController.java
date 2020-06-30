package com.example.demo.controller;


import com.example.demo.service.HelloService;
import com.sun.istack.internal.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HelloController {
    @NotNull HelloService helloService;
    String s="demo";
    @RequestMapping("/index1")
    public ResponseEntity<String> sayHello(){
        System.out.println("hello1");
        //return ResponseEntity.badRequest().body(helloService.hello());
        return ResponseEntity.ok("hello");
    }
    @RequestMapping("/ali")
    public String ali(){
        return "/index";
    }
}
