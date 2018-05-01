package per.example.kursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import per.example.kursova.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
