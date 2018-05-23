package per.example.kursova.service.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.example.kursova.model.Teacher;
import per.example.kursova.repository.TeacherRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher insertTeacher(Teacher teacher) {

        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacher(int id) {

        return teacherRepository.findById(id).get();
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {

        return teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(int id) {

        teacherRepository.deleteById(id);
    }

    @Override
    public List<Teacher> getAll(){
        return teacherRepository.findAll();
    }

    @Override
    public List<Teacher> getTeachersByChair(int chair_id) {
        return teacherRepository.getTeachersByChair(chair_id);
    }

    @Override
    public List<Teacher> getTeachersByProtectionOfDoctoralDissertationDuringSpecifiedTime(LocalDate startDate, LocalDate endDate) {
        return teacherRepository.GetTeachersByProtectionOfDoctoralDissertationDuringSpecifiedTime(startDate, endDate);
    }

    @Override
    public List<Teacher> getTeachersByLessonAndCourse(int subject_id, int course) {
        return teacherRepository.getTeachersByLessonAndCourse(subject_id, course);
    }
}
