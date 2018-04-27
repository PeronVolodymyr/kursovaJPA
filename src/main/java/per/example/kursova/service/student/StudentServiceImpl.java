package per.example.kursova.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.example.kursova.model.Student;
import per.example.kursova.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student insertStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(int id) {

        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();

    }
}
