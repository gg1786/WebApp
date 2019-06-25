package com.web.controller;

import com.web.student.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/")
    public String message(){
        return " Hello, student";
    }

    @RequestMapping(value = "{firstName}", method = RequestMethod.GET)
    public @ResponseBody
    Student getStudent(@PathVariable String firstName) {
        Student student = new Student("?????", "Gill");

        student.setFirstName("Sergei");
        student.setSecondName("Sansei");
        return student;
    }
}
