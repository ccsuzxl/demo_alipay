package com.example.demo.controller;


import com.example.demo.service.HelloService;
import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HelloController {
    @NotNull HelloService helloService;
    @Value("${a}")
    String a;
    @GetMapping("/index1")
    @ApiOperation("hello")
    public ResponseEntity<String> sayHello(){
        System.out.println(a);
        //return ResponseEntity.badRequest().body(helloService.hello());
        return ResponseEntity.ok("hello");
    }

    @RequestMapping(value = "/index", method = {RequestMethod.GET,RequestMethod.POST})
    @ApiOperation(value="index测试", notes="index测试", produces="application/json")
    public ResponseEntity<List> index(){
        ArrayList<String> list = new ArrayList<>();
        list.add("lisi");
        list.add("wangwu");
        return ResponseEntity.ok(list);
    }

    @PostMapping("/index2")
    public ResponseEntity<List> index2(String id){
        ArrayList<String> list = new ArrayList<>();
        list.add("lisi");
        list.add("wangwu");
        return ResponseEntity.ok(list);
    }
}
