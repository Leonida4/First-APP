package service;

import bygr.students.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ServiceSt {
    public List<Student> findAllStudents();

    Student saveStudent(Student student);

    Student findEmail(Student email);

    Student updateStudent(Student student);

    void deleteStudent(Student email);
}