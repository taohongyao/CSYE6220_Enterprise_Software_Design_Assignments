package com.csye6220.assignment01;

import com.csye6220.assignment01.bean.CourseBean;
import com.csye6220.assignment01.bean.TuitionWaiverFormBean;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class GetTuitionWaiwerFormServlet extends HttpServlet {
    private String title="Tuition Waiver Form";
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        TuitionWaiverFormBean tuitionWaiverFormBean=new TuitionWaiverFormBean();
        tuitionWaiverFormBean.setAcademic_term(request.getParameter("academic_term"));
        tuitionWaiverFormBean.setAcademic_year(request.getParameter("academic_year"));
        List<String> employee_status=new ArrayList<String>();
        if(request.getParameter("pt_staff")!=null){
            employee_status.add("pt_staff");
        }
        if(request.getParameter("pt_faculty")!=null){
            employee_status.add("pt_faculty");
        }
        if(request.getParameter("retiree")!=null){
            employee_status.add("retiree");
        }
        if(request.getParameter("pt_staff")!=null){
            employee_status.add("pt_staff");
        }
        if(request.getParameter("other")!=null){
            employee_status.add(request.getParameter("other_text"));
        }

        tuitionWaiverFormBean.setEmployee_status(employee_status);

        tuitionWaiverFormBean.setStudent_name(request.getParameter("student_name"));
        tuitionWaiverFormBean.setRelationship_to_employee(request.getParameter("relationship_to_employee"));
        tuitionWaiverFormBean.setStudent_nuid(request.getParameter("student_nuid"));
        tuitionWaiverFormBean.setEmployee_name(request.getParameter("employee_name"));
        tuitionWaiverFormBean.setEmployee_nuid(request.getParameter("employee_nuid"));
        tuitionWaiverFormBean.setDepartment(request.getParameter("department"));
        tuitionWaiverFormBean.setCampus_location(request.getParameter("campus_location"));
        tuitionWaiverFormBean.setPhone_number(request.getParameter("phone_number"));
        tuitionWaiverFormBean.setSupervisor_name(request.getParameter("supervisor_name"));

        List<String> programs=new ArrayList<String>();
        if(request.getParameter("udergraduate_program")!=null){
            programs.add("udergraduate_program");
        }
        if(request.getParameter("law_school")!=null){
            programs.add("law_school");
        }
        if(request.getParameter("doctoral_candidate")!=null){
            programs.add("doctoral_candidate");
        }
        if(request.getParameter("cps_undergraduate")!=null){
            programs.add("cps_undergraduate");
        }
        if(request.getParameter("graduate_school")!=null){
            programs.add(request.getParameter("graduate_school"));
        }
        if(request.getParameter("cps_graduate")!=null){
            programs.add(request.getParameter("cps_graduate"));
        }

        tuitionWaiverFormBean.setSchool_program(programs);
        tuitionWaiverFormBean.setApply_date(new Date(System.currentTimeMillis()));

        List<CourseBean> courses=new ArrayList<CourseBean>();
        CourseBean courseBean1=new CourseBean(request.getParameter("course_nu1"),
                request.getParameter("course_name1"),request.getParameter("supervisor_signature1"),
                request.getParameter("credit_hrs1"),                request.getParameter("days1"),
                new Date(System.currentTimeMillis()));
        CourseBean courseBean2=new CourseBean(request.getParameter("course_nu2"),
                request.getParameter("course_name2"),request.getParameter("supervisor_signature2"),
                request.getParameter("credit_hrs2"),                request.getParameter("days2"),
                new Date(System.currentTimeMillis()));
        CourseBean courseBean3=new CourseBean(request.getParameter("course_nu3"),
                request.getParameter("course_name3"),request.getParameter("supervisor_signature3"),
                request.getParameter("credit_hrs3"),                request.getParameter("days3"),
                new Date(System.currentTimeMillis()));
        courses.add(courseBean1);
        courses.add(courseBean2);
        courses.add(courseBean3);
        tuitionWaiverFormBean.setCourses(courses);

        out.println("<html><body>");
        out.println("<h1> "+title+"</h1>");
        out.println("<h3> Section1: </h3>");
        out.println("<p> Academic term: "+tuitionWaiverFormBean.getAcademic_term()+"</p>");
        out.println("<p> Academic Year: "+tuitionWaiverFormBean.getAcademic_year()+"</p>");
        out.println("<p> Employee Status: "+tuitionWaiverFormBean.getEmployee_status()+"</p>");
        out.println("<h3> Section2: </h3>");
        out.println("<p> Student's Name: "+tuitionWaiverFormBean.getStudent_name()+"</p>");
        out.println("<p> Relationship to Employee: "+tuitionWaiverFormBean.getRelationship_to_employee()+"</p>");
        out.println("<p> Student's NUID: "+tuitionWaiverFormBean.getStudent_nuid()+"</p>");
        out.println("<p> Employee's Name(if different from Student's): "+tuitionWaiverFormBean.getEmployee_name()+"</p>");
        out.println("<p> Employee's NUID: "+tuitionWaiverFormBean.getEmployee_nuid()+"</p>");
        out.println("<p> Department: "+tuitionWaiverFormBean.getDepartment()+"</p>");
        out.println("<p> Campus Location: "+tuitionWaiverFormBean.getCampus_location()+"</p>");
        out.println("<p> Phone Number: "+tuitionWaiverFormBean.getPhone_number()+"</p>");
        out.println("<p> Supervisor's Name: "+tuitionWaiverFormBean.getSupervisor_name()+"</p>");

        out.println("<h3> Section3: </h3>");
        out.println("<p> Indicate the applicable school or program: "+tuitionWaiverFormBean.getSchool_program()+"</p>");
        out.println("<p> Courses: "+tuitionWaiverFormBean.getCourses()+"</p>");
        out.println("<p> Apply date: "+tuitionWaiverFormBean.getApply_date()+"</p>");

        out.println("</body></html>");
    }
}
