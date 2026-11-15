package com.siri.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
     @RequestMapping("/hello")
    public String sayHello() {
         System.out.println("Hello, World  sirisha!");
        return "Hello, World  sirisha!  and samanvitha and vihaqq ";
    }
    @RequestMapping("/hi")
     public String  hi() {
        return "hi there!";
     }
}
