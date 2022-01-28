package com.example.demo.controller;

import com.example.demo.dto.UserReq;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "get Hello";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET) //예전방식 method 를 통하여 명시해줘야함
    public String hi() {
        return "hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String name) {
        System.out.println("name = " + name);
        return name;
    }

    @GetMapping("/query-param") //RequestParam 방식
    public String param(String name, String mail, int age) {
        System.out.println("name = " + name);
        System.out.println("mail = " + mail);
        System.out.println("age = " + age);

        return name + " " + mail + " " + age;
    }

    @GetMapping("/query-param-model") // ModelAttribute 방식 query-parameter 들을 객체랑 매핑시켜줌
    public String paramModel(@ModelAttribute UserReq userReq) {
        System.out.println("name = " + userReq.getName());
        System.out.println("mail = " + userReq.getMail());
        System.out.println("age = " + userReq.getAge());

        return userReq.toString();
    }



}
