package per.example.kursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import per.example.kursova.model.Group;

public interface GroupRepository extends JpaRepository<Group, Integer> {
}
