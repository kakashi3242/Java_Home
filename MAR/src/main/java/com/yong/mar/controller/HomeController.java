package com.yong.mar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
public class HomeController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)

    public String Home(ModelMap modelMap) {

        modelMap.addAttribute("message","Hello Spring !");

        return "redirect:/pages/helloword.html";

    }

}
