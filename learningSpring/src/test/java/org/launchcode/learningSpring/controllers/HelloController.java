package org.launchcode.learningSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //handles request at path /hello
    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }

}
