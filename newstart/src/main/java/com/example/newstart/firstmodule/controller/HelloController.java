package com.example.newstart.firstmodule.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 百未央
 * @program
 * @description
 * @date 2021-04-17 16:41
 **/


@RestController
@RequestMapping("/test")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }


}
