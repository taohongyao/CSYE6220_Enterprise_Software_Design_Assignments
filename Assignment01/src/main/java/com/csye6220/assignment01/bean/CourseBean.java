package com.csye6220.assignment01.bean;

import java.util.Date;

public class CourseBean {
    private String course_no;
    private String course_name;
    private String course_supervisor;
    private String course_credit_hrs;
    private String course_days;
    private Date course_time;

    public CourseBean(String course_no, String course_name, String course_supervisor, String course_credit_hrs, String course_days, Date course_time) {
        this.course_no = course_no;
        this.course_name = course_name;
        this.course_supervisor = course_supervisor;
        this.course_credit_hrs = course_credit_hrs;
        this.course_days = course_days;
        this.course_time = course_time;
    }

    public String getCourse_no() {
        return course_no;
    }

    public void setCourse_no(String course_no) {
        this.course_no = course_no;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_supervisor() {
        return course_supervisor;
    }

    public void setCourse_supervisor(String course_supervisor) {
        this.course_supervisor = course_supervisor;
    }

    public String getCourse_credit_hrs() {
        return course_credit_hrs;
    }

    public void setCourse_credit_hrs(String course_credit_hrs) {
        this.course_credit_hrs = course_credit_hrs;
    }

    public String getCourse_days() {
        return course_days;
    }

    public void setCourse_days(String course_days) {
        this.course_days = course_days;
    }

    public Date getCourse_time() {
        return course_time;
    }

    public void setCourse_time(Date course_time) {
        this.course_time = course_time;
    }

    @Override
    public String toString() {
        return "CourseBean{" +
                "course_no='" + course_no + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_supervisor='" + course_supervisor + '\'' +
                ", course_credit_hrs='" + course_credit_hrs + '\'' +
                ", course_days='" + course_days + '\'' +
                ", course_time=" + course_time +
                '}';
    }
}
