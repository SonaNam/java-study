package ch07.extend.person;

public class Lecturer extends Person{
    private int careerTerm;
    public Lecturer(String name, int age, int careerTerm){
        super(name,age);
        this.careerTerm= careerTerm;
    }
    @Override
    public void introduce() {
        System.out.println("저의 강의 경력은" + this.careerTerm + "년입니다.");
    }

    }

