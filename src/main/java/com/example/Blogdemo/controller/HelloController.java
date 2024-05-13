package com.example.Blogdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title: HelloController
 * @Author XLW
 * @Package com.example.Blogdemo.controller
 * @Date 2024/5/13 18:57
 * @description:
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
