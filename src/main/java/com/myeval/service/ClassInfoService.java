package com.myeval.service;

import com.myeval.entity.ClassInfo;

import java.util.List;
import java.util.Map;

public interface ClassInfoService {
    Integer insert(ClassInfo classInfo);

    Integer delete(Integer id);

    Integer update(ClassInfo info);

    List<Map<String, String>> selectClassNameAndId();
}
