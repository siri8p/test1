package com.siri.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
     @RequestMapping("/hello-dev2")
    public String printName() {
         return  "dev1";
     }

}
