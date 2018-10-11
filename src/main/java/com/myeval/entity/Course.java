package com.myeval.entity;


public class Course {

    private Integer id;

    private String courseId;

    private String name;

    private Integer teacherId;

    private Integer classId;

    private Integer openStudentEvaluate;

    private Integer openTeacherEvaluate;

    private Teacher teacher;
    private ClassInfo classInfo;

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getOpenStudentEvaluate() {
        return openStudentEvaluate;
    }

    public void setOpenStudentEvaluate(Integer openStudentEvaluate) {
        this.openStudentEvaluate = openStudentEvaluate;
    }

    public Integer getOpenTeacherEvaluate() {
        return openTeacherEvaluate;
    }

    public void setOpenTeacherEvaluate(Integer openTeacherEvaluate) {
        this.openTeacherEvaluate = openTeacherEvaluate;
    }
}
