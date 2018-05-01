package per.example.kursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import per.example.kursova.model.CandidatesDissertation;

public interface CandidateDissertationRepository extends JpaRepository<CandidatesDissertation, Integer> {
}
