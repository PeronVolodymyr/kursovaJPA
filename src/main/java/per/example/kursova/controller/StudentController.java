package per.example.kursova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import per.example.kursova.model.Group;
import per.example.kursova.model.Student;
import per.example.kursova.service.student.StudentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    @RequestMapping("/students")
    List<Student> showStudents(){
        return studentService.getAll();
    }

    @PostMapping("/student/insert")
    Student insertStudent(@RequestBody Student student) {
        return studentService.insertStudent(student);
    }

    @GetMapping("/student/delete")
    void deleteStudent(@RequestParam("id") int id)
    {
        studentService.deleteStudent(id);
    }

    @GetMapping("/student/get")
    Student getStudentById(@RequestParam("id") int id)
    {
        return studentService.getStudent(id);
    }

    @RequestMapping("/student/update")
    Student updateStudent(@RequestBody Student student, @RequestParam("id") int id)
    {
        student.setId(id);
        return studentService.updateStudent(student);
    }
    @GetMapping("/student/get by group")
    List<Student> getStudentsByGroup(@RequestParam("group_id") int group_id)
    {
        return studentService.getStudentsByGroup(group_id);
    }
    @GetMapping("/number of student/get by department")
    int getNumberOfStudentsByDepartment(@RequestParam("department_id") int department_id)
    {
        return studentService.getNumberOfStudentsByDepartment(department_id);
    }

}
