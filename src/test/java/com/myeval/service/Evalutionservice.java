package com.myeval.service;

import com.myeval.collectiondata.TscoreAndname;
import com.myeval.collectiondata.TscoreAndname1;
import com.myeval.entity.EvaluateInfo;
import com.myeval.entity.Evaluations;

import java.util.List;

public interface Evalutionservice {
    public int insert(Evaluations evaluate);
    public int update(Evaluations evaluate);
    public List<TscoreAndname> getEvaList();
    public List<TscoreAndname1> getScoreList();
}
