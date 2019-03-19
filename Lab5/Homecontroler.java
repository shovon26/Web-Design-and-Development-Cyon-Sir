package edu.weblab.diandwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {

    @RequestMapping("/")
    public String home()
    {
        return "Home.html";
    }

    @RequestMapping("/contact")
    public String Contact()
    {
        return "contact.html";
    }
}
