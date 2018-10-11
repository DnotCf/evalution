package com.myeval.mapper;

import com.myeval.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;


public interface TeacherMapper {

    List<Teacher> selectByPage();

    Teacher login(String name);

    Integer insert(Teacher teacher);

    Integer update(Teacher teacher);

    Integer delete(Integer id);

    Teacher selectByNo(String no);

    List<Map<String, String>> getNoAndName();



}
