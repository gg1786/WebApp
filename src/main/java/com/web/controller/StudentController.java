package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {


    @GetMapping("/message")
    public String message() {
        return "showMessage";
    }
}
