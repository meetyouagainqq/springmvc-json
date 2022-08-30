package com.javasm.springmvc.controller;

import com.javasm.springmvc.entity.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class FormController {
//    @PostMapping("/apply")
//    @ResponseBody
//    public String test2(@RequestParam(value = "haha",defaultValue = "testname") String name, String course, Integer[] purpose){
//        System.out.println(name);
//        System.out.println(course);
//        for (Integer integer : purpose) {
//            System.out.println(integer);
//        }
//        return "success";
//    }
//    @PostMapping("/apply")
//    @ResponseBody
//    //list类型的参数接收，必须加@RequestParam
//    public String test2( String name, String course, @RequestParam List<Integer> purpose){
//        System.out.println(name);
//        System.out.println(course);
//        for (Integer integer : purpose) {
//            System.out.println(integer);
//        }
//        return "success";
//    }
//    @PostMapping("/apply")
//    @ResponseBody
//    //list类型的参数接收，必须加@RequestParam
//    public String test2(Form form){
//        return "success";
//    }
//    @PostMapping("/apply")
//    @ResponseBody
//    //list类型的参数接收，必须加@RequestParam
//    public String test2(){
//        return "success";
//    }
//    @PostMapping("/apply")
//    @ResponseBody
//    //map作为参数，会出现list类型的数据丢失问题
//    public String test2(@RequestParam Map map){
//        return "success";
//    }
    @PostMapping("/apply")
    @ResponseBody
    //map作为参数，会出现list类型的数据丢失问题
    public String test2(Form form){
        System.out.println(form.getName());
        return "哈哈success";
    }
}
