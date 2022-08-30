package com.javasm.springmvc.controller;

import com.javasm.springmvc.entity.Person;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/test")
//@CrossOrigin(origins = {"http://localhost:8100","http://www.imooc.com"})
@CrossOrigin(origins = "*",maxAge = 3600)
public class TestController {
    @GetMapping("/testPerson")
    public Person getPerson(Integer id) {
        Person person = new Person();
        if(id==1){
            person.setAge(10);
            person.setName("哈哈");
            person.setCreateTime(new Date());
        }else {
            person.setAge(20);
            person.setName("哈哈123");
            person.setCreateTime(new Date());
        }
        return person;
    }
}
