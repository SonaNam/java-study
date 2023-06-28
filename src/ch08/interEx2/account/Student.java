package ch08.interEx2.account;

public class Student implements Gradable {
    int score = 95;

    @Override
    public void calculateGrade() {
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        }else {
            System.out.println("재응시");
        }


    }
}