package com.buutcamp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class FrontPage {

    @RequestMapping(value="/")
    public String frontPageGET(Model model) {

        return "front-page";
    }
}
