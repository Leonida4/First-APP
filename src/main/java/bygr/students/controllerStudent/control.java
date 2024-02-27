package bygr.students.controllerStudent;

import bygr.students.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceSt;
import service.StudentService.StudentImplService;


import java.util.List;

@RestController
public class control {

    private ServiceSt service = new StudentImplService();
    @GetMapping("/api/v1/students")
    public List<Student> findAllStudents() {
      //todo
       return service.findAllStudents();
    }
}