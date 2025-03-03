package controllers;

import domain.Student;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Objects;

@RestController
@RequestMapping("/students")
public class StudentController {
    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1, "Salvador", "salvador@gmail.com", 21, " course of Java"),
            new Student(2, "Juan", "juan@gmail.com", 19, " course of python"),
            new Student(3, "Maria", "maria@gmail.com", 42, " course of JavaScript"),
            new Student(4, "Alec", "Alec@gmail.com", 23, " course of SQL")
    ));

    @GetMapping
    public List<Student> getStudents() {
        return students;
     }

     //Busqueda de estudiantes por gmail
    @GetMapping("/{gmail}")
    public Student getStudent(@PathVariable String gmail) {
        for (Student elementStudent : students) {
            if (elementStudent.getGmail().equals(gmail)) {
                return elementStudent;
            }
        }
        return null;
    }

    @PostMapping
    public Student postStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

    @PutMapping
    public Student putStudent(@RequestBody Student student){
       for (Student elementStudent: students){
           if(elementStudent.getId() == student.getId()){
               elementStudent.setName(student.getName());
               elementStudent.setGmail(student.getGmail());
               elementStudent.setAge(student.getAge());
               elementStudent.setCourse(student.getCourse());
               return elementStudent;
           }
       }
       return null;
    }

    @DeleteMapping("/{id}")
    public Student deleteStudent(@PathVariable int id){
        for(Student elementStudent: students){
            if(elementStudent.getId() == id){
                students.remove(elementStudent);
                return elementStudent;
            }
        }
        return null;
    }

    @PatchMapping
    public Student patchStudent(@RequestBody Student student){
        for(Student elementStudent: students){
            if(elementStudent.getId() == student.getId()){
                if(!Objects.equals(elementStudent.getName(), student.getName())){
                    elementStudent.setName(student.getName());
                }
                if (!Objects.equals(elementStudent.getGmail(), student.getGmail())){
                    elementStudent.setGmail(student.getGmail());
                }
                if (elementStudent.getAge() != student.getAge()){
                    elementStudent.setAge(student.getAge());
                }
                if (!Objects.equals(elementStudent.getCourse(), student.getCourse())){
                    elementStudent.setCourse(student.getCourse());
                }
                return elementStudent;
            }
        }
        return null;
    }
}



