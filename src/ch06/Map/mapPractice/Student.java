package ch06.Map.mapPractice;
class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
