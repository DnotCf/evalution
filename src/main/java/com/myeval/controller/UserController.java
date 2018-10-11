package com.myeval.controller;

import com.myeval.entity.Student;
import com.myeval.entity.Teacher;
import com.myeval.service.StudentService;
import com.myeval.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/evaluation")
public class UserController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/user/login")
    public String login(String type, String userName, String password, HttpSession session) {

        if (type.equals("1")) {
            Student student = studentService.login(userName);

            if (student.getPassword().equals(password)) {
                session.setAttribute("name",userName);
                return student.getNo();
            } else {
                return null;
            }
        } else if (type.equals("2")) {
            Teacher teacher = teacherService.login(userName);
            if (teacher.getPassword().equals(password)) {
                session.setAttribute("name",userName);
                return teacher.getNo();
            } else {
                return null;
            }
        } else if (type.equals("3")) {
            if (userName.equals("admin") && password.equals("123456")) {
                session.setAttribute("name",userName);
                return "admin";
            }

        }
        return null;
    }
}
