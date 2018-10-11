package com.myeval.controller;

import com.myeval.collectiondata.Classin;
import com.myeval.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/evaluation")
public class ClassInfoController {

    @Autowired
    private ClassInfoService classInfoService;

    @RequestMapping("/courseinfo/list")
    public List<Classin> getlistz() {
        List<Map<String, String>> list =  classInfoService.selectClassNameAndId();
        List<Classin> classins = new ArrayList<>();
        Classin cla=null;
        for (Map map : list) {
            cla = new Classin();
            cla.setId(map.get("id").toString());
            cla.setClassname(map.get("name").toString());
            classins.add(cla);

        }
        return classins;
    }
}
