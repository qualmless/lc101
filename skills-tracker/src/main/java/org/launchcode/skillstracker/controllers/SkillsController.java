package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping(value="", method = RequestMethod.GET)
    public String startSkills () {
        String html = "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
        return html;
    }

    @GetMapping(value="form")
    public String langForm() {
        String html = "<html>" +
                    "<body>" +
                        "<form method='post'>" +
                            "Name: " +
                            "<br>" +
                            "<input type='text' name='name'/>" +
                            "<br>" +
                            "My favorite language: " +
                            "<br>" +
                            "<select name='language1'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>Javascript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select>" +
                            "<br>" +
                            "My second favorite language: " +
                            "<br>" +
                            "<select name='language2'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>Javascript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select>" +
                            "<br>" +
                            "My third favorite language: " +
                            "<br>" +
                            "<select name='language3'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>Javascript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select>" +
                            "<br>" +
                            "<input type='submit' value='submit'/>" +
                        "</form>" +
                    "</body>" +
                "</html>";
        return html;
    }


    @PostMapping(value="form")
    public String formEntries(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        String html = "<html>" +
                    "<body>" +
                        "<h1>" +
                            name  +
                        "</h1>" +
                        "<h2>" +
                            "<ol>" +
                                "<li>" + language1 + "</li>" +
                                "<li>" + language2 + "</li>" +
                                "<li>" + language3 + "</li>" +
                            "</ol>" +
                        "</h2>" +
                    "</body>" +
                "</html>";
        return html;
    }
}
