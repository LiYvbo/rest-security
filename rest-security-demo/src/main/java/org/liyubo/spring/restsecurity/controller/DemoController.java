package org.liyubo.spring.restsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class DemoController {
    @GetMapping("/hello")
    public String greeting(){
        return "Hello World!";
    }
}
