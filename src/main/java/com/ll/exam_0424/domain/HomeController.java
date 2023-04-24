package com.ll.exam_0424.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String helloWorld(){
        return "<h1>Hello, World!!! 수정했다!</h1>";
    }
}
