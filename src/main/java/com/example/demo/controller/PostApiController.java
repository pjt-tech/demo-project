package com.example.demo.controller;

import com.example.demo.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData) {
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key : " + stringObjectEntry.getKey());
            System.out.println("value : " + stringObjectEntry.getValue());
        });
    }

    @PostMapping("/post-dto")
    public String postDto(@RequestBody PostRequestDto requestDto) {
        System.out.println(requestDto);
        return requestDto.toString();
    }
}
