package com.takshmind.spring.sample.rest.controller;

import com.takshmind.spring.sample.rest.model.Student;
import com.takshmind.spring.sample.rest.repository.InMemoryStudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@AllArgsConstructor
public class StudentController {

    private final InMemoryStudentRepository studentRepository;


    @GetMapping("student")
    public Collection<Student> getAllStudents() {

        return studentRepository.getAllStudents();
    }


    @GetMapping("student/{id}")
    public Student getStudent(@PathVariable Long id) {

        return studentRepository.getStudent(id);
    }


    @PostMapping("student")
    public Student saveStudent(@RequestBody Student student) {

        return studentRepository.saveStudent(student);
    }


    @PutMapping("student/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {

        return studentRepository.updateStudent(id, student);
    }


    @DeleteMapping("student/{id}")
    public Student deleteStudent(@PathVariable Long id) {

        return studentRepository.deleteStudent(id);
    }

}
