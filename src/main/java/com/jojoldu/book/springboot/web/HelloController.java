package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //이전에 @ResponseBody 를 메소드에 각각선언해준것을 한번에 해주는 것
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
