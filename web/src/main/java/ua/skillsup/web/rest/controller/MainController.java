package ua.skillsup.web.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.skillsup.service.MainService;

@Controller
public class MainController {

    @Autowired
    private MainService service;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model) {


        return "login";
    }

}
