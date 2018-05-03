package per.example.kursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import per.example.kursova.model.Diploma;

public interface DiplomaRepository extends JpaRepository<Diploma, Integer> {
}
