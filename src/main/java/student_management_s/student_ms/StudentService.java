package student_management_s.student_ms;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
// This class is a Spring service class responsible for business logic/operations related to students.
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    // Method to search for students by name.
    // Returns a list of Student entities whose 'studentName' field contains the specified substring,
    // case-insensitively.
    public List<Student> searchStudentByName(String studentName) {
        return studentRepository.findByStudentNameContainingIgnoreCase(studentName);
    }
}
