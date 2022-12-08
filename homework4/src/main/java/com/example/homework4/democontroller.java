package com.example.homework4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class democontroller {
    @RequestMapping("/")
    public  String index(Model model)
    {
        return "index";
    }
}
