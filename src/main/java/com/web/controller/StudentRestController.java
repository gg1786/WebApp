package com.web.controller;

import com.web.student.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

    @RequestMapping("/rest")
    public String healthCheck() {
        return "Ok";
    }

    @RequestMapping("/rest/student/get")
    public Student getStudent(@RequestParam(name = "name", required = false,
            defaultValue = "Unknown") String name) {
        Student student = new Student();
        student.setName(name);
        return student;
    }
}
