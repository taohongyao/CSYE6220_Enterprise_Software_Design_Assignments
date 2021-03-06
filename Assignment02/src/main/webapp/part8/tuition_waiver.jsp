<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 2/9/2021
  Time: 4:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../lib/css/tuition_waiver_form.css">
</head>
<body>
<h1 class="title">Human Resources</h1>
<h3 class="title">Northeastern University</h3>


<form action="../part8.jsp" method="post">
    <div id="" class="container1">
        <div class="center">
            <label class="text_lable">This form is used by part-time faculty, part-time staff, retirees, their spouses
                or domestic partners and their dependents.
                All full-time faculty and staff should use the online Tuition Waiver Form found on myNEU. Before
                completing this form,
                please refer to the Tuition Waiver Program Guidelines. Be sure to include a Dependent Certification Form
                along with
                the submission of this form for any dependent children.</label>
        </div>
        <div id="section1" class="container">
            <h2>Section1</h2>
            <div class="left">
                <label for="academic_term">Academic Term:</label>
                <select id="academic_term" name="academic_term">
                    <option value="fall">Fall</option>
                    <option value="winter">Winter</option>
                    <option value="spring">Spring</option>
                    <option value="summer">Summer</option>
                </select>
            </div>
            <div class="right">
                <label for="academic_year">Academic Year:</label>
                <select id="academic_year" name="academic_year">
                    <option value="2018">2018</option>
                    <option value="2019">2019</option>
                    <option value="2020">2020</option>
                    <option value="2021">2021</option>
                </select>
            </div>
            <div>
                <label for="employee_status">Employee Status:</label>
                <div id="employee_status">
                    <label class="box_lable">
                        <input id="pt_statff" type="checkbox" name="pt_staff">P/T Staff
                    </label>
                    <label class="box_lable">
                        <input id="pt_faculty" type="checkbox" name="pt_faculty">P/T Faculty
                    </label>
                    <label class="box_lable">
                        <input id="retiree" type="checkbox" name="retiree">Retiree
                    </label>
                    <label class="box_lable">
                        <input id="other" type="checkbox" name="other">Other
                    </label>
                    <input id="other_text" type="text" name="other_text">
                </div>
            </div>
            <label class="text_lable">*Terms with multiple sessions are considered one academic term for tuition waiver
                purposes e.g.,
                summer sessions I and II are considered one academic term.</label>
        </div>

        <div id="section2" class="container">
            <h2>Section2</h2>
            <div class="left3">
                <label for="student_name">Student's Name:</label>
                <input id="student_name" type="text" name="student_name">
            </div>

            <div class="middle3">
                <label for="relationship_to_employee">Relationship to Employee:</label>
                <select id="relationship_to_employee" name="relationship_to_employee">
                    <option value="student">Student</option>
                </select>
            </div>

            <div class="right3">
                <label for="student_nuid">Student's NUID:</label>
                <input id="student_nuid" type="text" name="student_nuid">
            </div>

            <div class="left">
                <label for="employee_name">Employee's Name(if different from Student's):</label>
                <input id="employee_name" type="text" name="employee_name">
            </div>

            <div class="right">
                <label for="employee_nuid">Employee's NUID:</label>
                <input id="employee_nuid" type="text" name="employee_nuid">
            </div>

            <div>
                <label for="department_div">Department:</label>
                <div id="department_div">
                    <select id="department" name="department">
                        <option value="BCOHS">Bouvé College of Health Sciences</option>
                        <option value="COAMD">College of Arts, Media and Design</option>
                        <option value="KCOCS">Khoury College of Computer Sciences</option>
                        <option value="COE">College of Engineering</option>
                        <option value="CPS">College of Professional Studies</option>
                        <option value="COS">College of Science</option>
                        <option value="COSSH">College of Social Sciences and Humanities</option>
                        <option value="DSOB">D'Amore-McKim School of Business</option>
                        <option value="SOL">School of Law</option>
                    </select>
                </div>

            </div>

            <div>
                <label for="campus_location">Campus Location:</label>
                <select id="campus_location" name="campus_location">
                    <option value="boston">Boston</option>
                    <option value="charlotte">Charlotte</option>
                    <option value="burlington">Burlington</option>
                    <option value="portland">Portland</option>
                    <option value="nahant">Nahant</option>
                    <option value="san_francisco">San Francisco</option>
                    <option value="seattle">Seattle</option>
                    <option value="silicon_valley">Silicon Valley</option>
                    <option value="toronto">Toronto</option>
                    <option value="vancouver">Vancouver</option>
                </select>
            </div>

            <div>
                <label for="phone_number">Phone Number:</label>
                <input id="phone_number" type="text" name="phone_number">
            </div>

            <div>
                <label for="supervisor_name">Supervisor's Name:</label>
                <input id="supervisor_name" type="text" name="supervisor_name">
            </div>
        </div>

        <div id="section3" class="container">
            <h2>Section3</h2>
            <label for="school_program">Indicate the applicable school or program: </label>
            <div id="school_program" class="programs_container">
                <label class="box_lable">
                    <input id="udergraduate_program" type="checkbox" name="udergraduate_program">Undergraduate Program
                </label>
                <label class="box_lable">
                    <input id="law_school" type="checkbox" name="law_school">Law School
                </label>
                <label class="box_lable">
                    <input id="doctoral_candidate" type="checkbox" name="doctoral_candidate">Doctoral Candidate
                </label>
                <label class="box_lable">
                    <input id="cps_undergraduate" type="checkbox" name="cps_undergraduate">College of Professional
                    Studies(CPS)
                    Undergraduate
                </label>
                <label class="box_lable">
                    <input id="graduate_school" type="checkbox" name="graduate_school">Graduate School
                </label>
                <label class="box_lable">
                    <input id="cps_graduate" type="checkbox" name="cps_graduate">CPS Graduate School
                </label>
            </div>
            <div class="center"><label class="text_lable">*One course per academic term may be taken one-half hour before the end of
                your workday. If this
                applies to you, this form must be signed by your supervisor below and approved by Human Resources
                Management.</label>
            </div>
            <div class="center"><label class="text_lable">*Complete the following course information. If you are an employee taking a
                job related course,
                please attach the Job Related Designation Form to this waiver.</label>
            </div>


            <div class="courses_container">
                <div>
                    <label class="course_nu1">Course No.
                    </label>
                    <input id="course_nu1" type="text" name="course_nu1">
                </div>

                <div>
                    <label class="course_name1">Course Name
                    </label>
                        <input id="course_name1" type="text" name="course_name1">
                </div>
                <div>
                    <label class="supervisor_signature1">Supervisor Signature
                    </label>
                        <input id="supervisor_signature1" type="text" name="supervisor_signature1">
                </div>
                <div>
                    <label class="credit_hrs1">Credit Hrs.
                    </label>
                        <input id="credit_hrs1" type="text" name="credit_hrs1">
                </div>
                <div>
                    <label class="days1">Day(s)
                    </label>
                        <input id="days1" type="text" name="days1">
                </div>
                <div>
                    <label class="time1">Time
                    </label>
                        <input id="time1" type="text" name="time1">
                </div>
            </div>
            <div class="courses_container">
                <div>
                    <label class="course_nu2">Course No.
                    </label>
                    <input id="course_nu2" type="text" name="course_nu2">
                </div>

                <div>
                    <label class="course_name2">Course Name
                    </label>
                    <input id="course_name2" type="text" name="course_nu2">
                </div>
                <div>
                    <label class="supervisor_signature2">Supervisor Signature
                    </label>
                    <input id="supervisor_signature2" type="text" name="supervisor_signature2">
                </div>
                <div>
                    <label class="credit_hrs2">Credit Hrs.
                    </label>
                    <input id="credit_hrs2" type="text" name="credit_hrs2">
                </div>
                <div>
                    <label class="days2">Day(s)
                    </label>
                    <input id="days2" type="text" name="days2">
                </div>
                <div>
                    <label class="time2">Time
                    </label>
                    <input id="time2" type="text" name="time2">
                </div>
            </div>
            <div class="courses_container">
                <div>
                    <label class="course_nu3">Course No.
                    </label>
                    <input id="course_nu3" type="text" name="course_nu3">
                </div>

                <div>
                    <label class="course_name3">Course Name
                    </label>
                    <input id="course_name3" type="text" name="course_nu3">
                </div>
                <div>
                    <label class="supervisor_signature3">Supervisor Signature
                    </label>
                    <input id="supervisor_signature3" type="text" name="supervisor_signature3">
                </div>
                <div>
                    <label class="credit_hrs3">Credit Hrs.
                    </label>
                    <input id="credit_hrs3" type="text" name="credit_hrs3">
                </div>
                <div>
                    <label class="days3">Day(s)
                    </label>
                    <input id="days3" type="text" name="days3">
                </div>
                <div>
                    <label class="time3">Time
                    </label>
                    <input id="time3" type="text" name="time3">
                </div>
            </div>

            <div>

            </div>
        </div>
        <div id="section4" class="container">
            <input type="submit" value="Submit">
        </div>

    </div>
</form>
</body>
</html>
