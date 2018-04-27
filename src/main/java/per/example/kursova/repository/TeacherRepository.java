package per.example.kursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import per.example.kursova.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
