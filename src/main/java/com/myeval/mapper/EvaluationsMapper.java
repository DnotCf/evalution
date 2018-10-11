package com.myeval.mapper;

import com.myeval.entity.GroupByScore;
import com.myeval.entity.Evaluations;

import java.util.List;

public interface EvaluationsMapper {

    public int insert(Evaluations evaluate);
    public int update(Evaluations evaluate);
    public List<Evaluations> getEvaList();

    public GroupByScore getScoreList();
}
