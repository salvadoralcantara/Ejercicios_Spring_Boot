package controllers;

import domian.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/students")
public class StudentController {
        private List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Salvador", "salvador@gmail.com", 21, " course of Java"),
                new Student(1, "Juan", "juan@gmail.com", 19, " course of python"),
                new Student(1, "Maria", "maria@gmail.com", 42, " course of JavaScript"),
                new Student(1, "Alec", "Alec@gmail.com", 23, " course of SQL")
        ));



    }



