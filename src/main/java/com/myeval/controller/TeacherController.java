package com.myeval.controller;

import com.myeval.collectiondata.TeacherIdAndName;
import com.myeval.entity.Teacher;
import com.myeval.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/evaluation")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/teacher/list")
    public List<Teacher> getlist() {
        return teacherService.getList();
    }
    @RequestMapping("/teacher/add")
    public void tacherAdd(@RequestBody Map<String, Object> params) {
        Teacher teacher = new Teacher();

        teacher.setNo(params.get("no").toString());
        teacher.setTeacherName(params.get("teacherName").toString());
        teacher.setSex(params.get("sex").toString());
        teacher.setPassword(params.get("password").toString());
        teacher.setDepartment(params.get("department").toString());
        teacherService.save(teacher);
    }
    @RequestMapping("/teacher/update")
    public String tacherUpdate(@RequestBody Map<String, Object> params) {
        Teacher teacher = new Teacher();
        teacher.setId(Integer.parseInt(params.get("id").toString()));
        teacher.setNo(params.get("no").toString());
        teacher.setTeacherName(params.get("teacherName").toString());
        teacher.setSex(params.get("sex").toString());
        teacher.setPassword(params.get("password").toString());
        teacher.setDepartment(params.get("department").toString());
        teacherService.update(teacher);

        return "1";
    }

    @RequestMapping("/teacher/delete")
    public void delete(@RequestParam("id") Integer id)
    {
        teacherService.delete(id);
    }

    @RequestMapping("/teacher/idname")
    public List<TeacherIdAndName> getListIdAndName()
    {
        List<Map<String, String>> list = teacherService.getNoAndName();
        List<TeacherIdAndName> classins = new ArrayList<>();
        TeacherIdAndName cla=null;
        for (Map map : list) {
            cla = new TeacherIdAndName();
            cla.setId(map.get("id").toString());
            cla.setName(map.get("teachername").toString());
            classins.add(cla);

        }
        return classins;
    }

}
