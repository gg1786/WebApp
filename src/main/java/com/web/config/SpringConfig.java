package com.web.config;

import com.web.student.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Student getStudent(){
        return new Student("Evgenii", "Gill");
    }
}
