package com.myeval.mapper;


import com.myeval.entity.EvaluateResult;


public interface EvaluateResultMapper {

    Integer insert(EvaluateResult evaluateResult);

    Integer update(EvaluateResult evaluateResult);

    Integer getCountByRecordId(Integer recordId);

}
