package com.takshmind.spring.sample.rest.repository;

import com.takshmind.spring.sample.rest.model.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;


@Component
public class InMemoryStudentRepository {

    private final HashMap<Long, Student> students = new HashMap<Long, Student>();

    public Collection<Student> getAllStudents() {

        return students.values();
    }

    public Student getStudent(long id) {

        return students.get(id);
    }


    public Student saveStudent(Student student) {

        long id = students.size() + 1;
        student.setId(id);
        return students.get(id);
    }


    public Student updateStudent(long id, Student student) {

        return students.put(id, student);
    }


    public Student deleteStudent(long id) {

        return students.remove(id);
    }
}
