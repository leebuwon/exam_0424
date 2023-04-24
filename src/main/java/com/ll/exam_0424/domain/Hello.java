package com.ll.exam_0424.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    @ResponseBody
    public String helloWorld(){
        return "hello World";
    }
}
