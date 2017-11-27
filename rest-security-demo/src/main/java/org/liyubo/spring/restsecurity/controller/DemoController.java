package org.liyubo.spring.restsecurity.controller;

import com.fasterxml.jackson.annotation.JsonView;
import org.liyubo.spring.restsecurity.entity.User;
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

    @GetMapping("/user")
    @JsonView(User.UserSimpleView.class)
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setUserName("liyubo");
        user.setAge(25);
        user.setPassword("yyYYuswoYMOS==s");

        return user;
    }
}
