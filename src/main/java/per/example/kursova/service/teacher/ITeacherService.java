package per.example.kursova.service.teacher;

import per.example.kursova.model.Teacher;

import java.time.LocalDate;
import java.util.List;

public interface ITeacherService {

    public Teacher insertTeacher(Teacher teacher);
    public Teacher getTeacher(int id);
    public Teacher updateTeacher(Teacher teacher);
    public void deleteTeacher(int id);
    public List<Teacher> getAll();
    List<Teacher> getTeachersByChair(int chair_id);
    List<Teacher> getTeachersByProtectionOfDoctoralDissertationDuringSpecifiedTime(LocalDate startDate, LocalDate endDate);
}
