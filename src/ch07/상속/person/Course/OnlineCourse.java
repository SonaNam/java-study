package ch07.상속.person.Course;

public class OnlineCourse extends Course {
    private String platform;

    public OnlineCourse(String courseName, String courseCode, String instructor,String platform) {
        super(courseName, courseCode, instructor);
        this.platform = platform;

    }

    public String getPlatform() {
        return platform;
    }
}
