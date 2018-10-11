package com.myeval.collectiondata;

import java.util.Date;

public class TeacherCourse {




    private String date;
    private String name;

    private String teachername;

    private String classname;

    private Integer openStudentEvaluate;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getOpenStudentEvaluate() {
        return openStudentEvaluate;
    }

    public void setOpenStudentEvaluate(Integer openStudentEvaluate) {
        this.openStudentEvaluate = openStudentEvaluate;
    }
}
