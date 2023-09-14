package ch07.extend.person;
//인간정보
public class Person {
    String name;
    int age;

    public Person(String name, int age){  // ! ! 부모
        this.name = name;
        this.age = age;
    }


    // 개인정보 출력
    public void introduce(){
        System.out.println("안녕하세요. 제 이름은" + name + "이고, 나이는" + age +"살 입니다.");

//        public  void teach(){ System.out.println(name + "이(가) 강의를 시작합니다.");
//
//
//        }public void work() {
//            if(this instanceof Sutdent) {
//                ((Sutdent) this).study();
//            } else if (this instanceof Lecturer){
//                ((Lecture)) this).teach();
//            }


    }
    }
