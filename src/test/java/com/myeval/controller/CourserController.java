package com.myeval.controller;

import com.myeval.collectiondata.CourserDto;
import com.myeval.entity.Course;
import com.myeval.collectiondata.TeacherCourse;
import com.myeval.service.CourseService;
import com.myeval.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/evaluation")
public class CourserController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/evteacher/list")
    public List<TeacherCourse> getCourseList(@RequestBody Map<String,Object> name) {
        List<TeacherCourse> list = new ArrayList<>();
        //System.out.println(name.get("name"));
        //System.out.println(name);
        TeacherCourse teacherCourse;
        List<Course> courses = courseService.getCourseList();


            for (Course course1 : courses) {
                if (course1.getOpenStudentEvaluate()==1) {
                    if (name.size() > 1) {
                        teacherCourse = new TeacherCourse();
                        String s = name.get("name").toString();
                        if (course1.getTeacher().getTeacherName().contains(s)) {
                            teacherCourse.setClassname(course1.getClassInfo().getClassName());
                            teacherCourse.setDate(DateUtil.formateDate(course1.getClassInfo().getEnterTime()));
                            teacherCourse.setName(course1.getName());
                            teacherCourse.setTeachername(course1.getTeacher().getTeacherName());
                            list.add(teacherCourse);
                        }
                    } else {
                        teacherCourse = new TeacherCourse();
                        teacherCourse.setClassname(course1.getClassInfo().getClassName());
                        teacherCourse.setDate(DateUtil.formateDate(course1.getClassInfo().getEnterTime()));
                        teacherCourse.setName(course1.getName());
                        teacherCourse.setTeachername(course1.getTeacher().getTeacherName());
                        list.add(teacherCourse);
                    }
                }
            }

        return list;
    }
    @RequestMapping("/course/list")
    public List<CourserDto> couserList()
    {
        return courseService.getCourseList1();
    }

    @RequestMapping("/course/add")
    public Integer couserAdd(@RequestBody Map<String, Object> map) {
        Course course = new Course();
        course.setClassId(Integer.parseInt( map.get("classid").toString()));
        course.setName(map.get("coursename").toString());
        course.setCourseId(map.get("courseid").toString());
        course.setTeacherId(Integer.parseInt(map.get("teacherid").toString()));
        return courseService.insert(course);
    }
    @RequestMapping("/course/update")
    public Integer couserUpdate(@RequestBody Map<String, Object> map)
    {
        Course course = new Course();
        course.setId(Integer.parseInt(map.get("id").toString()));
        course.setClassId(Integer.parseInt( map.get("classid").toString()));
        course.setName(map.get("coursename").toString());
        course.setCourseId(map.get("courseid").toString());
        course.setTeacherId(Integer.parseInt(map.get("teacherid").toString()));

        return courseService.update(course);
    }
    @RequestMapping("/course/delete")
    public Integer couserUpdate(String id)
    {
        return courseService.delete(id);
    }
    @RequestMapping("/course/stueva")
    public Integer couserEva(String courseid,String type)
    {

        return courseService.stueva(courseid,type);

    }
}
