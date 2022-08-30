package com.javasm.springmvc.controller;

import com.javasm.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/url")
public class URLMappingController {
    @GetMapping("/get")
    @ResponseBody
    public String testGet() {
        return "testGet";
    }

    @PostMapping("/post")
    @ResponseBody
    public String testPost() {
        return "post";
    }

    @GetMapping("/postForm")
    @ResponseBody
    public String testForm(String username, @RequestParam("123") Long password) {
//        return username+":"+password;
        System.out.println(username + ":" + password);
        return "123";
    }

    @GetMapping("/testForm")
    @ResponseBody
    public String testForm1(String username,String password,Date createTime) {
//        return username+":"+password;
        System.out.println(username);
        return "123";
    }

}
