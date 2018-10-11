package com.myeval.service;

import com.myeval.collectiondata.CourserDto;
import com.myeval.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseService {
    Integer insert(Course course);

    Integer delete(String id);

    Integer update(Course course);
    Integer stueva(@Param("courseid") String courseid, @Param("type") String type);
    List<Course> getCourseList();
    List<CourserDto> getCourseList1();
}
