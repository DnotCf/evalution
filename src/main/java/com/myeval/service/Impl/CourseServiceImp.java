package com.myeval.service.Impl;

import com.myeval.collectiondata.CourserDto;
import com.myeval.entity.Course;
import com.myeval.mapper.CourseMapper;
import com.myeval.service.CourseService;
import com.myeval.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImp implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public Integer insert(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public Integer delete(String id) {
        return courseMapper.delete(id);
    }

    @Override
    public Integer update(Course course) {
        return courseMapper.update(course);
    }


    @Override
    public List<Course> getCourseList() {
        return courseMapper.getCourseList();
    }

    @Override
    public Integer stueva(String courseid, String type) {
        return courseMapper.stueva(courseid,type);
    }

    @Override
    public List<CourserDto> getCourseList1() {

        CourserDto  c;
        List<Course>courses=courseMapper.getCourseList();
        List<CourserDto> courserDtos = new ArrayList<>();
        for (Course c1 : courses) {
            c=new CourserDto();
            c.setId(c1.getId());
            c.setCourseid(c1.getCourseId());
            c.setCoursename(c1.getName());
            c.setClassname(c1.getClassInfo().getClassName()+"("+ DateUtil.formateDate1(c1.getClassInfo().getEnterTime())+")");
            c.setTeacher(c1.getTeacher().getTeacherName());
            c.setStueva(c1.getOpenStudentEvaluate());
            c.setClassid(c1.getClassId());
            c.setTeacherid(c1.getTeacherId());
            courserDtos.add(c);
        }
        return courserDtos;
    }
}
