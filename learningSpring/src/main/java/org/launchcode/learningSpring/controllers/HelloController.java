package org.launchcode.learningSpring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

    //handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
//    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //Handles request of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    @GetMapping("hello")
//    @PostMapping("hello")
////    @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!"; //form submits to this /hello
//    }


    //handles requests of the form /hello/launchcode
    @GetMapping("hello/{name}")
//    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
//    @ResponseBody
    public String helloForm() {
        return "<html>" +
                    "<body>" +
                        "<form action='hello' method='post'>" + //submit a request to /hello
                            "<input type='text' name='name'>" +
                            "<select name='language'>" +
                                "<option value='Hello'>English</option>" +
                                "<option value='Bonjour'>French</option>" +
                                "<option value='Hola'>Spanish</option>" +
                                "<option value='Annyeonghaseyo'>Korean</option>" +
                                "<option value='Konichiwa'>Japanese</option>" +
                            "</select>" +
                            "<input type='submit' value='Greet me!'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    //language choosing

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @GetMapping("hello")
    @PostMapping("hello")
//    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language) {
        return language + ", " + name + "!"; //form submits to this /hello
    }

}






