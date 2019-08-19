package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChapTwoControl {
    @RequestMapping("/loadform")
    public String loadFromPage(){
        return "names";
    }
    @RequestMapping("/processform")
    public String loadFrompage(@RequestParam("login") String login, Model model){model.addAttribute("loginval", login);
    return "secondscreen";
    }
}
