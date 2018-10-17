package com.buutcamp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class FrontPage {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String frontPageGET(Model model) {


        model.addAttribute("msg", "Hello front-page");


        return "front-page";
    }
    @RequestMapping(value="/second-page", method = RequestMethod.GET)
    public String secondPageGET(Model model) {

        model.addAttribute("msg", "Hello second-page");

        return "second-page";
    }
}
