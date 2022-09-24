/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author HP
 */
public class Faculty_evaluation {
    private String Faculty_Name ;
    private String Course  ;
    private String Delivery_of_subjectSemester;
    private String Use_of_audio_visual_aids;
    private String Use_of_web_based_modules;
    private String Classroom_exercise;
    private String Tutorials_Tests_Assignments;
    private String Practical_Demonstration;
    private String Making_the_course_interesting;
  private String Motivating_the_students;
  private String Cooperation_with_students;
  private String Response_to_question;
  private String Impartiality_in_evaluation;
  private String Any_other_Comment_for_improvement;

    public Faculty_evaluation() {
    }

    public Faculty_evaluation(String Faculty_Name, String Course, String Delivery_of_subjectSemester, String Use_of_audio_visual_aids, String Use_of_web_based_modules, String Classroom_exercise, String Tutorials_Tests_Assignments, String Practical_Demonstration, String Making_the_course_interesting, String Motivating_the_students, String Cooperation_with_students, String Response_to_question, String Impartiality_in_evaluation, String Any_other_Comment_for_improvement) {
        this.Faculty_Name = Faculty_Name;
        this.Course = Course;
        this.Delivery_of_subjectSemester = Delivery_of_subjectSemester;
        this.Use_of_audio_visual_aids = Use_of_audio_visual_aids;
        this.Use_of_web_based_modules = Use_of_web_based_modules;
        this.Classroom_exercise = Classroom_exercise;
        this.Tutorials_Tests_Assignments = Tutorials_Tests_Assignments;
        this.Practical_Demonstration = Practical_Demonstration;
        this.Making_the_course_interesting = Making_the_course_interesting;
        this.Motivating_the_students = Motivating_the_students;
        this.Cooperation_with_students = Cooperation_with_students;
        this.Response_to_question = Response_to_question;
        this.Impartiality_in_evaluation = Impartiality_in_evaluation;
        this.Any_other_Comment_for_improvement = Any_other_Comment_for_improvement;
    }

    public String getFaculty_Name() {
        return Faculty_Name;
    }

    public void setFaculty_Name(String Faculty_Name) {
        this.Faculty_Name = Faculty_Name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getDelivery_of_subjectSemester() {
        return Delivery_of_subjectSemester;
    }

    public void setDelivery_of_subjectSemester(String Delivery_of_subjectSemester) {
        this.Delivery_of_subjectSemester = Delivery_of_subjectSemester;
    }

    public String getUse_of_audio_visual_aids() {
        return Use_of_audio_visual_aids;
    }

    public void setUse_of_audio_visual_aids(String Use_of_audio_visual_aids) {
        this.Use_of_audio_visual_aids = Use_of_audio_visual_aids;
    }

    public String getUse_of_web_based_modules() {
        return Use_of_web_based_modules;
    }

    public void setUse_of_web_based_modules(String Use_of_web_based_modules) {
        this.Use_of_web_based_modules = Use_of_web_based_modules;
    }

    public String getClassroom_exercise() {
        return Classroom_exercise;
    }

    public void setClassroom_exercise(String Classroom_exercise) {
        this.Classroom_exercise = Classroom_exercise;
    }

    public String getTutorials_Tests_Assignments() {
        return Tutorials_Tests_Assignments;
    }

    public void setTutorials_Tests_Assignments(String Tutorials_Tests_Assignments) {
        this.Tutorials_Tests_Assignments = Tutorials_Tests_Assignments;
    }

    public String getPractical_Demonstration() {
        return Practical_Demonstration;
    }

    public void setPractical_Demonstration(String Practical_Demonstration) {
        this.Practical_Demonstration = Practical_Demonstration;
    }

    public String getMaking_the_course_interesting() {
        return Making_the_course_interesting;
    }

    public void setMaking_the_course_interesting(String Making_the_course_interesting) {
        this.Making_the_course_interesting = Making_the_course_interesting;
    }

    public String getMotivating_the_students() {
        return Motivating_the_students;
    }

    public void setMotivating_the_students(String Motivating_the_students) {
        this.Motivating_the_students = Motivating_the_students;
    }

    public String getCooperation_with_students() {
        return Cooperation_with_students;
    }

    public void setCooperation_with_students(String Cooperation_with_students) {
        this.Cooperation_with_students = Cooperation_with_students;
    }

    public String getResponse_to_question() {
        return Response_to_question;
    }

    public void setResponse_to_question(String Response_to_question) {
        this.Response_to_question = Response_to_question;
    }

    public String getImpartiality_in_evaluation() {
        return Impartiality_in_evaluation;
    }

    public void setImpartiality_in_evaluation(String Impartiality_in_evaluation) {
        this.Impartiality_in_evaluation = Impartiality_in_evaluation;
    }

    public String getAny_other_Comment_for_improvement() {
        return Any_other_Comment_for_improvement;
    }

    public void setAny_other_Comment_for_improvement(String Any_other_Comment_for_improvement) {
        this.Any_other_Comment_for_improvement = Any_other_Comment_for_improvement;
    }
  }