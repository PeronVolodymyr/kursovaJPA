package per.example.kursova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import per.example.kursova.model.Student;
import per.example.kursova.model.Teacher;
import per.example.kursova.service.teacher.TeacherServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;

    @RequestMapping("/teachers")
    public List<Teacher> showTeachers() {
        return teacherService.getAll();
    }

    @PostMapping("/teacher/insert")
    Teacher insertTeacher(@RequestBody Teacher teacher) {
        return teacherService.insertTeacher(teacher);
    }

    @GetMapping("/teacher/delete")
    void deleteTeacher(@RequestParam("id") int id)
    {
        teacherService.deleteTeacher(id);
    }

    @GetMapping("/teacher/get")
    Teacher getTeacherById(@RequestParam("id") int id)
    {
        return teacherService.getTeacher(id);
    }

    @RequestMapping("/teacher/update")
    Teacher updateTeacher(@RequestBody Teacher teacher, @RequestParam("id") int id)
    {
        teacher.setId(id);
        return teacherService.updateTeacher(teacher);
    }
}
