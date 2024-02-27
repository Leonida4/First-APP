package bygr.students.model;

import lombok.*;

import java.nio.file.FileStore;
import java.time.LocalDate;
@Data
@Builder
public class Student {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
@NonNull
    private String email;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.age = age;
    }

    private int age;


}
