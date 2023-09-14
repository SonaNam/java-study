package test;

public class UserEX {
    String name;
    int age;
    String email;
    UserEX(String name,int age,String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public UserEX() {
        UserEX uu = new UserEX();
        uu.setEmail("kkhk82@naver.com");
    }

    void setName(String newName){
        name = newName;
    }public String getName(){
        return name;
    }void setAge(int newAge){
        age = newAge;
    }
    void setEmail(String newEmail){
        email = newEmail;
    }public String getEmail(){
        return email;
    }
    {
    }

    public int getAge() {
        return age;

    }
    void promoteage() {
        age++;
    }

    void UserInfo(){
    System.out.println("Name" + name + "age" + age + "email" + email);
}
}


