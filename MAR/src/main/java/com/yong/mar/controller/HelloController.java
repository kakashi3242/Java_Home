package com.yong.mar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(@RequestParam(value = "name", required = false, defaultValue = "Spring") String name) {
        ModelAndView modelAndView = new ModelAndView("hello");

        modelAndView.addObject("message", "Welcome");
        modelAndView.addObject("name", name);

        return modelAndView;
    }
}
