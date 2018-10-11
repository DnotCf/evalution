package com.myeval.mapper;

import com.myeval.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface StudentMapper {

  List<Student> getStudentList();
   //登陆
   Student login(String username);
   void insert(Student student);

   void update(Student student);

   void delete(Integer id);

   Student selectByNo(String no);

   Student selectById(Integer id);

   List<Integer> getIdByClassId(Integer classId);

}
