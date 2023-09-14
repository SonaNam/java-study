package ch07.extend.person.Course;

public class LectureCourse extends Course{

    private String room;
    private int time;


    public LectureCourse(String courseName, String courseCode, String instructor,String room,int time) {
        super(courseName, courseCode, instructor);
        this.room = room;
        this.time = time;
    }

    public String getRoom() {
        return this.room;
    }

    public int getTime() {
        return this.time;
    }
}





