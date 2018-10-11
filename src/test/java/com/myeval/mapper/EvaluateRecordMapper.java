package com.myeval.mapper;

import com.myeval.entity.EvaluateRecord;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface EvaluateRecordMapper {

    Integer insert(EvaluateRecord evaluateRecord);

    EvaluateRecord selectByTypeTargetIdAndCourseId(@Param(value = "type") Integer type,
                                                   @Param(value = "targetId") Integer targetId,
                                                   @Param(value = "courseId") Integer courseId);

    //List<Map<String, String>> selectStudentEvalluateRecord(Page page);

    Integer setComplete(@Param(value = "status") Integer status,
                        @Param(value = "id") Integer id);

    Integer setContent(@Param(value = "id") Integer id,
                       @Param(value = "content") String content);

}
