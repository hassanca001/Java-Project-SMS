package student_management_s.student_ms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// This interface extends JpaRepository, which provides the basic CRUD operations
// for the Student entity with a primary key of type Long.
public interface StudentRepository
       extends JpaRepository<Student,Long> {
    List<Student> findByStudentNameContainingIgnoreCase(String studentName);
}
