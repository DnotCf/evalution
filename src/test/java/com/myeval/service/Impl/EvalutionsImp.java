package com.myeval.service.Impl;

import com.myeval.collectiondata.TscoreAndname;
import com.myeval.collectiondata.TscoreAndname1;
import com.myeval.entity.EvaluateInfo;
import com.myeval.entity.Evaluations;
import com.myeval.entity.GroupByScore;
import com.myeval.mapper.EvaluationsMapper;
import com.myeval.service.Evalutionservice;
import com.myeval.utils.GrorpScoreUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvalutionsImp implements Evalutionservice {

    @Autowired
    private EvaluationsMapper evaluationsMapper;

    @Override
    public int insert(Evaluations evaluate) {
        return evaluationsMapper.insert(evaluate);
    }

    @Override
    public int update(Evaluations evaluate) {
        return evaluationsMapper.update(evaluate);
    }

    @Override
    public List<TscoreAndname> getEvaList() {
        List<Evaluations> list = evaluationsMapper.getEvaList();
        TscoreAndname t =null;
        List<TscoreAndname> list1 = new ArrayList<>();
        for (Evaluations evaluations : list) {
            t = new TscoreAndname();
            t.setName(evaluations.getTname());
            t.setValue(evaluations.getScore().toString());
            list1.add(t);
        }
        return list1;
    }

    @Override
    public List<TscoreAndname1> getScoreList() {
        GroupByScore group = evaluationsMapper.getScoreList();
        List<TscoreAndname1> list = GrorpScoreUtil.groupscore(group);
        return list;
    }
}
