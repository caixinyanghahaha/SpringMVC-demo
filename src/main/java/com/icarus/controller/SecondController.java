package com.icarus.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/second")
public class SecondController {

    @RequestMapping("/one")
    public String One(Model model) {

        model.addAttribute("demoId", "02");
        model.addAttribute("msg", "Spring 注解应用");
        return "first";

    }

}

/**
 *
 *
 *
 *
 * */