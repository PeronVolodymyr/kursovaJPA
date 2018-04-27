package per.example.kursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import per.example.kursova.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
