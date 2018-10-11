package com.myeval.controller;

import com.myeval.collectiondata.TscoreAndname;
import com.myeval.collectiondata.TscoreAndname1;
import com.myeval.entity.Evaluations;
import com.myeval.service.Evalutionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {

    @Autowired
    private Evalutionservice evalutionservice;

    @RequestMapping("/teacher/eval")
    public String eval(String name, String score) {
        int sc = Integer.parseInt(score);
        Evaluations evaluations = new Evaluations();
        evaluations.setTname(name);
        evaluations.setScore(sc);
        evaluations.setContent("n");
        int a = evalutionservice.insert(evaluations);
        if(a !=0){
            return "ok";
        }
        else {
            return null;
        }
    }

    @RequestMapping("/teacher/content")
    public String evalContent(String name, String content) {

        Evaluations evaluations = new Evaluations();
        evaluations.setTname(name);
        evaluations.setContent(content);

        int a = evalutionservice.update(evaluations);
        if(a !=0){
            return "ok";
        }
        else {
            return null;
        }
    }

    @RequestMapping("/teacherscore/charts")
    public List<TscoreAndname> tscoreAndnames()
    {
        return evalutionservice.getEvaList();
    }

    @RequestMapping("/teacherscore/chartsCount")
    public List<TscoreAndname1> groupScoreCount()
    {
        return evalutionservice.getScoreList();
    }
}