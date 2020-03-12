package com.taskagile.web.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MainController
 */
@Controller
public class MainController {

    @GetMapping(value = {"/register", "/login","/"})
    public String entry() {
        return "index";
    }
    
}