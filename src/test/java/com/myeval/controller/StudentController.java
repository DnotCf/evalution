package com.myeval.controller;

import com.myeval.collectiondata.StudentClass;
import com.myeval.entity.Student;
import com.myeval.service.ClassInfoService;
import com.myeval.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/evaluation")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassInfoService classInfoService;

    @RequestMapping("/select/{id}")
    public Student selectByid(@PathVariable("id") int id) {
        return studentService.getStudentById(id);

    }



    @RequestMapping("/student/list")
    public List<StudentClass> listall() {
        List<StudentClass> list = new ArrayList<>();
        StudentClass studentClass;
        List<Student> list1 = studentService.getStuddentList();
        for (Student student : list1) {
            studentClass = new StudentClass();
            studentClass.setId(student.getId());
            studentClass.setSno(student.getNo());
            studentClass.setClassName(student.getCnm());
            studentClass.setDepartment(student.getClassInfo().getDepartment());
            studentClass.setName(student.getName());
            studentClass.setPassword(student.getPassword());
            studentClass.setSex(student.getSex());
            list.add(studentClass);
        }

        return list;
    }

    @RequestMapping("/student/save")
    public void saveStudent(Student student) {
        studentService.addStudent(student);
    }
    @RequestMapping("/student/update")
    public void updateStudent( @RequestBody Map<String,Object> params) {

        Student student = new Student();
        student.setNo(params.get("no").toString());
        student.setPassword(params.get("password").toString());
        student.setSex(params.get("resource").toString());
        student.setName(params.get("name").toString());
        if(params.get("options").toString().contains("网络")){
            student.setClassId(2);
        }else {
            student.setClassId(1);
        }

        studentService.updateStudent(student);
    }
    @RequestMapping("/student/updateadm")
    public void admupdateStudent( @RequestBody Map<String,Object> params) {

        Student student = new Student();
        student.setId(Integer.parseInt(params.get("id").toString()));
        student.setNo(params.get("sno").toString());
        student.setPassword(params.get("password").toString());
        student.setSex(params.get("sex").toString());
        student.setName(params.get("name").toString());
        if(params.get("department").toString().contains("计算机")){
            student.setClassId(1);
        }else {
            student.setClassId(2);
        }

        studentService.updateStudent(student);
    }
    @RequestMapping("/student/add")
    public void addStudent( @RequestBody Map<String,Object> params) {

        Student student = new Student();
        student.setNo(params.get("sno").toString());
        student.setPassword(params.get("password").toString());
        student.setSex(params.get("sex").toString());
        student.setName(params.get("name").toString());
        student.setClassId(1);

        studentService.addStudent(student);
    }
    @RequestMapping("/student/delete")
    public void deleteStudent(@RequestParam("id") Integer id) {


        studentService.deleteStudent(id);
    }
}
