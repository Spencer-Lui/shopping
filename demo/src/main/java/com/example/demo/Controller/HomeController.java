package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HomeController {
    
    public String Index(){
        return "hello world!";
    }
}
