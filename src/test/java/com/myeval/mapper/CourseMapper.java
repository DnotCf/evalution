package com.myeval.mapper;

import com.myeval.entity.Course;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CourseMapper {

    Integer insert(Course course);

    Integer delete(String id);

    Integer update(Course course);

    List<Course> getCourseList();
    Integer stueva(@Param("courseid") String courseid,@Param("type") String  type);

    Course selectCourseInfoById(Integer id);

    Integer setEvaluate(@Param(value = "id") Integer id, @Param(value = "type") Integer type, @Param(value = "status") Integer status);

}
