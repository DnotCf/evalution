package com.myeval.entity;


public class EvaluateRecord {

    private Integer id ;

    private Integer type;

    private Integer targetId;

    private Integer courseId;

    private Integer isComplete;

    private String evaluateTime;

    public EvaluateRecord() {
    }

    public EvaluateRecord(Integer type, Integer targetId, Integer courseId, Integer isComplete, String evaluateTime) {
        this.type = type;
        this.targetId = targetId;
        this.courseId = courseId;
        this.isComplete = isComplete;
        this.evaluateTime = evaluateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    public String getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(String evaluateTime) {
        this.evaluateTime = evaluateTime;
    }
}
