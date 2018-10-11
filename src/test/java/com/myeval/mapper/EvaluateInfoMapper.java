package com.myeval.mapper;

import com.myeval.entity.EvaluateInfo;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;


public interface EvaluateInfoMapper {

   // int insert(EvaluateInfo info);
    List<EvaluateInfo>  selectByType(Integer type);

    List<Map<String, String>> selectByTypeAndRecordId(@Param(value = "type") Integer type,
                                                      @Param(value = "targetId") Integer targetId,
                                                      @Param(value = "recordId") Integer recordId);

    List<Integer> selectPrimaryIdByType(Integer type);

    Integer getCountByType(Integer type);

}
