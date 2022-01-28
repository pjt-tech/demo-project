package com.example.demo.controller;

import com.example.demo.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable Long userId) {
        System.out.println(requestDto);
        System.out.println(userId);
        return requestDto;
    }
}
