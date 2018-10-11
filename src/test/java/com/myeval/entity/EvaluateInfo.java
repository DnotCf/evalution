package com.myeval.entity;


public class EvaluateInfo {

    private Integer id ;

    private Integer type;

    private String content;

    private Integer score;

    private Integer isUse;

    public EvaluateInfo() {
    }

    public EvaluateInfo(Integer id, Integer type, String content, Integer score, Integer isUse) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.score = score;
        this.isUse = isUse;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }
}
