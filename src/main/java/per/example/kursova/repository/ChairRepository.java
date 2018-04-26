package per.example.kursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import per.example.kursova.model.Chair;

public interface ChairRepository extends JpaRepository<Chair, Integer> {
}
