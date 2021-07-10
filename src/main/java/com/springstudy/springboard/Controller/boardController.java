package com.springstudy.springboard.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {
    
    @GetMapping("Board")
    public String Board(Model model) {
        model.addAttribute("data", "board start")
    }
}
