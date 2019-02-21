package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/shaw")
    public String shaw() {
        return "shaw";
    }

    @RequestMapping("/batman")
    public String batman() {
        return "batman";
    }

    @RequestMapping("/up")
    public String up() {
        return "up";
    }
}
