package com.myeval.service.Impl;

import com.myeval.entity.ClassInfo;
import com.myeval.mapper.ClassInfoMapper;
import com.myeval.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ClassInfoImp implements ClassInfoService {
    @Autowired
    private ClassInfoMapper classInfoMapper;

    @Override
    public Integer insert(ClassInfo classInfo) {
        return classInfoMapper.insert(classInfo);
    }

    @Override
    public Integer delete(Integer id) {
        return classInfoMapper.delete(id);
    }

    @Override
    public Integer update(ClassInfo info) {
        return classInfoMapper.update(info);
    }

    @Override
    public List<Map<String, String>> selectClassNameAndId() {
        return classInfoMapper.selectClassNameAndId();
    }
}
