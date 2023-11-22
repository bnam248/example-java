package com.example.asmjav6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/home-page")

    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView("user/index");
//        model.addObject("message", "Hello Spring Boot! I love You");
        return model;
    }

    @GetMapping("/menu")
    public ModelAndView menu() {
        return new ModelAndView("user/menu");
//        model.addObject()

    }
    @GetMapping("/book")
    public ModelAndView book() {
        return new ModelAndView("user/book");
    }
    @GetMapping("/signin")
    public ModelAndView signinn() {
        return new ModelAndView("user/signinn");
    }
    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("user/register");
    }
    @GetMapping("/cast")
    public ModelAndView cast() {
        return new ModelAndView("user/cast");
    }
    @GetMapping("/about")
    public ModelAndView about(){
        return  new ModelAndView("user/about");
    }

}
