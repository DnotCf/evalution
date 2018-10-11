package com.myeval.entity;


public class EvaluateResult {

    private Integer id;

    private Integer evaluateId;

    private Double score;

    private Integer recordId;

    public EvaluateResult() {
    }

    public EvaluateResult(Integer evaluateId, Double score, Integer recordId) {
        this.evaluateId = evaluateId;
        this.score = score;
        this.recordId = recordId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }
}
