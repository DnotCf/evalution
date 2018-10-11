package com.myeval.service.Impl;


import com.myeval.entity.Student;
import com.myeval.mapper.StudentMapper;

import com.myeval.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{


    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> getStuddentList() {
        return studentMapper.getStudentList();
    }

    public void addStudent(Student student){

        studentMapper.insert(student);
    }

    @Override
    public Student login(String username) {
        return studentMapper.login(username);
    }

    public void deleteStudent(Integer id)
    {
         studentMapper.delete(id);
    }

    public void updateStudent(Student student)
    {
         studentMapper.update(student);
    }

    @Override
    public void admupdateStudent(Student student) {
        studentMapper.update(student);
    }

    public Student getStudentById(Integer id){
        return studentMapper.selectById(id);
    }
}
