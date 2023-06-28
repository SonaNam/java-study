package 연습;

public class StudentEx {
    String Name;
    int grade;
    int age;
    void setName(String newname){
        Name = newname;
    }void setGrade(int newgrade){
        grade = newgrade;
        grade++;
    }void setAge(int newage){
        age = newage;
        System.out.println("name" + Name +"grade" + grade + "age" + age);

    }void StudensInfo(String name, int grade, int age){

    }

}


