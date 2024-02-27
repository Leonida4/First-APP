package bygr.students.repository;

import bygr.students.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class InMemory {
    private final List<Student> STUDENTS = new ArrayList<>();
    public List<Student> findAllStudents(){
        return STUDENTS;
    }


    public Student saveStudent(Student student) {
       STUDENTS.add(student);
       return student;
    }


    public Student findEmail(String email) {
return STUDENTS.stream()
        .filter(el->el.getEmail().equals(email)
                .findFirst()
)
    }


    public Student updateStudent(Student student) {
        var StudentInd =

    }


    public void deleteStudent(Student email) {

    }
}
