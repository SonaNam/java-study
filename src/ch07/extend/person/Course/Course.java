package ch07.extend.person.Course;

public class Course {
    private String courseName;     // private 필수
    private String courseCode;
    private String instructor;

    public Course(String courseName,String courseCode,String instructor){
     this.courseName = courseName;
     this.courseCode = courseCode;
     this.instructor = instructor;


 }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getInstructor() {
        return instructor;
    }
}

