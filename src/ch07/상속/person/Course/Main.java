package ch07.상속.person.Course;

public class Main {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        Course course1 = new OnlineCourse("Java","00001","김성우","naver");
        courseManager.addCourse(course1);
        courseManager.printCourses();

    }
}
