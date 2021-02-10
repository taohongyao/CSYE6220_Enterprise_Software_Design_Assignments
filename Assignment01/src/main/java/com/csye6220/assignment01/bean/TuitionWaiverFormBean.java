package com.csye6220.assignment01.bean;

import java.util.Date;
import java.util.List;

public class TuitionWaiverFormBean {
    private String academic_term;
    private String academic_year;
    private List<String> employee_status;
    private String student_name;
    private String relationship_to_employee;
    private String student_nuid;
    private String employee_name;
    private String employee_nuid;
    private String department;
    private String campus_location;
    private String phone_number;
    private String supervisor_name;
    private List<String> school_program;
    private List<CourseBean> courses;
    private Date apply_date;
    private Date employee_approve_date;
    private String employee_name_signature;
    private Date HRM_approve_date;
    private String HRM_name_signature;

    public String getAcademic_term() {
        return academic_term;
    }

    public void setAcademic_term(String academic_term) {
        this.academic_term = academic_term;
    }

    public String getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
    }

    public List<String> getEmployee_status() {
        return employee_status;
    }

    public void setEmployee_status(List<String> employee_status) {
        this.employee_status = employee_status;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getRelationship_to_employee() {
        return relationship_to_employee;
    }

    public void setRelationship_to_employee(String relationship_to_employee) {
        this.relationship_to_employee = relationship_to_employee;
    }

    public String getStudent_nuid() {
        return student_nuid;
    }

    public void setStudent_nuid(String student_nuid) {
        this.student_nuid = student_nuid;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_nuid() {
        return employee_nuid;
    }

    public void setEmployee_nuid(String employee_nuid) {
        this.employee_nuid = employee_nuid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCampus_location() {
        return campus_location;
    }

    public void setCampus_location(String campus_location) {
        this.campus_location = campus_location;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getSupervisor_name() {
        return supervisor_name;
    }

    public void setSupervisor_name(String supervisor_name) {
        this.supervisor_name = supervisor_name;
    }

    public List<String> getSchool_program() {
        return school_program;
    }

    public void setSchool_program(List<String> school_program) {
        this.school_program = school_program;
    }

    public List<CourseBean> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseBean> courses) {
        this.courses = courses;
    }

    public Date getApply_date() {
        return apply_date;
    }

    public void setApply_date(Date apply_date) {
        this.apply_date = apply_date;
    }

    public Date getEmployee_approve_date() {
        return employee_approve_date;
    }

    public void setEmployee_approve_date(Date employee_approve_date) {
        this.employee_approve_date = employee_approve_date;
    }

    public String getEmployee_name_signature() {
        return employee_name_signature;
    }

    public void setEmployee_name_signature(String employee_name_signature) {
        this.employee_name_signature = employee_name_signature;
    }

    public Date getHRM_approve_date() {
        return HRM_approve_date;
    }

    public void setHRM_approve_date(Date HRM_approve_date) {
        this.HRM_approve_date = HRM_approve_date;
    }

    public String getHRM_name_signature() {
        return HRM_name_signature;
    }

    public void setHRM_name_signature(String HRM_name_signature) {
        this.HRM_name_signature = HRM_name_signature;
    }
}
