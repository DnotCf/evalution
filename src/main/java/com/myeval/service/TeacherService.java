package com.myeval.service;

import com.myeval.entity.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherService {

    Teacher login(String name);
    public List<Teacher> getList();
    public void save(Teacher teacher);
    public void delete(Integer id);
    public void update(Teacher teacher);
    List<Map<String, String>> getNoAndName();
}
