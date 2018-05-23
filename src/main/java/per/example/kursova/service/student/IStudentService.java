package per.example.kursova.service.student;


import per.example.kursova.model.Student;

import java.util.List;

public interface IStudentService {

    public Student insertStudent(Student student);
    public Student getStudent(int id);
    public Student updateStudent(Student student);
    public void deleteStudent(int id);
    public List<Student> getAll();
    public List<Student> getStudentsByGroup(int group_id);
    public int getNumberOfStudentsByDepartment(int department_id);
}
