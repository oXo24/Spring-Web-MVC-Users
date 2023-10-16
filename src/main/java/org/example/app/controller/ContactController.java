package org.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

    @RequestMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("title", "Contacts");
        return "contacts";
    }
}
