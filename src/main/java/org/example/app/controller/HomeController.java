package org.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String viewHome(Model model) {
        model.addAttribute("title", "My Office");
        return "home";
    }
}
