package org.launchcode.learningSpring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@ResponseBody
public class HelloSpringController {

    //handles request at path /hello
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
//    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

//    Handles request of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @GetMapping("hello")
    @PostMapping("hello")
//    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!"; //form submits to this /hello
    }


    //handles requests of the form /hello/launchcode
    @GetMapping("hello/{name}")
//    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    //language choosing

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    @GetMapping("hello")
//    @PostMapping("hello")
////    @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language) {
//        return language + ", " + name + "!"; //form submits to this /hello
//    }

}






