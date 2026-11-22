package com.siri.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String sayHi() {
        System.out.println("this is the code of dev2");
        return "hello dev2";

    }
}
