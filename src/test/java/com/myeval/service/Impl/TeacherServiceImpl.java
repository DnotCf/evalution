package com.myeval.service.Impl;

import com.myeval.entity.Teacher;
import com.myeval.mapper.TeacherMapper;
import com.myeval.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher login(String name) {
        return teacherMapper.login(name);
    }

    @Override
    public List<Teacher> getList()
    {
        return teacherMapper.selectByPage();
    }
    @Override
    public void save(Teacher teacher){
        teacherMapper.insert(teacher);
    }

    @Override
    public void delete(Integer id){
        teacherMapper.delete(id);

    }

    public void update(Teacher teacher){
        teacherMapper.update(teacher);

    }

    @Override
    public List<Map<String, String>> getNoAndName() {
        return teacherMapper.getNoAndName();
    }

}
