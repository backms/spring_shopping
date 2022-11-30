package com.example.spring_shopping.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping(path = {"/", "/home"})
    public String home(){
        return "home";
    }

}
