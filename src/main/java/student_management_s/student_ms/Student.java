package student_management_s.student_ms;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    public Long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getStudentID() {
        return studentID;
    }

    public String getTell() {
        return tell;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    private String studentID;
    private String studentName;
    private String faculty;
    private String tell;
}
