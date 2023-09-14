package ch07.extend.person.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course> courses;//        courses (Course 배열)


    public CourseManager() {
        this.courses = new ArrayList<>();
    }



    public void addCourse(Course course) {
        this.courses.add(course);
    }


    public void printCourses(){
        for (Course course : this.courses) {
            System.out.println("이름은 : " + course.getCourseName());
        }
    }



}
