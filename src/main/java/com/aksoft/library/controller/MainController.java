package com.aksoft.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/test")
    public @ResponseBody String test() {
        return "test";
    }
}
