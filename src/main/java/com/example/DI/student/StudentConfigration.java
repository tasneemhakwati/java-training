package com.example.DI.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfigration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> studentRepository.save(new Student(
                "Mariam",
                "Mariam@Mariam.com",
                LocalDate.of(2000, Month.APRIL, 12)));

    }
}
