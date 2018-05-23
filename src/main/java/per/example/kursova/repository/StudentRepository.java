package per.example.kursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import per.example.kursova.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer>{

    @Query("select s from Student s where s.group.id = :group_id")
    List<Student> getStudentsByGroup(@Param("group_id") int group_id);

    @Query("select count(s) from Student s where s.group.chair.department.id = :department_id")
    int getNumberOfStudentsByDepartment(@Param("department_id") int department_id);
}
