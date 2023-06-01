package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 即兴小索奇
 * @version 1.0
 * @date 2023/5/31  13:51
 * @description
 */
@RestController
@RequestMapping({"/hello"})
public class HelloController {
    @GetMapping("")
    public String hello(){
        System.out.println("helloWorldTest1");
        return "OK";
    }
}