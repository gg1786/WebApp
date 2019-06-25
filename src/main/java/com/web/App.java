package com.web;

import com.web.config.SpringConfig;
import com.web.student.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student bean = context.getBean(Student.class);
        String firstName = bean.getFirstName();
        String secondName = bean.getSecondName();
        System.out.println("firstName = " + firstName + " " + "secondName = " + secondName);

    }
}
