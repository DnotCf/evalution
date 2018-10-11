package com.myeval.service;

import com.myeval.entity.Student;


import java.util.List;

public interface StudentService {
    //分页
    public List<Student> getStuddentList();
    //添加
    public void addStudent(Student student);
    //删除
    public void deleteStudent(Integer id);
    //更新
    public void updateStudent(Student student);
    public void admupdateStudent(Student student);
    //根据id查询
    public Student getStudentById(Integer id);
    public Student login(String username);
}
